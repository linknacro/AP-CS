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
public class Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        int month, day, year;
        int daysInMonth;
        boolean monthValid, yearValid, dayValid;
        boolean leapYear;
        
        System.out.println("Please enter the month: ");
        month = scan.nextInt();
        if (month >= 1 && month <= 12)
            monthValid = true;
        else
            monthValid = false;
        
        System.out.println("Please enter the year: ");
        year = scan.nextInt();
        if (year >= 1000 && year <= 1999)
            yearValid = true;
        else 
            yearValid = false;
        
        if (year % 400 == 0)
            leapYear = true;
        else if (year % 100 != 0 && year % 4 == 0)
            leapYear = true;
        else if (year % 100 == 0)    
            leapYear = false;
        else
            leapYear = false;
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12)
            daysInMonth = 31;
        else if (month == 2 && leapYear)
            daysInMonth = 29;
        else if (month == 2 && !leapYear)
            daysInMonth = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            daysInMonth = 30;
        else 
            daysInMonth = 0;
        
        System.out.println("Please enter the day: ");
        day = scan.nextInt();
        
        if ( daysInMonth == 31 && day <= 31 && day >= 1)
            dayValid = true;
        else if ( daysInMonth == 30 && day <= 30 && day >= 1)
            dayValid = true;
        else if ( daysInMonth == 29 && day <= 29 && day >= 1)
            dayValid = true;
        else if ( daysInMonth == 28 && day <= 28 && day >= 1)
            dayValid = true;
        else
            dayValid = false;
        
        if (monthValid && yearValid && dayValid)
            System.out.println("The date that you have entered is valid.");
        else 
            System.out.println("The date that you have entered is invalid.");
        
        
            
       
        
        
        
        
        
            
        
        
        
        
       
     
        
        
    }
    
}
