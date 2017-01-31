package by.epamproject.dto.mapper.impl;

import by.epamproject.dto.mapper.RoleMapper;
import by.epamproject.dto.object.RoleDto;
import by.epamproject.model.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto roleToRoleDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        return roleDto;
    }

    @Override
    public Role roleDtoToRole(RoleDto roleDto) {
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setName(roleDto.getName());
        return role;
    }

    @Override
    public List<RoleDto> rolesToRoleDtos(List<Role> roleList) {
        if (roleList == null)
            return null;

        List<RoleDto> roleDtoList = new ArrayList<>();
        for (Role role : roleList)
            roleDtoList.add(roleToRoleDto(role));
        return roleDtoList;
    }

    @Override
    public List<Role> roleDtosToRoles(List<RoleDto> roleDtoList) {
        if (roleDtoList == null)
            return null;

        List<Role> roleList = new ArrayList<>();
        for (RoleDto roleDto : roleDtoList)
            roleList.add(roleDtoToRole(roleDto));
        return roleList;
    }
}
