package org.lesson.java.shop;

public class Television extends Product {
    int size;
    boolean smart;

    public Television(int code, String brand, String details, double price, int vat, int size, boolean smart) {
        super(code, brand, details, price, vat);
        this.size = size;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Television{" +
                "size=" + size +
                ", smart=" + smart +
                '}';
    }
}
