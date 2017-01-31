package by.epamproject.dao;

import by.epamproject.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User getUserById(int id);

    User getUserByLogin(String login);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}
