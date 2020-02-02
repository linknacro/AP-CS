/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author 19502
 */
public class Person {
    
    private int age;
    
    public Person(int age){
        this.age = age;
    }
    
    public String toString(){
        return age + "";
    }
    
    public void changeAge(int age){
        this.age = age;
    }
    
}
