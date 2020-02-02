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
import java.text.NumberFormat;
public class ChargeAccount {
    public static void main(String [] args){
        
        Scanner scan = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Please enter your previous balance: ");
        double pB = scan.nextInt();
        
        System.out.println("Please enter your additional charges: ");
        double aC = scan.nextInt();
        
        final double INTEREST_RATE = 0.02;
        double nB = pB + aC;
        double interest = nB * INTEREST_RATE;
        
        double minPay;
        if (nB < 50){
            minPay = nB;
        }
        else if (50 <= nB && nB <= 300){
            minPay = 50;
        }
        else if (nB > 300){
            minPay = nB * 0.2;
        }
        else
            minPay = -1;
        
        System.out.println("");
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("Previous Balance:   " + money.format(pB));
        System.out.println("Additional Charges: " + money.format(aC));
        System.out.println("Interest:           " + money.format(interest));    
        System.out.println("");
        System.out.println("New Balance:        " + money.format(nB));    
        System.out.println("");
        System.out.println("Minimum Payment:    " + money.format(minPay));   
        System.out.println("");
        
        
        
        
        
        
    }
    
}
