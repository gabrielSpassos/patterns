package br.com.gabrielspassos.orderprocesser.chain;


import br.com.gabrielspassos.orderprocesser.model.Order;

public class ManagerHandler extends Handler {

    public ManagerHandler(Handler next) {
        super(next);
    }

    @Override
    public String handle(Order order) {
        if(canHandle(order)){
            return "Manager";
        }else{
            return getNext().handle(order);
        }
    }

    @Override
    public boolean canHandle(Order order) {
        return  order.getPrice()>=300 && order.getPrice()<1000;

    }
}
