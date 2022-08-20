package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.Application.*;

public class Run {

    public static void main(String[] args) {

        methodDemo(products, findByProductNameStartB, print);
        methodDemo(products, findByStock0, print);
        methodDemo(products, dobleconditionactionabove100Below150, print);
        methodDemo(products,chargeUpThePrice,null);

    }

}