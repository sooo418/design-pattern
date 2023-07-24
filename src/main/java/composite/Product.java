package composite;

public class Product extends ProductCategory {
    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public void addProduct(ProductCategory product) {

    }

    @Override
    public void removeProduct(ProductCategory product) {

    }
}
