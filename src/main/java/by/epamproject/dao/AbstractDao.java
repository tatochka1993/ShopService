package by.epamproject.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDao<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    private Query query;

    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    @Autowired
    protected SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    protected T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }

    protected void save(T entity) {
        getSession().persist(entity);
    }

    protected void delete(T entity) {
        getSession().delete(entity);
    }

    protected List<T> getAllObjects() {
        return getSession()
                .createQuery("FROM " + persistentClass.getName() + " nameClass ORDER BY nameClass.id ASC")
                .list();
    }

    protected List<T> findListByHQL(String hql) {
        return getSession()
                .createQuery(hql)
                .list();
    }

    protected T findByHQL(String hql) {
        return (T) getSession()
                .createQuery(hql)
                .uniqueResult();
    }

    protected void update(T entity) {
        getSession().update(entity);
    }


}