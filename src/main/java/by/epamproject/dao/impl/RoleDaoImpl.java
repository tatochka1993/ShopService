package by.epamproject.dao.impl;

import by.epamproject.dao.AbstractDao;
import by.epamproject.dao.RoleDao;
import by.epamproject.model.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao<Integer, Role> implements RoleDao {

    @Override
    public Role getRoleById(int roleId) {
        return getByKey(roleId);
    }

}
