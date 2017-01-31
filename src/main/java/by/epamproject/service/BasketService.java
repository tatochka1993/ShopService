package by.epamproject.service;

import by.epamproject.dto.object.BasketDto;

public interface BasketService {

    BasketDto getBasketById(int id);

    void saveBasket(BasketDto basketDto);

    BasketDto getBasketByUserId(int userId);

}
