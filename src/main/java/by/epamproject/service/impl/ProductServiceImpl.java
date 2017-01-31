package by.epamproject.service.impl;

import by.epamproject.dao.ProductDao;
import by.epamproject.dto.mapper.ProductMapper;
import by.epamproject.dto.object.ProductDto;
import by.epamproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductDto getProductById(int id) {
        return productMapper.productToProductDto(productDao.getProductById(id));
    }

    @Override
    public List<ProductDto> getAllProduct() {
        return productMapper.productsToProductDtos(productDao.getAllProduct());
    }

    @Override
    public void saveProduct(ProductDto productDto) {
        productDao.saveProduct(productMapper.productDtoToProduct(productDto));
    }

    @Override
    public void updateProduct(ProductDto productDto) {
        productDao.updateProduct(productMapper.productDtoToProduct(productDto));
    }

    @Override
    public void deleteProduct(ProductDto productDto) {
        productDao.deleteProduct(productMapper.productDtoToProduct(productDto));
    }
}
