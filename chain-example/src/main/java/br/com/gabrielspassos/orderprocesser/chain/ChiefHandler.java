package br.com.gabrielspassos.orderprocesser.chain;

import br.com.gabrielspassos.orderprocesser.Exceptions.MyException;
import br.com.gabrielspassos.orderprocesser.model.Order;
import br.com.gabrielspassos.orderprocesser.model.Supplier;

public class ChiefHandler extends Handler {

    public ChiefHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order, String context) {
        if(canHandlePrice(order)){
            if (canHandleSupplier(order)){
                context = "can handle this order";
                return "Chief " + context;
            }
            return context = "Cheif can't handle this order, because the supplier isn't special";
        }else{
            context = "Cheif can't handle this order, because this order is under than R$1000";
            //throw new MyException(context);
            return context;
        }
    }

    @Override
    public boolean canHandlePrice(Order order) {
        return (order.getPrice() >= 1000);

    }

    @Override
    public boolean canHandleSupplier(Order order) {
        return order.getSupplier().getType().equals("special");

    }
}
