package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;

public class ManagerHandler extends Handler {

    public ManagerHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order,String context) {
        if(cantHandlePrice(order)) {
            return getNext().handle(order, context);
        }

        if (canHandleSupplier(order)){
            context = "can handle this order";
            return "Manager " + context;
        }

        return context = "Manager can't handle this order, because of type of supplier"; //this can't happen
    }

    @Override
    public boolean cantHandlePrice(Order order) {
        return !(order.getPrice() < 1000);

    }

    @Override
    public boolean canHandleSupplier(Order order) {
        return order.getSupplier().getType().equals("normal") || order.getSupplier().getType().equals("special");

    }
}
