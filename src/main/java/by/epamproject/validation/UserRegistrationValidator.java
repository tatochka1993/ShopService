package by.epamproject.validation;

import by.epamproject.dto.object.UserRegistrationDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
//import ru.focus.group.dto.client.object.UserRegistrationDto;

@Component
public class UserRegistrationValidator implements Validator { //

    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegistrationDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {

//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "company", "error", "Ошибка! Поле не может быть пустым!");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "registrationNumber", "error", "Ошибка! Поле не может быть пустым!");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryId", "error", "Ошибка! Поле не может быть пустым!");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "regionId", "error", "Ошибка! Поле не может быть пустым!");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cityId", "error", "Ошибка! Поле не может быть пустым!");

        UserRegistrationDto userFormDto = (UserRegistrationDto) obj;

        if (!"".equals(userFormDto.getPassword1())) {
            if (userFormDto.getPassword1().length() < 4) {
                errors.rejectValue("password1", "error", "Ошибка! Пароль не может быть меньше 4 символов!");
            }
            if (userFormDto.getPassword1().length() > 16) {
                errors.rejectValue("password1", "error", "Ошибка! Пароль не может быть больше 16 символов!!");
            }
        } else {
            errors.rejectValue("password1", "error", "Ошибка! Поле не может быть пустым!");
        }
        if (!"".equals(userFormDto.getPassword2())) {
            if (userFormDto.getPassword2().length() < 4) {
                errors.rejectValue("password2", "error", "Ошибка! Пароль не может быть меньше 4 символов!!");
            }
            if (userFormDto.getPassword2().length() > 16) {
                errors.rejectValue("password2", "error", "Ошибка! Пароль не может быть больше 16 символов!!");
            }
            if (!userFormDto.getPassword1().equals(userFormDto.getPassword2())) {
                errors.rejectValue("password2", "error", "Ошибка! Пароли не сопадают!");
            }
        } else {
            errors.rejectValue("password2", "error", "Ошибка! Поле не может быть пустым!");
        }
    }

}
