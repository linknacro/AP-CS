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
public class HW203 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the number of quarters: ");
        int quarters = scan.nextInt();
        System.out.println("Enter the number of dimes: ");
        int dimes = scan.nextInt();
        System.out.println("Enter the number of nickels: ");
        int nickels = scan.nextInt();
        System.out.println("Enter the number of pennies: ");
        int pennies = scan.nextInt();
        
        final int QUARTERSCONVERT = 25;
        final int DIMESCONVERT = 10;
        final int NICKELSCONVERT = 5;
        final int PENNIESCONVERT = 1;
        
        int quarters2Cents = quarters * QUARTERSCONVERT;
        int dimes2Cents = dimes * DIMESCONVERT;
        int nickels2Cents = nickels * NICKELSCONVERT;
        int pennies2Cents = pennies * PENNIESCONVERT;
        
        final int CENTSCONVERT = 100;
        
        int quarters2Dollars = quarters2Cents / CENTSCONVERT;
        int leftQuarters = quarters2Cents % CENTSCONVERT;
        
        int dimes2Dollars = dimes2Cents / CENTSCONVERT;
        int leftDimes = dimes2Cents % CENTSCONVERT;
        
        int nickels2Dollars = nickels2Cents / CENTSCONVERT;
        int leftNickels = nickels2Cents % CENTSCONVERT;
        
        int pennies2Dollars = pennies2Cents / CENTSCONVERT;
        int leftPennies = pennies2Cents % CENTSCONVERT;
        
        int totalDollars = quarters2Dollars + dimes2Dollars + nickels2Dollars + pennies2Dollars;
        int totalCents = leftQuarters + leftDimes + leftNickels + leftPennies;
        
        System.out.println("You have " + totalDollars + " dollars, and " + totalCents + " cents");
    
        
}
}