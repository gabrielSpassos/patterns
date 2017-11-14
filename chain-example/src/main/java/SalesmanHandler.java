public class SalesmanHandler extends IHandler {

    public SalesmanHandler(IHandler next) {
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
