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
public class Card
{
    private String suit;
    private int value;
    
    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public String getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        return value;
    }
}
