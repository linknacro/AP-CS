/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colosseum_fighter;

/**
 *
 * @author Link
 */
public abstract class Item
{

    private String description;
    private int amount;
    private String graphics;

    public Item(String description, int amount, String graphics)
    {
        this.description = description;
        this.amount = amount;
        this.graphics = graphics;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public String getGraphics()
    {
        return graphics;
    }

    public void setGraphics(String graphics)
    {
        this.graphics = graphics;
    }

    public abstract void function(Player guy);
    
    public abstract void effect(Fighter guy);

    public String toString()
    {
        return graphics;
    }
}
