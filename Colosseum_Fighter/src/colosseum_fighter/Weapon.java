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
public class Weapon extends Equipment
{

    private double atk;

    public Weapon(int atk, String description, String graphics)
    {
        super(description, graphics);
        this.atk = atk;
    }

    public void function(Player guy)
    {
        guy.setAtk(guy.getAtk() + atk);
    }
    
    public void effect(Fighter guy)
    {
        System.out.println(guy.getName() + " gained " + getAmount() + " boost in Atk");
    }
}
