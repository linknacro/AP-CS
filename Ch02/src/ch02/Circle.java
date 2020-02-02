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

public class Circle 
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        Scanner scan = new Scanner(System.in);
        int radius;
        System.out.println("Please enter a value for the radius.");
        radius = scan.nextInt();
        int radius2 = radius * 2;
        double area = PI * radius * radius;
        double area2 = PI * radius2 * radius2;
        System.out.println("The area of the circle is " + area);
        System.out.println("If the radius is doubled," + " the area is " + area2);
        System.out.println("The area becomes " + (area2 / area) + " times ");
        
        
    }
}
