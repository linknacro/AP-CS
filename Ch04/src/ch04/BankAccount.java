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
public class BankAccount {

    // Instance variables
    private double balance;
    private String nameOnAccount;
    private final double FEE;
    private int accountNumber;

    // methods
    public BankAccount(String acctName, double money, int num) {
        balance = 0;
        nameOnAccount = acctName;
        FEE = 10;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return nameOnAccount;
    }

    public void deposit(double depAmount) {
        balance += depAmount;
    }

    public void withdraw(double witAmount) {
        
        if (witAmount < balance) {
            balance -= witAmount;
        }
        else {
            this.chargeFee();
        }
    }
    
    private void chargeFee(){
        balance -= FEE;
    }

}
