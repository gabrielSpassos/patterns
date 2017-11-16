package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;

public class SalesmanHandler extends Handler {

    public SalesmanHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order, String context) {
        if(cantHandlePrice(order)) {
            return getNext().handle(order, context);
        }

        if (canHandleSupplier(order)){
            context = "can handle this order";
            return "Salesman " + context;
        }
        return context = "Salesman can't handle this order, because the supplier isn't normal";

    }

    @Override
    public boolean cantHandlePrice(Order order) {
        return !(order.getPrice() < 300);

    }

    @Override
    public boolean canHandleSupplier(Order order) {
        return order.getSupplier().getType().equals("normal");

    }
}
