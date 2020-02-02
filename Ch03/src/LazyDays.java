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
public class LazyDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter the temperature: ");
        int temp = scan.nextInt();
        
        if (temp >= 90)
            System.out.println("Visit our shops!");
        else if (temp >= 80)
            System.out.println("You can go swimming!");
        
        else if (temp >= 60)
             System.out.println("You can play tennis!");
        
        else if (temp >= 40)
            System.out.println("You can play golf!");
        
        else if (temp >= 20)
            System.out.println("You can go skiing!");
        
        else
            System.out.println("Visit our shops!");
            
        
       
        
            
            
         
            
    }
    
}
