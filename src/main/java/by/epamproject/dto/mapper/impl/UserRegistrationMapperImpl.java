package by.epamproject.dto.mapper.impl;

import by.epamproject.dto.mapper.RoleMapper;
import by.epamproject.dto.mapper.UserRegistrationMapper;
import by.epamproject.dto.object.UserRegistrationDto;
import by.epamproject.model.Role;
import by.epamproject.model.User;
import by.epamproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRegistrationMapperImpl implements UserRegistrationMapper {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;

    @Override
    public UserRegistrationDto userToUserRegistrationDto(User user) {
        if (user != null) {
            UserRegistrationDto userRegistrationDto = new UserRegistrationDto();

            userRegistrationDto.setId(user.getId());
            userRegistrationDto.setRoleId(user.getRole().getId());
            userRegistrationDto.setLogin(user.getLogin());
            userRegistrationDto.setPassword1(user.getPassword());
            userRegistrationDto.setPassword2(user.getPassword());
            userRegistrationDto.setFirstName(user.getFirstName());
            userRegistrationDto.setLastName(user.getLastName());
            userRegistrationDto.setCity(user.getCity());

            return userRegistrationDto;
        }
        return null;
    }

    @Override
    public User userRegistrationDtoToUser(UserRegistrationDto userRegistrationDto) {
        User user = new User();

        user.setId(userRegistrationDto.getId());
        user.setRole(getRoleById(userRegistrationDto.getRoleId()));
        user.setPassword(userRegistrationDto.getPassword1());
        user.setFirstName(userRegistrationDto.getFirstName());
        user.setLastName(userRegistrationDto.getLastName());
        user.setCity(userRegistrationDto.getCity());
        return user;
    }

    @Override
    public List<UserRegistrationDto> usersToUserRegistrationDtos(List<User> usersList) {
        if (usersList == null)
            return null;

        List<UserRegistrationDto> userRegistrationDtoList = new ArrayList<>();
        for (User user : usersList)
            userRegistrationDtoList.add(userToUserRegistrationDto(user));
        return userRegistrationDtoList;
    }

    @Override
    public List<User> userRegistrationDtosToUsers(List<UserRegistrationDto> userRegistrationDtoList) {
        if (userRegistrationDtoList == null)
            return null;

        List<User> usersList = new ArrayList<>();
        for (UserRegistrationDto userRegistrationDto : userRegistrationDtoList)
            usersList.add(userRegistrationDtoToUser(userRegistrationDto));
        return usersList;
    }

    private Role getRoleById(int id) {
        return roleMapper.roleDtoToRole(roleService.getRoleById(id));
    }

}
