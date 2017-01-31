package by.epamproject.dao.impl;

import by.epamproject.dao.AbstractDao;
import by.epamproject.dao.ProductDao;
import by.epamproject.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("productDao")
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements ProductDao {

    @Override
    public List<Product> getAllProduct() {
        return getAllObjects();
    }

    @Override
    public Product getProductById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveProduct(Product product) {
        save(product);
    }

    @Override
    public void updateProduct(Product product) {
        update(product);
    }

    @Override
    public void deleteProduct(Product product) {
        delete(product);
    }
}
