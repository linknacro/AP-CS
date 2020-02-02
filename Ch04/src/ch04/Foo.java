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
public class Foo {
    private int num1;
    
    public Foo(int num1){
        this.num1 = num1;
    }        
     
    public int getNum1(){
        return num1;
    }
    
    public static void doSomething(){
        System.out.println("Woo Hoo! A static method!");
    }
    
}
