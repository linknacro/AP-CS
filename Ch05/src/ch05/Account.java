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
public class Account {

    private static int numAccounts = 0;
    private int acctNum;
    private double balance;
    private String name;
    private static double withAmt = 0;
    private static double depoAmt = 0;
    private static int withNum = 0;
    private static int depoNum = 0;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
        acctNum = numAccounts;
        numAccounts++;
    }
    
    public Account(double balance, String name, int acctNum){
        this.balance = balance;
        this.name = name;
        this.acctNum = acctNum;
        numAccounts++;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt){
        balance += amt;
        depoAmt += amt;
        depoNum++;
    }
    
    public void withdraw(double amt){
        balance -= amt;
        withAmt += amt;
        withNum++;
    }
    
    public static int getNumDeposits(){
        return depoNum;
    }
    
    public static int getNumWithdrals(){
        return withNum;
    }
    
    public static double getAmtDeposits(){
        return depoAmt;
    }
    
    public static double getAmtWithdrals(){
        return withAmt;
    }

    public void close() {
        name = "CLOSED";
        balance = 0;
        numAccounts--;
    }

    public static Account consolidate(Account acct1, Account acct2) {
        if (((acct1.getName()).equals(acct2.getName())) && (acct1.getAcctNum() != acct2.getAcctNum())) {

            Account a1 = new Account(acct1.getBalance() + acct2.getBalance(), acct1.getName());
            return a1;
        }
        else{
            System.out.println("Illegal");
            return null;
        }
    }
    
    public String toString(){
        return "Account " + acctNum + " has $" + balance + " balance. \nThe holder is " + name + ".";
    }
}
