package composite;

public abstract class ProductCategory {
    protected int id;
    protected String name;
    protected int price;

    public ProductCategory(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract int getCount();
    final public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    final public int getId() {
        return id;
    }

    public abstract void addProduct(ProductCategory product);
    public abstract void removeProduct(ProductCategory product);
}
