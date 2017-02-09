package by.epamproject.service;

import by.epamproject.dto.object.UserDto;

import java.util.List;

public interface UserService {

    UserDto getUserById(int id);

    UserDto getUserByLogin(String login);

    List<UserDto> getAllUsers();

    void saveUser(UserDto userDto);

    void updateUser(UserDto userDto);

    void deleteUser(UserDto userDto);

    boolean isUserExist(UserDto userDto);

}
