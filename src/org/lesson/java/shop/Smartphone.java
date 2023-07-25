package org.lesson.java.shop;

public class Smartphone extends Product {

    long imeiCode;
    int memory;

    public Smartphone(int code, String brand, String details, double price, int vat, long imeiCode, int memory) {
        super(code, brand, details, price, vat);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imeiCode=" + imeiCode +
                ", memory=" + memory +
                '}';
    }
}
