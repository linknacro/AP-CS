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
public class Distance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        
        System.out.println("Enter the x-coordinates of the first point: ");
        x1 = scan.nextDouble();
        System.out.println("Enter the y-coordinates of the first point: ");
        y1 = scan.nextDouble();
        System.out.println("Enter the x-coordinates of the second point: ");
        x2 = scan.nextDouble();
        System.out.println("Enter the y-coordinates of the second point: ");
        y2 = scan.nextDouble();
        
        
        double firstP = Math.pow ((x1 - x2), 2);
        double secondP = Math.pow ((y1 - y2), 2);
        distance = Math.sqrt(firstP + secondP);
        System.out.println("The distance is: " + distance);
        
        
   
        
}
}