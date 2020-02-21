/* Copyright © 2018 Oracle and/or its affiliates. All rights reserved. */
package exercise_05_1;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        boolean outOfStock = true;
        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        if (quantity > 1) {
            message = message + "s";

        }
        if (outOfStock == false) {
            System.out.println("El articulo "+ itemDesc+" no esta disponible");
        } else {
            total = quantity * price * tax;
            System.out.println(message);
            System.out.println("El total con impuesto es: "+total);
        }

        // Test quantity and modify message if quantity > 1.
        // Declare outOfStock variable and initialize it.
        // Test outOfStock and notify user in either case.
    }
}
