/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author 19502
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{

    public static void main(String[] args)
    {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        ArrayList<Item> cart = new ArrayList<Item>();

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        
        do {
            System.out.println("Enter the name of the item: ");
            itemName = scan.next();
            
            System.out.println("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            
            System.out.println("Enter the quantity: ");
            quantity = scan.nextInt();
            
            item = new Item(itemName, itemPrice, quantity);
            
            cart.add(item);
            
            double total = 0;
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(cart.get(i));
                total += cart.get(i).getPrice() * cart.get(i).getQuantity();
            }
            System.out.println("Total Price:   $" + total);
            
            System.out.println("Continue shopping (y/n)?");
            keepShopping = scan.next();
        }    
        while (keepShopping.equals("y"));
    }
}
