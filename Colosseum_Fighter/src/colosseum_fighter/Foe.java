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
public class Foe extends Fighter implements Speakable
{

    public Foe(int lv, String name, String graphics)
    {
        super(lv, 50, 50, 50, 50, name, graphics);
    }

    public String speak()
    {
        return "";
    }
}
