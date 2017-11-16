package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.model.Order;
import br.com.gabrielspassos.orderprocesser.model.Supplier;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract String handle(Order order, String context);

    public Handler getNext(){
        return next;
    }

    protected abstract boolean canHandlePrice(Order order);

    protected abstract boolean canHandleSupplier(Order order);


}
