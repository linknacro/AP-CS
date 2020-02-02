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
public class Time2Seconds {
    
    public static void main(String[] args){
        
        int hours;
        int minutes;
        int seconds;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the number of hours: ");
        hours = scan.nextInt();
        System.out.println("Please enter the number of minutes: ");
        minutes = scan.nextInt();
        System.out.println("Please enter the number of seconds: ");
        seconds = scan.nextInt();
        
        int hourToseconds = hours * 3600;
        int minuteToseconds = minutes * 60;
        int totaltime = hourToseconds + minuteToseconds + seconds;
        
        System.out.println("The total time that you have entered" + " is " + 
                totaltime + " seconds");
               
        
        
        
        
        
    }    
}
