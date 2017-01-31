package by.epamproject.dto.mapper;

import by.epamproject.dto.object.UserRegistrationDto;
import by.epamproject.model.User;

import java.util.List;

public interface UserRegistrationMapper {

    UserRegistrationDto userToUserRegistrationDto(User user);

    User userRegistrationDtoToUser(UserRegistrationDto userRegistrationDto);

    List<UserRegistrationDto> usersToUserRegistrationDtos(List<User> usersList);

    List<User> userRegistrationDtosToUsers(List<UserRegistrationDto> userRegistrationDtoList);

}
