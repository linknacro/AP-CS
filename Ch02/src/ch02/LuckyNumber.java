/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

/**
 *
 * @author 19502
 */
public class LuckyNumber {
    public static void main(String[] args){
        
        int lucky1, lucky2, lucky3;
        
        
        lucky1 = (int) (Math.random() * 20 + 60);
        
        lucky2 = (int)(Math.random() * 11 + 90);
        
        lucky3 = (int) (Math.random() * 20 + 11);
        
        System.out.println("Your lucky numbers are " + lucky1 + ", " + lucky2 
        + ", and " + lucky3);
    
    
}
}