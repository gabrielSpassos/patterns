package br.com.gabrielspassos.orderprocesser.model;

public class Order {

    private int id;
    private int unityPrice;
    private int quantity;
    private Supplier supplier;


    public Order(int id, int unityPrice, int quantity, Supplier supplier) {
        this.id = id;
        this.unityPrice = unityPrice;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public Supplier getSupplier() {
        return supplier;
    }
    public int getPrice(){
        return this.unityPrice * this.quantity;
    }


}
