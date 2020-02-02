/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author 19502
 */
public class Compare3 {
    
    public static Comparable largest(Comparable c1, Comparable c2, Comparable c3){
        if (c1.compareTo(c2) >= 0 && c1.compareTo(c3) >= 0){
            return c1;
        }
        else if (c2.compareTo(c3) >= 0 && c2.compareTo(c1) >= 0){
            return c2;
        }
        else {
            return c3;
        }
    }
}
