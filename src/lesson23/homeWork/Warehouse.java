package lesson23.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<ProductAndCount> products;

    public Warehouse() {
        products = new ArrayList<>();
    }

    public void addAll(List<ProductAndCount> products) {
        // TODO analise and find some problem
        for (ProductAndCount pac : products) {
            Product product = pac.getProduct();
            int count = pac.getCount();
            boolean found = false;
            for (ProductAndCount wpac : this.products) {
                if (wpac.getProduct().equals(product)) {
                    // check if we can decrease count of product
                    if (wpac.getCount() >= count) {
                        wpac.setCount(wpac.getCount() + count);
                        found = true;
                        break;
                    } else {

                    }
                    //wpac.setCount(wpac.getCount() - pac.getCount());
                }
            }
            if (!found) {
                //TODO exception: product not found
            }
        }

    }

    public void deleteAll(List<ProductAndCount> products) {
        //TODO check count etc
        for (ProductAndCount pac : products) {
            Product p = pac.getProduct();
            int count = pac.getCount();
            boolean found = false;
            for (ProductAndCount wpac : this.products) {
                if (wpac.getProduct().equals(p)) {
                    // check if we can decrease count of product
                    if (wpac.getCount() >= count) {
                        wpac.setCount(wpac.getCount() - count);
                        found = true;
                        break;
                    } else {

                    }
                    //wpac.setCount(wpac.getCount() - pac.getCount());
                }
            }
            if (!found) {
                //TODO exception: product not found
            }
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" + products + '}';
    }
}
