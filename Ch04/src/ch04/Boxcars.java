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
public class Boxcars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Die d1 = new Die();
        Die d2 = new Die();
        int box = 0;
        for (int i = 0; i < 1000; i++){
            d1.roll();
            d2.roll();
            
            if (d1.getFaceValue() == 1 && d2.getFaceValue() == 1){
                box++;
            }
        }
        System.out.println("Boxcar: " + box);
            
    }
    
}
