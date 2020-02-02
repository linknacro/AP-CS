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

public class Star {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("*** Incerdible Shape Drawing Program ***");
        System.out.println("");
        System.out.println("Let's draw a rectangle");
        Scanner scan = new Scanner(System.in);
        int length = 0, width = 0;
        while (length < 2 || length > 20) {
            System.out.println("Please enter a number for the length between 2 and 20: ");
            length = scan.nextInt();
        }
        while (width < 1 || width > 10 || width >= length) {
            System.out.println("Please enter a number for the width between 1 and 10( but less than the length): ");
            width = scan.nextInt();
        }
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int height = 0;
        while (height < 2 || height > 10) {
            System.out.println("Please enter a number for the height between 2 and 10: ");
            height = scan.nextInt();
        }
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < (row + 1); col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int height2 = 0;
        while (height2 < 2 || height2 > 10) {
            System.out.println("Please enter a number for the height between 2 and 10: ");
            height2 = scan.nextInt();
        }
        for (int row = 0; row < height2; row++) {
            for (int blank = 0; blank < (height2 - row); blank++) {
                System.out.print(" ");
            }
            for (int col = 0; col < (row + 1); col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int height3 = 0;
        while (height3 < 2 || height3 > 10) {
            System.out.println("Please enter a number for height between 2 and 10: ");
            height3 = scan.nextInt();
        }
        for (int row = 0; row < height3; row++) {
            for (int blank = 0; blank < (height3 - row); blank++) {
                System.out.print(" ");
            }
            for (int col = 0; col < (row + 1); col++) {
                System.out.print("*");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int height4 = 0;
        while (height4 < 3 || height4 > 12) {
            System.out.println("Please enter a number for height between 3 and 12: ");
            height4 = scan.nextInt();
        }
        if (height4 % 2 != 0) {
            int realH = height4 / 2;
            int shH = height4 - realH;
            for (int row = 0; row < realH; row++) {
                for (int blank = 0; blank < (realH - row); blank++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < (row + 1); col++) {
                    System.out.print("*");
                }
                for (int col = 0; col < row; col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int row = 0; row < shH; row++) {
                for (int blank = 0; blank < row; blank++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < (shH - row); col++) {
                    System.out.print("*");
                }
                for (int col = 0; col < (shH - row - 1); col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        else{
            int realH = (height4) / 2;
            
            for (int row = 0; row < realH; row++) {
                for (int blank = 0; blank < (realH - row); blank++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < (row + 1); col++) {
                    System.out.print("*");
                }
                for (int col = 0; col < row; col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int row = 0; row < realH; row++) {
                for (int blank = 0; blank < row + 1; blank++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < (realH - row); col++) {
                    System.out.print("*");
                }
                for (int col = 0; col < (realH - row - 1); col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
