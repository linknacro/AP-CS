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
public class CardDriver {
    public static void main(String[] args) {
        
        for (int i = 0; i < 20; i++){
            Card d1 = new Card();
            d1.deal();
        }
    }
}
