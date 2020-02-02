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
public class ReverseArrays {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How big would you like your array to be: ");
        int arraySize = scan.nextInt();
        int[] nums = new int[arraySize];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a value for the " + i + "th element: ");
            nums[i] = scan.nextInt();
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("The " + i + "th element is " + nums[i]);
        }
        
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        
        System.out.println("\n");
        System.out.println("After reversing the array");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("The " + i + "th element is " + nums[i]);
        }
    }

}
