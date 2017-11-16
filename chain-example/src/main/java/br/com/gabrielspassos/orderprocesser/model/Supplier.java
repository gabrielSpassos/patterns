package br.com.gabrielspassos.orderprocesser.model;

public class Supplier {
    private String name;
    private String type;

    public Supplier(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
