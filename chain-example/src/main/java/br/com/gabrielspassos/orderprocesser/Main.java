package br.com.gabrielspassos.orderprocesser;

import br.com.gabrielspassos.orderprocesser.chain.Handler;
import br.com.gabrielspassos.orderprocesser.factory.ChainFactory;
import br.com.gabrielspassos.orderprocesser.model.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
            Logic of roles:
                - sales man (can approve sales until $300)
                - manager (can approve sales greater than $300)
                - chief (can approve sales greater than $1000)
        */

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

        Handler chain = ChainFactory.createChain();
        for (Order order:
             orderList) {
            System.out.println("Product id: "+order.getId()+" Product final price: R$"+order.getPrice()
                                +"\tOrigin role: "+order.getRole()+"\t\tWho handled: "+ chain.handle(order));
        }

    }
}
