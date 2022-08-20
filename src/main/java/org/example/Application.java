package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product("GearBox", 2300, 5),
                    new Product("Steer", 120, 125),
                    new Product("RearLight", 87, 524),
                    new Product("Suspension", 1855, 18),
                    new Product("Brake", 148, 0),
                    new Product("exhust", 59, 7))
    );

    public static Conditional findByStock0 = p -> p.getStock() == 0;
    public static Conditional findByProductNameStartB = p -> p.getProductName().startsWith("B");


    //Print out all Products that have price above 100 AND lower than 150
   public static Conditional dobleconditionactionabove100Below150 = p -> {
        List<Product> matching = new ArrayList<>();
        if (p.getPrice() > 100 && p.getPrice() < 150) {
            matching.add(p);
            //matching.forEach(products -> System.out.println(products));
            //System.out.println("Other way to print out");
            matching.forEach(System.out::println);
        }
        return false;
    };


    //Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
    public static Conditional chargeUpThePrice = p -> {
        List<Product> productsToChargeUp = new ArrayList<>();
        if (p.getStock() < 10 && p.getPrice() > 0) {
            p.setPrice(p.getPrice() * 1.5);
            productsToChargeUp.add(p);
            productsToChargeUp.forEach(System.out::println);

        }
        return false;
    };

    public static Action print = p -> System.out.println(p);


    public static void methodDemo(List<Product> productList, Conditional condition, Action action) {

        for (Product p :
                productList) {
            if (condition.test(p)) {
                action.execute(p
                );
            }
        }

    }



}