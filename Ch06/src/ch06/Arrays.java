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
public class Arrays {
    
    public static void main(String[] args) {
        
        int[] nums = new int[10];
        double[] someDoubles = new double[20];
        String[] someNames = new String[5];
        
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 20);
        }
        
        for (int i = 0; i <= 19; i++){
            someDoubles[i] = (double)(Math.random() * 20);
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums: " + nums[i]);
        }
        
        
    }
    
}
