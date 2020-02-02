/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author 19502
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Order
{

    private boolean isDelivery;
    private final int DELIVERY_FEE = 3;
    private ArrayList cart = new <Item>ArrayList();
    private double total = 0;

    public void placeOrder()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("Welcome to our Pizza Restaurant!!!");
        System.out.println("************************************");
        System.out.println("What size of a pizza would you like? (s/m/l)");
        char size = scan.next().charAt(0);
        System.out.println("Would you like thick or thin crust? (thick/thin)");
        String crust = scan.next();
        Pizza p = new Pizza(10, size, crust);
        System.out.println("------------------------------------");
        System.out.println("What would you like to add to your pizza?");
        System.out.println("We have: ");
        for (int i = 0; i < p.getTopping().size(); i++) {
            System.out.println((i + 1) + ". " + p.getTopping().get(i));
        }
        System.out.println("------------------------------------");
        double toppingPrice = 0;
        String answer = "y";
        while (answer.equals("y")) {
            System.out.println("Which number would you like to add?");
            int num = scan.nextInt();
            p.getToppingOnPizza().add(p.getTopping().get(num - 1));
            System.out.println("Would you like to keep adding? (y/n)");
            answer = scan.next();
        }
        for (int i = 0; i < p.getToppingOnPizza().size(); i++) {
            toppingPrice += ((Topping) (p.getToppingOnPizza().get(i))).getPrice();
        }
        p.setPrice(p.getPrice() + toppingPrice);
        cart.add(p);
        System.out.println("////////////////////////////////////");
        System.out.println("\n\nWould you like any drinks? (y/n)");
        answer = scan.next();
        if (answer.equals("y")) {
            System.out.println("Would you like beer or soda? (b/s)");
            String type;
            answer = scan.next();
            if (answer.equals("s")) {
                type = "soda";
            }
            else {
                type = "beer";
            }
            System.out.println("what drink size would you like? (s/m/l)");
            char dSize = scan.next().charAt(0);
            cart.add(new Drink(type, dSize));
        }
        System.out.println("");
        System.out.println("Would you like a delivery? (y/n)");
        answer = scan.next();
        isDelivery = answer.equals("y");
        printReceipt();
    }

    private void printReceipt()
    {
        System.out.println("************************************");
        System.out.println("Here is your receipt");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i) + "\n");
            total += ((Item) (cart.get(i))).getPrice();
        }
        System.out.println("------------------------------------");
        System.out.println("SUBTOTAL: $" + total);
        if (isDelivery) {
            System.out.println("Delivery Fee: $" + DELIVERY_FEE);
            total += DELIVERY_FEE;
        }
        System.out.println("TOTAL: $" + total);
        System.out.println("Enjoy your meal!!!");
        System.out.println("************************************");
    }
}
