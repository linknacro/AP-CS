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
public class HW202 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        final double CONVERT = 1.60935;
        
        System.out.println("Please the number of miles: ");
        float miles = scan.nextFloat();
        
        double kilometers = miles * CONVERT;
        
        System.out.println("The number of miles that you have entered equals to " + 
                kilometers);
        
        
    
}
}
