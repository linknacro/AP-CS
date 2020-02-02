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
public class RollingDice {
    public static void main(String[] args){
        int d1 = (int) (Math.random() * 6 + 1);
        int d2 = (int) (Math.random() * 6 + 1);
        
        System.out.println("The first dice gives you: " + d1);
        System.out.println("The second dice gives you: " + d2);
        int sum = d1 + d2;
        System.out.println("The total points that you have are: " + sum);
    
}
}