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
public class LoveCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a limit: ");
        final int LIMIT = scan.nextInt();
        int count = 1;
        int sum = 0;
        while(count <= LIMIT){
            System.out.println(count + " I love Computer Science!!");
            sum = sum + count;
            count++; 
        } 
        System.out.println("Printed this message " + LIMIT + " times.");
        System.out.println("The sum of the numbers from 1 to " + LIMIT + " is " + sum);
    }
}
