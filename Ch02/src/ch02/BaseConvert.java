/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

/**
 *
 * @author 19502
 */
import java.util.Scanner;
public class BaseConvert {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int base;
        int base10Num;
        int maxNumber;
        
        int place0;
        int place1;
        int place2;
        int place3;
        
        int baseBNum;
        
        System.out.println();
        System.out.println("Base Conversion Program");
        System.out.println();
        System.out.print("Please enter a base (2-9) : ");
        base = scan.nextInt();
        
        maxNumber = base * base * base * base - 1;
        System.out.println("You must not enter a number greater than " + maxNumber);
        
        System.out.println("Please enter a base 10 number to convert: ");
        base10Num = scan.nextInt();
        
        place0 = base10Num % base;
        place1 = base10Num / base % base;
        place2 = base10Num / base / base % base;
        place3 = base10Num / base / base / base % base;
        
        baseBNum = place3 * 1000 + place2 * 100 + place1 * 10 + place0;
        System.out.println("The result is " + baseBNum);
        System.out.println("The result is " + place3 + place2 + place1 + place0);
        
        
        
        
    
}
}