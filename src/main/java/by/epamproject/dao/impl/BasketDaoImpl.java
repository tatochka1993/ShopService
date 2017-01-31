package by.epamproject.dao.impl;

import by.epamproject.dao.AbstractDao;
import by.epamproject.dao.BasketDao;
import by.epamproject.model.Basket;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("basketDao")
public class BasketDaoImpl extends AbstractDao<Integer, Basket> implements BasketDao {

    @Override
    public Basket getBasketById(int basketId) {
        return getByKey(basketId);
    }

    @Override
    public Basket getBasketByUserId(int userId) {
        return findByHQL("FROM Basket C WHERE C.user like \'" + userId + "\'");
    }

    @Override
    public void saveBasket(Basket basket) {
        save(basket);
    }
}
