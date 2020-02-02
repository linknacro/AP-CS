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
public class Topping
{

    private int price;
    private String description;

    public Topping(String description, int price)
    {
        this.price = price;
        this.description = description;
    }

    public int getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }
    
    public String toString(){
        return description + "    $" + price; 
    }
}
