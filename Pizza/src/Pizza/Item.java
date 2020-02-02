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
public abstract class Item 
{
    private double price;
    private String description;
    private char size;
    

    public Item(double price, String description, char size)
    {
        this.price = price;
        this.description = description;
        this.size = size;
    }

    public double getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }

    public char getSize()
    {
        return size;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    
    
    
    public abstract String toString();
}
