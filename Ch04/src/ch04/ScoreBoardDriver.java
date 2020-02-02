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
public class ScoreBoardDriver {
    public static void main(String[] args) {
        
        ScoreBoard b1 = new ScoreBoard(30, 33, 6, 8, 745, 2);
        
        b1.twoPointer("home");
        b1.threePointer("away");
        b1.foul("home");
        b1.timePass(25);
        b1.printSummary();
        System.out.println("Winner is " + b1.winner());
    }
    
}
