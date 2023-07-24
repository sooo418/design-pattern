package composite;

import java.util.ArrayList;

public class Category extends ProductCategory {

    private ArrayList<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        list = new ArrayList<>();
    }

    @Override
    public int getCount() {
        int count = 0;

        for (ProductCategory product : list) {
            count += product.getCount();
        }

        return count;
    }

    @Override
    public int getPrice() {
        int price = 0;

        for (ProductCategory product : list) {
            price += product.getPrice();
        }

        return price;
    }

    @Override
    public void addProduct(ProductCategory product) {
        list.add(product);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        for (ProductCategory temp : list) {
            if (temp.getId() == temp.getId()) {
                list.remove(temp);
                return;
            }
        }
        System.out.println("no product");
    }
}
