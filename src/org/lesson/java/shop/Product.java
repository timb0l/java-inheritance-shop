package org.lesson.java.shop;

public class Product {
    // FIELDS
    private int code;
    private String brand;
    private String details;
    private double price;
    private int vat;


    // CONSTRUCTORS
    public Product(int code, String brand, String details, double price, int vat) {
        this.code = code;
        this.brand = brand;
        this.details = details;
        this.price = price;
        this.vat = vat;
    }


    // GETTERS AND SETTERS
    public int getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }


    // METHODS
    public double calcPrice(){
        return price;
    }

    public double calcPriceVat(){
        double vatPrice = price * vat / 100;
        return price + vatPrice;
    }


    public String calcCode(){
        String codeString = Integer.toString(code);
        char o = '0';
        for (int i = 0; i < codeString.length(); i++){
            while (codeString.length() < 9){
                codeString += 0;
                i++;
            }
        } return codeString;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + brand + '\'' +
                ", description='" + details + '\'' +
                ", price=" + price +
                ", iva=" + vat +
                '}';
    }
}
