package by.epamproject.dao.impl;

import by.epamproject.dao.AbstractDao;
import by.epamproject.dao.UserDao;
import by.epamproject.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

    @Override
    public List<User> getAllUser() {
        return getAllObjects();
    }

    @Override
    public User getUserById(int id) {
        return getByKey(id);
    }

    @Override
    public User getUserByLogin(String login) {
        return findByHQL("FROM User C WHERE C.login like \'" + login + "\'");
    }

    @Override
    public void saveUser(User user) {
        save(user);
    }

    @Override
    public void updateUser(User user) {
        update(user);
    }

    @Override
    public void deleteUser(User user) {
        delete(user);
    }

}
