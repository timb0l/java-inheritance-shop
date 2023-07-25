package org.lesson.java.shop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Product> productsArray = new ArrayList<>();

        System.out.println("Welcome");
        boolean exit = false;
        while (!exit){
            System.out.println("Select product: 1-Smartphone 2-SmartTV 3-Headset 4-Exit");
            String choice = scan.nextLine();
            switch (choice) {


                case "1":
                    System.out.println("Smartphone Details");
                        int phoneCode = random.nextInt();
                    System.out.print("Enter Brand: ");
                        String phoneBrand = scan.nextLine();
                    System.out.print("Insert Details: ");
                        String phoneDetails = scan.nextLine();
                    System.out.print("Price: ");
                        double phonePrice = Double.parseDouble(scan.nextLine());
                    System.out.print("VAT: ");
                        int phoneVAT = Integer.parseInt(scan.nextLine());
                    long imeiCode = random.nextLong();
                    System.out.print("Enter Memory: ");
                        int phoneMem = Integer.parseInt(scan.nextLine());

                    Smartphone userPhone = new Smartphone(phoneCode,phoneBrand,phoneDetails,phonePrice,phoneVAT,imeiCode, phoneMem);
                    productsArray.add(userPhone);
                    System.out.println("Cart: " + productsArray);
                    break;


                case "2":
                    System.out.println("SmartTV Details");
                        int tvCode = random.nextInt();
                    System.out.print("Enter Brand: ");
                        String tvBrand = scan.nextLine();
                    System.out.print("Insert Details: ");
                        String tvDetails = scan.nextLine();
                    System.out.print("Price: ");
                        double tvPrice = Double.parseDouble(scan.nextLine());
                    System.out.print("VAT: ");
                        int tvVAT = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter Size: ");
                        int tvSize = Integer.parseInt(scan.nextLine());

                    System.out.print("Is it a smart tv? Y/N");
                    String smartChoice = scan.nextLine();
                    boolean tvSmart;
                    tvSmart = smartChoice.equalsIgnoreCase("Y");

                    Television usersmartTV = new Television(tvCode, tvBrand, tvDetails, tvPrice, tvVAT, tvSize, tvSmart);
                    productsArray.add(usersmartTV);
                    System.out.println("Cart: " + productsArray);
                    break;


                case "3":
                    System.out.println("Headset Details");
                        int headsetCode = random.nextInt();
                    System.out.print("Enter Brand: ");
                        String headsetBrand = scan.nextLine();
                    System.out.print("Insert Details: ");
                        String headsetDetails = scan.nextLine();
                    System.out.print("Price: ");
                        double headsetPrice = Double.parseDouble(scan.nextLine());
                    System.out.print("VAT: ");
                        int headsetVAT = Integer.parseInt(scan.nextLine());
                    System.out.print("Color: ");
                        String headsetColor = scan.nextLine();
                    System.out.print("Is it wireless? Y/N");
                        String headphonesChoice = scan.nextLine();
                    boolean wireless;
                    wireless = headphonesChoice.equalsIgnoreCase("Y");

                    Headset userHeadset = new Headset(headsetCode, headsetBrand, headsetDetails, headsetPrice, headsetVAT, headsetColor, wireless);
                    productsArray.add(userHeadset);
                    System.out.println("Your cart: " + productsArray);
                    break;

                case "4":
                    System.out.println("See you!");
                    exit = true;

                default:
                    System.out.println("Try Again");
                    break;

            }
        }
    }
}
