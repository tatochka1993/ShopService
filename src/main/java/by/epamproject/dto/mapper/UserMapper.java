package by.epamproject.dto.mapper;

import by.epamproject.dto.object.UserDto;
import by.epamproject.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);

    List<UserDto> usersToUserDtos(List<User> userList);

    List<User> userDtosToUsers(List<UserDto> userDtoList);
}
