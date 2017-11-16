package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;

public class ChiefHandler extends Handler {

    public ChiefHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order, String context) {

        if (canHandleSupplier(order)){
            context = "can handle this order";
            return "Chief " + context;
        }

        return context = "Cheif can't handle this order, because the supplier isn't special";
    }

    @Override
    public boolean cantHandlePrice(Order order) {
        return !(order.getPrice() >= 1000);

    }

    @Override
    public boolean canHandleSupplier(Order order) {
        return order.getSupplier().getType().equals("special");

    }
}
