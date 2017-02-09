package by.epamproject.controller;

import by.epamproject.dto.object.UserDto;
import by.epamproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import by.epamproject.utils.JSONParser;

@RestController
public class LoginController {


    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> loginUserAccount(@RequestBody String user) {

        System.out.println(user);
        UserDto userDto = JSONParser.convertJsonStringToObject(user, UserDto.class);

        if (!userService.isUserExist(userDto)) {
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }

}
