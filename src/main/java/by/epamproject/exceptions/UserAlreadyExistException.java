package by.epamproject.exceptions;

/**
 * Created by Tatsiana on 07.02.17.
 */
public class UserAlreadyExistException extends RuntimeException {

    private String message;

    public UserAlreadyExistException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
