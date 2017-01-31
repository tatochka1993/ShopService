package by.epamproject.controller;

import by.epamproject.dto.object.UserDto;
import by.epamproject.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<String> getAllUsers(HttpServletResponse response) {

        List<UserDto> usersDtoList = userService.getAllUsers();
        Gson gson = new Gson();
        String jsonUsersList = gson.toJson(usersDtoList);

        response.addHeader("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(jsonUsersList, HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity getProductById(@PathVariable int id, HttpServletResponse response) throws Exception {
        UserDto userDto = userService.getUserById(id);

        Gson gson = new Gson();
        String jsonUserDto = gson.toJson(userDto);
        response.addHeader("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(jsonUserDto, HttpStatus.OK);
    }

}
