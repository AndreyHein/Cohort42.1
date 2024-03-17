package lesson23.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Order extends BaseDocument{
    private int id;
    private List<ProductAndCount> products;

    public Order(int id) {
        super(id);
    }
}
