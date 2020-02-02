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
public class Animal
{

    private int age;
    private boolean isAlive;
    private String gender;

    public Animal(int age, String gender, boolean isAlive)
    {
        this.age = age;
        this.gender = gender;
        this.isAlive = isAlive;
    }

    public void grow()
    {
        age++;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isIsAlive()
    {
        return isAlive;
    }

    public String getGender()
    {
        return gender;
    }

    public void eat()
    {
        System.out.println("The animal eats some food");
    }
}
