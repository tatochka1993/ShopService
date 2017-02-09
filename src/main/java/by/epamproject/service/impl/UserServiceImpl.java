package by.epamproject.service.impl;

import by.epamproject.dao.UserDao;
import by.epamproject.dto.mapper.UserMapper;
import by.epamproject.dto.object.UserDto;
import by.epamproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto getUserById(int id) {
        return userMapper.userToUserDto(userDao.getUserById(id));
    }

    @Override
    public UserDto getUserByLogin(String login) {
        return userMapper.userToUserDto(userDao.getUserByLogin(login));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userMapper.usersToUserDtos(userDao.getAllUser());
    }

    @Override
    public void saveUser(UserDto userDto) {
        userDao.saveUser(userMapper.userDtoToUser(userDto));
    }

    @Override
    public void updateUser(UserDto userDto) {
        userDao.updateUser(userMapper.userDtoToUser(userDto));
    }

    @Override
    public void deleteUser(UserDto userDto) {
        userDao.deleteUser(userMapper.userDtoToUser(userDto));
    }

    @Override
    public boolean isUserExist(UserDto userDto) {
        if (userDao.getUserByLogin(userDto.getLogin()) != null ) {
            if (userDao.getUserByLogin(userDto.getLogin()).getRole().getId() == 2 && userDao.getUserByLogin(userDto.getLogin()).getPassword().equals(userDto.getPassword())) {
                return true;
            }
            return false;
        }
        return false;
    }

//    @Override
//    public boolean isLibrarianExist(User user) {
//        if (userDao.findByLogin(user.getLogin()) != null && userDao.findByLogin(user.getLogin()) != null) {
//            if (userDao.findByLogin(user.getLogin()).getRole().getId() == 1 && userDao.findByLogin(user.getLogin()).getPassword().equals(user.getPassword())) {
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }

}
