package br.com.gabrielspassos.orderprocesser.model;

public class Order {

    private int id;
    private int unityPrice;
    private int quantity;
    private String role;

    public Order(int id, int unityPrice, int quantity, String role) {
        this.id = id;
        this.unityPrice = unityPrice;
        this.quantity = quantity;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public int getPrice(){
        return this.unityPrice * this.quantity;
    }
}
