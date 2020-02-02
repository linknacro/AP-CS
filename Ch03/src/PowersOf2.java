/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class PowersOf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numPowersOf2;
        double nextPowerOf2 = 1;
        int exponent;

        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        System.out.println("Here are the first " + numPowersOf2 + " powers of 2");
        exponent = 0;
        while (exponent < numPowersOf2) {
            nextPowerOf2 = Math.pow(2, exponent);
            System.out.println("2^" + exponent + " = " + (int)nextPowerOf2);
            exponent++;
        }
    }
}
