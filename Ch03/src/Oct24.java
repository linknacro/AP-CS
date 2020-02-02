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
public class Oct24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int num = 0; num < 20; num++){
            System.out.println("CWA Tarriers");
        }
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        while (num1 < 5 || num1 > 10){
            System.out.println("Please enter a number between 5 and 10: ");
            num1 = scan.nextInt();
        }
        for (int num2 = 0 ; num2 < num1 ; num2++){
            System.out.print("*    ");
        }
    }
}
