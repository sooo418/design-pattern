package abstractfactory.domain.product.dao.mysql;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDao;

public class ProductMysqlDao implements ProductDao {

    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySQL DB userId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into MySQL DB userId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MySQL DB userId = " + product.getProductId());
    }
}
