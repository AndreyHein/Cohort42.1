package lesson23.homeWork;

import java.util.List;

public class FromWareHouse extends BaseDocument {
    public FromWareHouse(int id) {
        super(id);
    }

    public void add (Order order) {
        products = order.getProducts();
    }

    public void fromWarehouse (Warehouse warehouse) {
        warehouse.deleteAll(products);
    }

}
