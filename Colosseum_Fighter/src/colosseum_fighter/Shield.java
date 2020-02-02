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
public class Shield extends Equipment
{

    private double def;

    public Shield(double def, String description, String graphics)
    {
        super(description, graphics);
        this.def = def;
    }

    public void function(Player guy)
    {
        guy.setDef(guy.getDef() + def);
    }
    
    public void effect(Fighter guy)
    {
        System.out.println(guy.getName() + " gained " + getAmount() + " boost in Def");
    }
}
