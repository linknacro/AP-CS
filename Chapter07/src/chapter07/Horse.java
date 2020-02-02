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
public class Horse extends Herbivore
{

    private String species;

    public Horse(int age, String gender, boolean isAlive, int gentleness, String species)
    {
        super(age, gender, isAlive, gentleness);
        this.species = species;
    }

    public void kick()
    {

    }
}
