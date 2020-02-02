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
public class Height2Inches {
    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
        int feet;
        int inches;
        System.out.println("Please enter your height" + " in the order of " + 
                "feet, inches:");
        feet = scan.nextInt();
        inches = scan.nextInt();
        System.out.println("Your height is " + feet + " feet, " + "and " + inches + 
                " inches");
        
        int feetToinches = feet * 12;
        int totalInches = feetToinches + inches;
        System.out.println("Your total height is " + totalInches + " inches");
        
    
        
}
}