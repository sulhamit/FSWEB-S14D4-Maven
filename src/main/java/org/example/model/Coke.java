package org.example.model;

public class Coke extends ProductForSale{
    private boolean hasKaffein;
    private boolean hasSugar;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, boolean hasKaffein, boolean hasSugar) {
        super(type, price, description);
        this.hasKaffein = hasKaffein;
        this.hasSugar = hasSugar;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasKaffein=" + hasKaffein +
                ", hasSugar=" + hasSugar +
                '}';
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }
}
