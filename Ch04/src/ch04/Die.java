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
public class Die {
    
    // ATTRIBUTES - aka instance variables
    
    private int numSides;  // number of sices
    private int faceValue;
    private String dieColor;  // color
    
    
    // BEHAVIORS - things it can do. Its methods
    
    // Constructor - a special method 
    // Same name as class, no return value
    public Die(){
        numSides = 6;
        faceValue = 6;
        dieColor = "blue";
    }
    
    public Die(int value, String someColor){
        numSides = 5;
        faceValue = value;
        dieColor = someColor;
    }
    
    public int getNumSides(){
        return numSides;
    }
    
    public String getDieColor(){
        return dieColor;
    } 
    
    public int getFaceValue(){
        return faceValue;
    }
    
    public void roll(){
       faceValue = (int)(Math.random() * 6 + 1);
    }
    
}
