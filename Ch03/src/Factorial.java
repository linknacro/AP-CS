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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        int num = -1;
        while (num < 0){
            System.out.println("Please enter a non-negative number: ");
            num = scan.nextInt();
        }
        
        int numS = num;
        while (num > 1){
            
            numS = numS * (num - 1);
            num--;
        }
        if (num == 0)
                numS = 1;
        
        System.out.println("The factorial of the number is " + numS);
    }
    
}
