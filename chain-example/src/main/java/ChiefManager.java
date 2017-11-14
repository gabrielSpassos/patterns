public class ChiefManager extends IHandler {

    public ChiefManager(IHandler next) {
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
