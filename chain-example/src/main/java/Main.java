import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(1,200,3,"manager");
        Order order2 = new Order(2, 500,5,"chief");
        Order order3 = new Order(3, 110,2,"salesman");
        Order order4 = new Order(4,670,4,"chief");
        Order order5 = new Order(5, 190,1,"salesman");
        Order order6 = new Order(6, 110,4,"manager");

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);

        ChiefManager chiefManager = new ChiefManager(null);
        ManagerHandler managerHandler = new ManagerHandler(chiefManager);
        SalesmanHandler salesmanHandler = new SalesmanHandler(managerHandler);

        for (Order order:
             orderList) {
            System.out.println("Product id: "+order.getId()+" Product final price: R$"+order.getPrice()
                                +"\tWho handled: "+salesmanHandler.handle(order));
        }

    }
}
