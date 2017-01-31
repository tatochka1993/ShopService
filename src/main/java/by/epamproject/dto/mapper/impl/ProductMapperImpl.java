package by.epamproject.dto.mapper.impl;

import by.epamproject.dto.mapper.ProductMapper;
import by.epamproject.dto.object.ProductDto;
import by.epamproject.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto productToProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setNameProduct(product.getNameProduct());
        productDto.setDescription(product.getDescription());
        productDto.setNameImage(product.getNameImage());
        productDto.setServerNameImage(product.getServerNameImage());
        return productDto;
    }

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setNameProduct(productDto.getNameProduct());
        product.setDescription(productDto.getDescription());
        product.setNameImage(productDto.getNameImage());
        product.setServerNameImage(productDto.getServerNameImage());
        return product;
    }

    @Override
    public List<ProductDto> productsToProductDtos(List<Product> productList) {
        if (productList == null)
            return null;

        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList)
            productDtoList.add(productToProductDto(product));
        return productDtoList;
    }

    @Override
    public List<Product> productDtosToProducts(List<ProductDto> productDtoList) {
        if (productDtoList == null)
            return null;

        List<Product> productList = new ArrayList<>();
        for (ProductDto productDto : productDtoList)
            productList.add(productDtoToProduct(productDto));
        return productList;
    }
}
