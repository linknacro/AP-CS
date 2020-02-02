/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class TestAccounts1 {

    public static void main(String[] args) {
        
        Account testAcct;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        
        for (int i = 1; i <= num; i++){
            testAcct = new Account(100, "Name" + i);
            System.out.println("\nCreated accout " + testAcct.getName());
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
        }
    }

}
