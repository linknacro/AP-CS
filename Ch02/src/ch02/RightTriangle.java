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
public class RightTriangle {
    public static void main (String[] args){
        double side1;
        double side2;
        double hypotenuse;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter the lengths of the two sides of" + " a right triangle (separate by a blank space): ");
        
        side1 = scan.nextDouble();
        side2 = scan.nextDouble();
        
        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
       
           
        System.out.println("Length of the hypotenuse: " + hypotenuse);
    
}
}
