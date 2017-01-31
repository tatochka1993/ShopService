package by.epamproject.service.impl;

import by.epamproject.dao.BasketDao;
import by.epamproject.dto.mapper.BasketMapper;
import by.epamproject.dto.object.BasketDto;
import by.epamproject.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("basketService")
@Transactional
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketDao basketDao;
    @Autowired
    private BasketMapper basketMapper;

    @Override
    public BasketDto getBasketById(int id) {
        return basketMapper.basketToBasketDto(basketDao.getBasketById(id));
    }

    @Override
    public void saveBasket(BasketDto basketDto) {
        basketDao.saveBasket(basketMapper.basketDtoToBasket(basketDto));
    }

    @Override
    public BasketDto getBasketByUserId(int userId) {
        return basketMapper.basketToBasketDto(basketDao.getBasketByUserId(userId));
    }
}
