package by.epamproject.dto.mapper;

import by.epamproject.dto.object.BasketDto;
import by.epamproject.model.Basket;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BasketMapper {

    BasketDto basketToBasketDto(Basket basket);

    Basket basketDtoToBasket(BasketDto basketDto);

    List<BasketDto> basketsToBasketDtos(List<Basket> basketList);

    List<Basket> basketDtosToBaskets(List<BasketDto> basketDtoList);
}
