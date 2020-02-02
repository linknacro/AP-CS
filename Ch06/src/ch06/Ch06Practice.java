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
import java.util.ArrayList;
public class Ch06Practice
{
    public static void main(String[] args)
    {
        int[] nums = new int [20];
        ArrayList<String> colors = new <String>ArrayList();
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 20);
        }
        
        for (int i : nums) {
            System.out.print( i + "  ");
        }
        
        System.out.println("\n\n");
        
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");
        
        for (String i : colors) {
            System.out.print( i + "  ");
        }
    }
}
