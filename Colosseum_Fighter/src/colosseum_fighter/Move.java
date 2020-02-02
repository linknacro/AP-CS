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
public class Move
{
    private String name;
    private double power;
    private double cost;

    public Move(String name, double power, double cost)
    {
        this.name = name;
        this.power = power;
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPower()
    {
        return power;
    }

    public void setPower(double power)
    {
        this.power = power;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    
    public String toString()
    {
        return name;
    }
    
    
}
