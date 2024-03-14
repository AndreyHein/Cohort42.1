package lesson23.homeWork;

public class HomeWork23 {
    public static void main(String[] args) {
        Product laptop = new Product("Lenovo T590", 1000);
        Product tv = new Product("Samsung 34'", 800);

        Warehouse warehouse = new Warehouse();

        ToWareHouse toWareHouse = new ToWareHouse(1);
        toWareHouse.add(laptop, 50);
        toWareHouse.add(tv, 50);
        toWareHouse.toWarehouse(warehouse);
        System.out.println(warehouse);

        Order order = new Order(2);
        order.add(laptop, 10);
        order.add(tv, 5);

        FromWareHouse fromWareHouse = new FromWareHouse(3);
        fromWareHouse.add(order);
        fromWareHouse.fromWarehouse(warehouse);
        System.out.println(warehouse);
    }
}
