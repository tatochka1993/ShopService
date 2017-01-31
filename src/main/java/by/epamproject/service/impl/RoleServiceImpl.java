package by.epamproject.service.impl;

import by.epamproject.dao.RoleDao;
import by.epamproject.dto.mapper.RoleMapper;
import by.epamproject.dto.object.RoleDto;
import by.epamproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleDto getRoleById(int id) {
        return roleMapper.roleToRoleDto(roleDao.getRoleById(id));
    }
}
