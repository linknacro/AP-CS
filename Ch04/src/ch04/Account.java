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
public class Account {
    
    private double balance;
    private String name;
    private int acctNum;
    final private int FEE = 10;
    
    public Account(double amount, String dudeName, int num){
        balance = amount;
        name = dudeName;
        acctNum = num;
    }
    
    public void printSummary(){
        System.out.println("Balance: $" + balance);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + acctNum);
    }
    
    public double chargeFee(){
        if (balance < 1000){
            balance -= FEE;
        }
        return balance;
    }
    
    public void deposit(double amt){
        balance += amt;
    }
    
    public void withdrawl(double amt){
        balance -= amt;
    }
    
    public void changeName(String newName){
        name = newName;
    }
    
    
}
