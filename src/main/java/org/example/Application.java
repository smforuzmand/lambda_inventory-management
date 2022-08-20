package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static Conditional findByStock0 = p -> p.getStock() == 0;
    public static Conditional findByProductNameStartB = p -> p.getProductName().startsWith("B");
    //public static Conditional findProductPriceAbove100Below150 = p -> p
    public static Action print = p -> System.out.println(p);


public static void methodDemo (List<Product> productList , Conditional filter , Action action){

    for (Product p :
            productList) {
        if (filter.test(p)) {
            action.execute(p
             );
        }
    }
}


    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(
                Arrays.asList(
                        new Product("GearBox", 2300.4, 5),
                        new Product("Steer", 120, 125),
                        new Product("RearLight", 87, 524),
                        new Product("Suspension", 1855, 18))
        );
    methodDemo(products,findByProductNameStartB,print);

    }
}