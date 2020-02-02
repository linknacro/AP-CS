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
public class Seconds2Time {
    public static void main(String[] args){
        
        int seconds;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter the number of seconds: ");
        seconds = scan.nextInt();
        int hours = seconds / 3600;
        int secondsLeft = seconds % 3600;
        int minutes = secondsLeft / 60;
        int totalSecondsleft = secondsLeft % 60;
        
        System.out.println("The number of seconds that you have entered" +
                 " equals to " + hours + " hours, " + minutes + " minutes, " + 
                totalSecondsleft + " seconds");
        
        
        
       
       
    }
    
}
