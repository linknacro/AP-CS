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
public class BadGuy {
    
    private int numVictims;
    private int bullets;
    private String name;
    
    public BadGuy(String dudeName){
        numVictims = 0;
        bullets = 6;
        name = dudeName;
    }
    
    public void shoot(){
        
        if (bullets > 0){
            System.out.println("Bang!");
            numVictims++;
            bullets--;
        }
        else{
            System.out.println("Click");
            goToJail();
        }
    }
    
    public void goToJail(){
        System.out.println("Rats! I'm in Jail!");
    }
}
