/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author 19502
 */
public class ManageAccount {
    public static void main(String[] args) {
        Account n1 = new Account (900, "Link", 123456);
        
        n1.printSummary();
        System.out.println(n1.chargeFee());
        n1.deposit(500);
        n1.chargeFee();
        n1.withdrawl(400);
        n1.changeName("James");
        n1.printSummary();
    }
}
