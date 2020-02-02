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
import java.util.ArrayList;

public class Pizza extends Item
{

    private String crustType;
    private ArrayList topping = new ArrayList<Topping>()
    {
        {
            add(new Topping("Pepperoni", 2));
            add(new Topping("BBQ", 3));
            add(new Topping("Extra Cheese", 2));
            add(new Topping("Kimchi", 20));
            add(new Topping("Onion", 1));
        }
    };
    private ArrayList toppingOnPizza = new <Topping>ArrayList();
    private double sPrice = 10;
    private double mPrice = 13;
    private double lPrice = 16;

    public Pizza(double price, char size, String crustType)
    {
        super(price, "Pizza", size);
        this.crustType = crustType;
        if (size == 's'){
            setPrice(sPrice);
        }
        if (size == 'm'){
            setPrice(mPrice);
        }
        if (size == 'l'){
            setPrice(lPrice);
        }
    }

    public ArrayList getToppingOnPizza()
    {
        return toppingOnPizza;
    }

    public ArrayList getTopping()
    {
        return topping;
    }

    public String toString()
    {
        return "Pizza    " + " Size: " + getSize() + "\nToppings: " + toppingOnPizza + "\nPrice: $" + getPrice();
    }
}
