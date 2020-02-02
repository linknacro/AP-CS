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
public class Herbivore extends Animal
{

    private int gentleness;

    public Herbivore(int age, String gender, boolean isAlive, int gentleness)
    {
        super(age, gender, isAlive);
        this.gentleness = gentleness;
    }

    public void eat()
    {
        System.out.println("The herbivore eats some plants");
    }
}
