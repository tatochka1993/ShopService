package by.epamproject.controller;

import by.epamproject.dto.object.BasketDto;
import by.epamproject.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> addToBasket(@RequestBody String userId, @RequestBody String productId) {

        int userIdInt = Integer.valueOf(userId);
        int productIdInt = Integer.valueOf(productId);

        BasketDto basketDto = new BasketDto();
        basketDto.setUserId(userIdInt);
        basketDto.setProductId(productIdInt);

        basketService.saveBasket(basketDto);

        return new ResponseEntity<Void>(HttpStatus.OK);

    }

}
