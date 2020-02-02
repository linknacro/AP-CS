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
public class AccountDriver {
    public static void main(String[] args) {
        Account a1 = new Account(100, "Link");
        Account a2 = new Account(100, "James");
        Account a3 = new Account(100, "James");
        
        System.out.println(a1);
        System.out.println("");
        System.out.println(a2);
        System.out.println("");
        System.out.println(a3);
        System.out.println("");
        
        a1.close();
        Account a4 = Account.consolidate(a2, a3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
