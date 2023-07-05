package abstractfactory.domain.product.dao.oracle;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into ORACLE DB userId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into ORACLE DB userId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into ORACLE DB userId = " + product.getProductId());
    }
}
