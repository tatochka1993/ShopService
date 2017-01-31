package by.epamproject.service;

import by.epamproject.dto.object.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto getProductById(int id);

    List<ProductDto> getAllProduct();

    void saveProduct(ProductDto productDto);

    void updateProduct(ProductDto productDto);

    void deleteProduct(ProductDto productDto);

}


