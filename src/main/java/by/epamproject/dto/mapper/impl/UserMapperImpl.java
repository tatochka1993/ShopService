package by.epamproject.dto.mapper.impl;

import by.epamproject.dto.mapper.RoleMapper;
import by.epamproject.dto.mapper.UserMapper;
import by.epamproject.dto.object.UserDto;
import by.epamproject.model.Role;
import by.epamproject.model.User;
import by.epamproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;

    @Override
    public UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setRoleId(user.getRole().getId());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }

    @Override
    public User userDtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());

        user.setRole(getRoleById(userDto.getRoleId()));
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }

    @Override
    public List<UserDto> usersToUserDtos(List<User> userList) {
        if (userList == null)
            return null;

        List<UserDto> userDtoList = new ArrayList<>();
        for (User user : userList)
            userDtoList.add(userToUserDto(user));
        return userDtoList;
    }

    @Override
    public List<User> userDtosToUsers(List<UserDto> userDtoList) {
        if (userDtoList == null)
            return null;

        List<User> userList = new ArrayList<>();
        for (UserDto userDto : userDtoList)
            userList.add(userDtoToUser(userDto));
        return userList;
    }

    private Role getRoleById(int id) {
        return roleMapper.roleDtoToRole(roleService.getRoleById(id));
    }
}
