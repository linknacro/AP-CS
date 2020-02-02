/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many salespeople do you want to process: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        int highest = 0;
        int highestPerson = 0;
        int lowest = 10000000;
        int lowestPerson = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + (i + 1) + "      " + sales[i]);
            sum += sales[i];
            if (sales[i] > highest){
                highest = sales[i];
                highestPerson = i;
            }
            if (sales[i] < lowest){
                lowest = sales[i];
                lowestPerson = i;
            }
        }
        
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sales: " + sum / SALESPEOPLE);
        System.out.println("Salesperson " + (highestPerson + 1) + " had the highest sale with $" + highest);
        System.out.println("Salesperson " + (lowestPerson + 1) + " had the lowest sale with $" + lowest);
        System.out.println("Please enter a certain amount: ");
        int amt = scan.nextInt();
        int amtExPeople = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amt){
                System.out.println("Salesperson " + (i + 1) + " has a sale of " + sales[i] + " and exceeds the amount");
                amtExPeople++;
            }
        }
        System.out.println(amtExPeople + " people exceed the amount of sales of " + amt);
        
    }
}
