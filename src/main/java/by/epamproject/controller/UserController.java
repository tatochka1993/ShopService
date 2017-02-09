package by.epamproject.controller;

import by.epamproject.dto.object.UserDto;
import by.epamproject.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<String> getAllUsers() {

        List<UserDto> usersDtoList = userService.getAllUsers();
        Gson gson = new Gson();
        String jsonUsersList = gson.toJson(usersDtoList);

        return new ResponseEntity<>(jsonUsersList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity getUserById(@PathVariable int id) throws Exception {
        UserDto userDto = userService.getUserById(id);

        Gson gson = new Gson();
        String jsonUserDto = gson.toJson(userDto);
        return new ResponseEntity<>(jsonUserDto, HttpStatus.OK);
    }

}
