package by.epamproject.dao;

import by.epamproject.model.Basket;

public interface BasketDao {

    Basket getBasketById(int basketId);

    Basket getBasketByUserId(int userId);

    void saveBasket(Basket basket);
}
