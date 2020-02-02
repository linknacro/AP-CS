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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double currentSalary;
        double raise;
        double newSalary;
        String rating;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.println("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        
        if (rating.equals("Excellent"))
            raise = currentSalary * 0.06;
        else if (rating.equals("Good"))
            raise = currentSalary * 0.04;
        else if (rating.equals("Poor"))
            raise = currentSalary * 0.015;
        else {
            System.out.println("Invalid rating, raise = 0");
            raise = 0;
        }
        
        newSalary = currentSalary + raise;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("");
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println("");
       
        
        // TODO code application logic here
    }
    
}
