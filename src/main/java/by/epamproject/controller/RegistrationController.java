package by.epamproject.controller;

import by.epamproject.dto.object.UserDto;
import by.epamproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import by.epamproject.utils.JSONParser;

import javax.servlet.http.HttpServletResponse;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> registerUserAccount(@RequestBody String user, HttpServletResponse response) {

        UserDto userDto = JSONParser.convertJsonStringToObject(user, UserDto.class);
        System.out.println(userDto);

        if (!userService.isUserExist(userDto)) {
            userService.saveUser(userDto);
            return new ResponseEntity<>(HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
