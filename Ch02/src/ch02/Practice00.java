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
import java.util.Scanner;
public class Practice00 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        int age;
        System.out.println("How old are you? ");
        age = scan.nextInt();
        
        if( age >= 25){
               System.out.println("You can rent a car!");
        }
        
        else{
            System.out.println("You rent a car in " + (25 - age) + " years");
        }
     
        
        
    }
    
}
