package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;
import br.com.gabrielspassos.orderprocesser.model.Supplier;

public class ManagerHandler extends Handler {

    public ManagerHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order,String context) {
        if(canHandlePrice(order)){
            if (canHandleSupplier(order)){
                context = "can handle this order";
                return "Manager " + context;
            }
            return context = "Manager can't handle this order, because of type of supplier"; //this can't happen
        }else{
            context = "Manager can't handle this order, because this order is over R$1000";
            return getNext().handle(order, context);
        }
    }

    @Override
    public boolean canHandlePrice(Order order) {
        return (order.getPrice() < 1000);

    }

    @Override
    public boolean canHandleSupplier(Order order) {
        return order.getSupplier().getType().equals("normal") || order.getSupplier().getType().equals("special");

    }
}
