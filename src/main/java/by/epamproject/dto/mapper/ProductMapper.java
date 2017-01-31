package by.epamproject.dto.mapper;

import by.epamproject.dto.object.ProductDto;
import by.epamproject.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {

    ProductDto productToProductDto(Product product);

    Product productDtoToProduct(ProductDto productDto);

    List<ProductDto> productsToProductDtos(List<Product> productList);

    List<Product> productDtosToProducts(List<ProductDto> productDtoList);
}
