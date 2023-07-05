package abstractfactory.client;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDao;
import abstractfactory.domain.userinfo.UserInfo;
import abstractfactory.domain.userinfo.dao.UserInfoDao;
import abstractfactory.factory.DaoFactory;
import abstractfactory.factory.MySqlDaoFactory;
import abstractfactory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis =
                new FileInputStream(
                        "C:\\Users\\ehdwn\\study\\DesignPattern\\src\\main\\resources\\db.properties"
                );
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DB_TYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("테스트");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;
        UserInfoDao userInfoDao = null;
        ProductDao productDao = null;

        if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else if (dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else {
            System.out.println("db support error");
            return;
        }

        userInfoDao = daoFactory.createUserInfoDao();
        productDao = daoFactory.createProductDao();

        System.out.println("==USERINFO TRANSACTION==");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);

        System.out.println("==PRODUCT TRANSACTION==");
        productDao.insertProduct(product);
        productDao.deleteProduct(product);
        productDao.updateProduct(product);
    }
}
