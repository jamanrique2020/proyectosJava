/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package exercise_04_2;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;        
        
        // Declare and initialize numeric fields: price, tax, and quantity.   
        // Declare a total field but do not initialize total.
        double price = 12.3;
        double tax = 45.14;
        int quantity = 1;
        double total;
        // Modify message to include quantity  
        message = custName +" wants to purchase " + quantity +" " +itemDesc; ;
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price*quantity*tax;
        System.out.println("El costo total con impuesto es:" + total);
        
    }
}
