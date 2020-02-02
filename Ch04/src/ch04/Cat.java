/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author 19502
 */
public class Cat {
    
    private int age;
    private String name;
    
    public Cat(){
        age = 5;
        name = "Spice";
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public void speak(){
        System.out.println("Meow");
    }
    
    public void getOlder(){
        age++;
    }
}
