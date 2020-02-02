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
public class NameDriver {
    public static void main(String[] args) {
        
        Name n1 = new Name("Nikki", "Lin", "Fast");
        Name n2 = new Name("Francis", "Scott", "Fitzgerald");
        
        System.out.println(n1.firstMiddleLast());
        System.out.println(n1.lastFirstMiddle());
        System.out.println(n1.initials());
        System.out.println(n1.length());
        
        System.out.println("");
        
        System.out.println(n2.firstMiddleLast());
        System.out.println(n2.lastFirstMiddle());
        System.out.println(n2.initials());
        System.out.println(n2.length());
        System.out.println(n1.equals(n2));
    }
    
}
