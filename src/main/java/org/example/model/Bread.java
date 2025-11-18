package org.example.model;

public class Bread extends ProductForSale{
    private boolean salty;
    private String color;

    public Bread(String type, double price, String description, boolean salty, String color) {
        super(type, price, description);
        this.salty = salty;
        this.color = color;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "salty=" + salty +
                ", color='" + color + '\'' +
                '}';
    }
}
