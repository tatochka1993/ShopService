package by.epamproject.dto.mapper.impl;

import by.epamproject.dto.mapper.BasketMapper;
import by.epamproject.dto.mapper.ProductMapper;
import by.epamproject.dto.mapper.UserMapper;
import by.epamproject.dto.object.BasketDto;
import by.epamproject.model.Basket;
import by.epamproject.model.Product;
import by.epamproject.model.User;
import by.epamproject.service.ProductService;
import by.epamproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BasketMapperImpl implements BasketMapper {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductService productService;

    @Override
    public BasketDto basketToBasketDto(Basket basket) {
        BasketDto basketDto = new BasketDto();
        basketDto.setId(basket.getId());
        basketDto.setUserId(basket.getUser().getId());
        basketDto.setProductId(basket.getProduct().getId());
        return basketDto;
    }

    @Override
    public Basket basketDtoToBasket(BasketDto basketDto) {
        Basket basket = new Basket();
        basket.setId(basketDto.getId());
        basket.setProduct(getProductById(basketDto.getProductId()));
        basket.setUser(getUserById(basketDto.getUserId()));
        return basket;
    }

    @Override
    public List<BasketDto> basketsToBasketDtos(List<Basket> basketList) {
        if (basketList == null)
            return null;

        List<BasketDto> basketDtoList = new ArrayList<>();
        for (Basket basket : basketList)
            basketDtoList.add(basketToBasketDto(basket));
        return basketDtoList;
    }

    @Override
    public List<Basket> basketDtosToBaskets(List<BasketDto> basketDtoList) {
        if (basketDtoList == null)
            return null;

        List<Basket> basketList = new ArrayList<>();
        for (BasketDto basketDto : basketDtoList)
            basketList.add(basketDtoToBasket(basketDto));
        return basketList;
    }

    private Product getProductById(int id) {
        return productMapper.productDtoToProduct(productService.getProductById(id));
    }

    private User getUserById(int id) {
        return userMapper.userDtoToUser(userService.getUserById(id));
    }

}
