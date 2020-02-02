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

public class DeckOfCards
{

    private ArrayList<Card> aDeck = new <Card>ArrayList(52);
    private final ArrayList<Card> playerHand_1 = new <Card>ArrayList();
    private final ArrayList<Card> playerHand_2 = new <Card>ArrayList();

    public DeckOfCards()
    {
        for (int i = 0; i < 4; i++) {
            String suit;
            if (i == 0){
                suit = "clubs";
            }
            else if (i == 1){
                suit = "diamonds";
            }
            else if (i == 2){
                suit = "hearts";
            }
            else {
                suit = "spades";
            }
            for (int j = 2; j < 15; j++) {
                aDeck.add(new Card(suit, j));
            }
        }
    }
    
    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < aDeck.size(); i++) {
            result += aDeck.get(i).getValue() + " of " + aDeck.get(i).getSuit() + "\n";
        }
        return result;
    }
    
    public void shuffle(){
        int numCards = 52;
        ArrayList<Card> temp = new ArrayList<Card>(52);
        for (int i = 0; i < 52; i++) {
            temp.add(aDeck.remove((int)(Math.random() * numCards)));
            numCards--;
        }
        aDeck = temp;
    }
    
    public void deal(int num){
        int numCards = 52;
        for (int i = 0; i < num; i++) {
            playerHand_1.add(aDeck.remove((int)(Math.random() * numCards)));
            numCards--;
        }
        for (int i = 0; i < num; i++) {
            playerHand_2.add(aDeck.remove((int)(Math.random() * numCards)));
            numCards--;
        }
    }
    
    public void printHand_1(){
        System.out.println("*************************");
        System.out.println("Player 1");
        for (int i = 0; i < playerHand_1.size(); i++) {
            System.out.println(playerHand_1.get(i).getValue() + " of " + 
                    playerHand_1.get(i).getSuit());
        }
        System.out.println("*************************");
    }
    
    public void printHand_2(){
        System.out.println("*************************");
        System.out.println("Player 2");
        for (int i = 0; i < playerHand_2.size(); i++) {
            System.out.println(playerHand_2.get(i).getValue() + " of " + 
                    playerHand_2.get(i).getSuit());
        }
        System.out.println("*************************");
    }
    
    public static void main(String[] args)
    {
        DeckOfCards aDeck = new DeckOfCards();
        // System.out.println(aDeck);
        aDeck.shuffle();
        // System.out.println(aDeck);
        aDeck.deal(5);
        System.out.println("");
        aDeck.printHand_1();
        aDeck.printHand_2();
    }
}
