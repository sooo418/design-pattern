package abstractfactory.domain.product.dao;

import abstractfactory.domain.product.Product;

public interface ProductDao {

    public void insertProduct(Product product);
    public void deleteProduct(Product product);
    public void updateProduct(Product product);

}
