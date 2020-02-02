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
public class Paint {
    public static void main(String[] args)
    {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        //declare  integers length, width and height;
        //declare double totalQaFt;
        //declare double paintNeeded;
        Scanner scan = new Scanner(System.in);
        int length;
        int width;
        int height;
        double totalSqFt;
        double paintNeeded;
        int numDoors;
        int numWindows;
        int areaDoors = 20;
        int areaWindows = 15;
                
        
        //Prompt for and read in the length of the room\
        System.out.println("Please enter the length of the room: ");
        length = scan.nextInt();
        
        //Prompt for and read in the width of the room
        System.out.println("Please enter the width of the room: ");
        width = scan.nextInt();
        
        //Prompt for the read in the height of the room
        System.out.println("Please enter the height of the room: ");
        height = scan.nextInt();
        
        System.out.println("Please enter the number of doors: ");
        numDoors = scan.nextInt();
        System.out.println("Please enter the number of windows: ");
        numWindows = scan.nextInt();
        int SqFtDoors = numDoors * areaDoors;
        int SqFtWindows = numWindows * areaWindows;
        
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt= (length * width) + (length * height * 2) + (width * height * 2) - SqFtDoors - SqFtWindows;
        
        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;
        
        //Print the length, width, and height of the room and the 
        //number of gallons of paint needed.
        System.out.println("The length of your room is " + length);
        System.out.println("The width of your room is " + width);
        System.out.println("The height of your room is " + height);
        System.out.println("You have " + numDoors + " Doors ");
        System.out.println("You have " + numWindows + " Windows ");
        System.out.println(paintNeeded + " gallons of paint are required.");
        
    
   
    }
      
    
    
}
