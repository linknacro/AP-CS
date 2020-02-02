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
public class HW204 {
    public static void main(String[] args){
        int first3 = (int) (Math.random() * 800 + 200);
        int next3 = (int) (Math.random() * 900 + 100);
        int last4 = (int) (Math.random() * 10000 + 1000);
        
        System.out.println("The phone number is: " + first3 + "-" + next3 + "-" + 
                last4);
    
}
}