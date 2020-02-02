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
import java.util.Scanner;
public class ShoppingSimulator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("*********************************");
        System.out.println("Welcome to the shopping simulator");
        System.out.println("*********************************");
        System.out.println("");
        String answer = "y"; 
        ShoppingCart thisCart = new ShoppingCart(5);
        
        while (answer.equals("y")){
            System.out.println("What item do you want to purchase?");
            String name = scan.next();
            System.out.println("How many of it?");
            int quantity = scan.nextInt();
            System.out.println("What is the price of the item?");
            double price = scan.nextDouble();
            
            thisCart.addToCart(name, price, quantity);
            System.out.println(thisCart);
            if (thisCart.getCapacity() == thisCart.getNumItems()){
                System.out.println("Do you want to increase the size of the cart?");
                answer = scan.next();
                if (answer.equals("y")){
                    thisCart.increaseSize();
                }
                else {
                    break;
                }
            }
            System.out.println("Do you want to keep shopping?");
            answer = scan.next();
        }
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Please pay $" + thisCart.getTotal());
        System.out.println("Thank you for Shopping!");
        System.out.println("-----------------------------------");
    }
}
