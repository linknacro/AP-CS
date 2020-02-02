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
import java.text.NumberFormat;

public class ShoppingCart
{

    private int itemCount;
    private double totalPrice;
    private int capacity;
    private Item[] cart;

    public ShoppingCart(int capacity)
    {
        this.capacity = capacity;
        totalPrice = 0;
        itemCount = 0;
        cart = new Item[capacity];
    }

    public void addToCart(String itemName, double price, int quantity)
    {
        cart[itemCount] = new Item(itemName, price, quantity);
        totalPrice += quantity * price;
        itemCount++;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String contents = "\nShopping Cart\n";
        contents += "\nItems   Unit Price    Quatity    Total\n";

        for (int i = 0; i < itemCount; i++)
        {
            contents += cart[i].toString() + "\n";
        }

        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";

        return contents;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getNumItems(){
        return itemCount;
    }
    
    public double getTotal(){
        return totalPrice;
    }
    
    public void increaseSize()
    {
        Item[] temp = new Item[cart.length + 3];
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
    }
}
