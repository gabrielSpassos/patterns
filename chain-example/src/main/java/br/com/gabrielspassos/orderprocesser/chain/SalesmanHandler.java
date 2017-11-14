package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;

public class SalesmanHandler extends Handler {

    public SalesmanHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order) {
        if(canHandle(order)){
            return "Salesman";
        }else{
            return getNext().handle(order);
        }
    }

    @Override
    public boolean canHandle(Order order) {
        return order.getPrice()<300;
    }
}
