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
public class Healing_Item extends Item
{

    public Healing_Item(String description, int amount, String graphics)
    {
        super(description, amount, graphics);
    }

    public void function(Player guy)
    {
        guy.setCurrentHp(guy.getCurrentHp() + getAmount());
    }

    public void effect(Fighter guy)
    {
        System.out.println(guy.getName() + " retored " + getAmount() + " HP");
    }
}
