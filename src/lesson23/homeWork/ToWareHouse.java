package lesson23.homeWork;

import java.util.ArrayList;
import java.util.List;

public class ToWareHouse extends BaseDocument{

    public ToWareHouse(int id) {
        super(id);
    }

    public void toWarehouse(Warehouse warehouse) {
        warehouse.addAll(products);
    }
}
