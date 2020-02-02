/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the specific year: ");
        int year = scan.nextInt();

        
        if (year % 4 == 0 && year % 100 != 0 && year > 1582) 
            System.out.println("This year is a leap year");

        else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) 
            System.out.println("This is not a leap year");
        
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) 
            System.out.println("This year is a leap year");
        
        else if (year % 4 != 0) 
            System.out.println("This is not a leap year");
        
        else
            System.out.println("Gregorian Calender has not been adopted then");
        

    }

}
