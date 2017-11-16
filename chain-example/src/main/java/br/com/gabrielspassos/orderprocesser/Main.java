package br.com.gabrielspassos.orderprocesser;

import br.com.gabrielspassos.orderprocesser.chain.Handler;
import br.com.gabrielspassos.orderprocesser.factory.ChainFactory;
import br.com.gabrielspassos.orderprocesser.model.Order;
import br.com.gabrielspassos.orderprocesser.model.Supplier;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
            Logic of roles:
                - sales man (can approve sales until $300)
                - manager (can approve sales greater than $300)
                - chief (can approve sales greater than $1000)

            Logic of suppliers
                - sales man can handle only normal stuff
                - manager can handle with normal AND special stuff
                - chief handle only with special stuff
        */

        Supplier supplier1 = new Supplier("Net","normal");
        Supplier supplier2 = new Supplier("Google","special");
        Supplier supplier3 = new Supplier("CEEE","normal");

        Order order1 = new Order(1,200,3,supplier2);
        Order order2 = new Order(2, 500,5,supplier2);
        Order order3 = new Order(3, 110,2,supplier3);
        Order order4 = new Order(4,670,4,supplier3);
        Order order5 = new Order(5, 190,1,supplier2);
        Order order6 = new Order(6, 110,4,supplier1);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);

        Handler chain = ChainFactory.createChain();
        String context = "this cant appear";
        for (Order order:
             orderList) {

                System.out.println("Product id: "+order.getId()+" Product final price: R$"+order.getPrice()
                        +"\tSupplier name: "+order.getSupplier().getName() +
                        "\tSupplier type: "+order.getSupplier().getType()+"\tWho handled: "+ chain.handle(order,context)+"\n");
        }

    }
}
