package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;

public class ChiefHandler extends Handler {

    public ChiefHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order) {
        return "Chief";
    }


    @Override
    public boolean canHandle(Order order) {
        return order.getPrice() >= 1000;
    }
}
