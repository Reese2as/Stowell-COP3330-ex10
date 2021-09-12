/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int Item1, Item2, Item3, Price1, Price2, Price3, Quantity1, Quantity2, Quantity3;
        float  Subtotal, Total, Tax;
        final float tax_percentage = 0.055F;

        System.out.print("Enter the Price of item 1? ");
        Price1 = user_input.nextInt();
        System.out.print("Enter the Quantity of item 1? ");
        Quantity1 = user_input.nextInt();
        System.out.print("Enter the Price of item 2? ");
        Price2 = user_input.nextInt();
        System.out.print("Enter the Quantity of item 2? ");
        Quantity2 = user_input.nextInt();
        System.out.print("Enter the Price of item 3? ");
        Price3 = user_input.nextInt();
        System.out.print("Enter the Quantity of item 3? ");
        Quantity3 = user_input.nextInt();

        Item1=(Price1*Quantity1);
        Item2=(Price2*Quantity2);
        Item3=(Price3*Quantity3);
        Subtotal=(Item1+Item2+Item3);
        Tax=(Subtotal*tax_percentage);
        Total=(Subtotal+Tax);

        System.out.println(String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",Subtotal,Tax,Total));
    }
}
