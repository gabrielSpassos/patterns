public abstract class IHandler {
    private IHandler next;

    public IHandler(IHandler next) {
        this.next = next;
    }

    abstract String handle(Order order);

    public IHandler getNext(){
        return next;
    }

    protected abstract boolean canHandle(Order order);

}
