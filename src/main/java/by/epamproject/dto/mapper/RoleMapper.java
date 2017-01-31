package by.epamproject.dto.mapper;

import by.epamproject.dto.object.RoleDto;
import by.epamproject.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper {

    RoleDto roleToRoleDto(Role role);

    Role roleDtoToRole(RoleDto roleDto);

    List<RoleDto> rolesToRoleDtos(List<Role> roleList);

    List<Role> roleDtosToRoles(List<RoleDto> roleDtoList);
}
