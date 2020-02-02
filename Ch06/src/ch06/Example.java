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
public class Example
{
    public static void main(String[] args)
    {
        Die [] tenDice = new Die[500];
        
        for (int i = 0; i < tenDice.length; i++)
        {
            tenDice[i] = new Die();
        }
        
        int count6 = 0;
        for (int i = 0; i < tenDice.length; i++)
        {
            tenDice[i].roll();
            if (tenDice[i].getFaceValue() == 6){
                count6++;
            }
        }
        
        System.out.println(count6);
        for (int i = 0; i < tenDice.length; i++)
        {
            
        }
        
    }
}
