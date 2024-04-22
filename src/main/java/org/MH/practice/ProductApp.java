package org.MH.practice;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void process(List<Product> list, Condition condition, Action action)
    {
        for (Product product : list){
            boolean result = condition.test(product);
            if (result) {
                action.execute(product);
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("IPhone x", 5000,1);
        Product product2 = new Product("IPhone 8 ", 3000,20);
        Product product3 = new Product("IPhone 9 ", 2000,0);
        Product product4 = new Product("IPhone 12 ", 6000,5);
        Product product5 = new Product("Boot", 2500,0);
        Product product6 = new Product("bosh", 2500,0);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);

        // TODO: Print out all products that have stock value of 0.
        System.out.println("________Stock value of 0_________");
        Condition conditionForStockZero = product -> product.getStock() == 0;
        Action printProduct = product -> System.out.println(product.toString());
        process(products, conditionForStockZero, printProduct);
        System.out.println("________Products that starts with B_________");
        // TODO: Print out the productName of all the Products that starts with B.
        Condition startWithB = product -> product.getName().toUpperCase().startsWith("B");
        Action productName = product -> System.out.println(product.getName());
        process(products, startWithB, productName);
        System.out.println("_________________");


    }

}
