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

public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TODO code application logic here
        int num1 = 0;
        int num = 0;
        while (num1 < 5 || num1 > 20) {
            System.out.println("Please enter a number: ");
            num1 = scan.nextInt();
        }
        System.out.print("Have a ");
        while (num < num1) {
            System.out.print("very ");
            num++;
        }
        System.out.println("nice day!");
        int num2 = 10;
        
        while (num2 > 0){
            System.out.print(num2 + ", ");
            num2--;
        }
        System.out.println("blastoff!");
    }

}
