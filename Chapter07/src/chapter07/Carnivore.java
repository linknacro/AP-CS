/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter07;

/**
 *
 * @author 19502
 */
public class Carnivore extends Animal
{

    private double fangLength;

    public Carnivore(int age, String gender, boolean isAlive, double fangLength)
    {
        super(age, gender, isAlive);
        this.fangLength = fangLength;
    }

    public void eat()
    {
        System.out.println("The carnivore eats some meat");
    }
}
