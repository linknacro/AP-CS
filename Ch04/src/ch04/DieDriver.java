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

import java.util.Scanner;
public class DieDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("What colot is the first Die?");
        String aColor = scan.next();
        Die d1 = new Die();
        Die d2 = new Die();
        
        System.out.println("d1 sides: " + d1.getNumSides());
        System.out.println("d2 sides: " + d2.getNumSides());
        
        System.out.println("d1 color: " + d1.getDieColor());
        System.out.println("d2 color: " + d2.getDieColor());
        
        System.out.println("d1 Face value: " + d1.getFaceValue());
        System.out.println("d2 Face value: " + d2.getFaceValue());
        
        d1.roll();
        d2.roll();
        
        System.out.println("d1 Face value: " + d1.getFaceValue());
        System.out.println("d2 Face value: " + d2.getFaceValue());
    }
    
}
