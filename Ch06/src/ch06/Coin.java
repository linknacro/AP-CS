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
public class Coin {
    
    private int monetaryValue;
    private String side;
    
    public Coin(int someValue, String someSide){
        monetaryValue = someValue;
        side = someSide;
    }
    
    public void flip(){
        int i = (int)(Math.random() * 2);
        if (i == 1){
            side = "tail";
        }
        else{
            side = "head";
        }
    }
    
    public int getMonetaryValue(){
        return monetaryValue;
    }
    
    public String getSide(){
        return side;
    }
    
}
