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
public class BandBoosterDriver {
    public static void main(String[] args) {
        BandBooster b1 = new BandBooster("Link");
        BandBooster b2 = new BandBooster("James");
        BandBooster b3 = new BandBooster("Kiran");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many weeks does the fundraising campaign last: ");
        int weeks = scan.nextInt();
        
        for (int count = 1; count <= weeks; count++){
            System.out.println("");
            System.out.println("Week " + count);
            System.out.println(b1.getName() + " sold: ");
            int amt = scan.nextInt();
            b1.updateSales(amt);
            System.out.println(b2.getName() + " sold: ");
            amt = scan.nextInt();
            b2.updateSales(amt);
            System.out.println(b3.getName() + " sold: ");
            amt = scan.nextInt();
            b3.updateSales(amt);
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
