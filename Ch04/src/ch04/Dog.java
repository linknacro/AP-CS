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
public class Dog {
    
    private int age;
    private String name;
    
    public Dog(int someAge, String someName) {
        age = someAge;
        name = someName;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public void speak(){
        System.out.println("Bow wow");
    }
}
