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
public class RandomLargest {
    
    public static void main(String[] args) {
        
        int [] num = new int[20];
        
        for (int i = 0; i < 19; i++){
            num[i] = (int)(Math.random() * 50);
        }
        
        for (int i = 0; i < 19; i++){
            System.out.println(num[i]);
        }
        
        System.out.println("");
        
        int largest = 0;
        for (int i = 1; i < 20; i++){
            if (num[i] > largest){
                largest = num[i];
            }
        }
        
        System.out.println(largest);
    }
    
}
