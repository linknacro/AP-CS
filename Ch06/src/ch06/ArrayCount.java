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
public class ArrayCount
{
    public static void main(String[] args)
    {
        /*int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)(Math.random() * 10 + 1); 
        }
        int oddCount = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0){
                oddCount++;
            }
        }
        printArray(ints);
        System.out.println("There are " + oddCount + " odd numbers");
        
        double[] doubles = new double[50];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.random() * 1;
        }
        int count = 0;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] >= .25 && doubles[i] <= .75){
                count++;
            }
        }
        printArray(doubles);
        System.out.println("There are " + count + " candidates");*/
        
        Coin[] coins = new Coin[1000];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = new Coin(0, "head");
            coins[i].flip();
        }
        int headCount = 0, tailCount = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i].getSide().equals("head")){
                headCount++;
            }
            else {
                tailCount++;
            }
        }
        printArray(coins);
        System.out.println("There are " + headCount + " heads");
        System.out.println("There are " + tailCount + " tails");
    }
    
    private static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    private static void printArray(double[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    private static void printArray(Coin[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getSide());
        }
    }
}
