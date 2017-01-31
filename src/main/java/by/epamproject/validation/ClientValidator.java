package by.epamproject.validation;

import by.epamproject.dto.object.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ClientValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return UserDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mail", "error", "Ошибка! Поле не может быть пустым!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error", "Ошибка! Поле не может быть пустым!");

        UserDto userDto = (UserDto) obj;
        if (userDto != null) {
            if (userDto.getPassword().length() < 4) {
                errors.rejectValue("password", "error", "Ошибка! Пароль должен быть не меньше 4 символов!");
            } else {
                if (userDto.getPassword().length() > 16) {
                    errors.rejectValue("password", "error", "Ошибка! Пароль должен быть не больше 16 символов!");
                }
            }
        }
    }

}
