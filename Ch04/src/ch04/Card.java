/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author 19502
 */
public class Card {
    
    private int number;
    private String suit;
    
    
    public Card(){
        
        
    }
    
    public void deal(){
        number = (int)(Math.random() * 13 + 1);
        int suitNum = (int)(Math.random() * 4);
        if(suitNum == 1){
            suit = "diamonds";
        }
        else if (suitNum == 2){
            suit = "clubs";
        }
        else if (suitNum == 3){
            suit = "spaces";
        }
        else {
            suit = "hearts";
        }
        System.out.println(number + " of " + suit);
    }
    
    public static void main(String[] args) {
        Card d1 = new Card();
        d1.deal();
    }
    
}
