package by.epamproject.dao;

import by.epamproject.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAllProduct();

    Product getProductById(int id);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);


}
