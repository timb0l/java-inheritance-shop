package org.lesson.java.shop;

public class Headset extends Product {
    String color;
    boolean wireless;


    // CONSTRUCTORS
    public Headset(int code, String brand, String details, double price, int vat, String color, boolean wireless) {
        super(code, brand, details, price, vat);
        this.color = color;
        this.wireless = wireless;
    }


    // METHODS

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
