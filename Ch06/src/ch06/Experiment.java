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
public class Experiment
{

    public static void main(String[] args)
    {
        int[] counts = new int[7];
        int i = 0, inc = 1;
        
        for (int j = 1; j <= 100; j++) {
            counts[i++] += inc;
            if (i >= counts.length){
                i %= counts.length;
                inc = -inc;
            }
        }
        
        for (int j = 0; j < counts.length; j++) {
            System.out.println(counts[j]);
        }
    }
}
