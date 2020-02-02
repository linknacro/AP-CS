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
public class ScrabbleDriver
{
    public static void main(String[] args)
    {
        ArrayList<ScrabbleTile> bag = new ArrayList<ScrabbleTile>();
        bag.add(new ScrabbleTile("A", 1));
        bag.add(new ScrabbleTile("B", 3));
        bag.add(new ScrabbleTile("C", 3));
        bag.add(new ScrabbleTile("D", 2));
        bag.add(new ScrabbleTile("E", 1));
        bag.add(new ScrabbleTile("F", 4));
        bag.add(new ScrabbleTile("G", 2));
        bag.add(new ScrabbleTile("H", 4));
        bag.add(new ScrabbleTile("I", 1));
        bag.add(new ScrabbleTile("J", 8));
        bag.add(new ScrabbleTile("K", 5));
        bag.add(new ScrabbleTile("L", 1));
        bag.add(new ScrabbleTile("M", 3));
        bag.add(new ScrabbleTile("N", 1));
        bag.add(new ScrabbleTile("O", 1));
        bag.add(new ScrabbleTile("P", 3));
        bag.add(new ScrabbleTile("Q", 10));
        bag.add(new ScrabbleTile("R", 1));
        bag.add(new ScrabbleTile("S", 1));
        bag.add(new ScrabbleTile("T", 1));
        bag.add(new ScrabbleTile("U", 1));
        bag.add(new ScrabbleTile("V", 4));
        bag.add(new ScrabbleTile("W", 4));
        bag.add(new ScrabbleTile("X", 8));
        bag.add(new ScrabbleTile("Y", 4));
        bag.add(new ScrabbleTile("Z", 10));
        
        ArrayList<ScrabbleTile> playerHand = new ArrayList<ScrabbleTile>();
        for (int i = 0; i < 7; i++) {
            int size = bag.size();
            playerHand.add(bag.remove((int)(Math.random() * size)));
            size--;
        }
        System.out.println("Player's Hand: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(playerHand.get(i));
        }
        
        for (int i = 0; i < 4; i++) {
            int size = playerHand.size();
            playerHand.remove((int)(Math.random() * size));
            size--;
        }
        
        for (int i = 0; i < 4; i++) {
            int size = bag.size();
            playerHand.add(bag.remove((int)(Math.random() * size)));
            size--;
        }
        
        System.out.println("");
        System.out.println("Round 2");
        System.out.println("Player's Hand: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(playerHand.get(i));
        }
    }
}
