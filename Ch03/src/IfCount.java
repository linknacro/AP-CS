/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class IfCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word that has less than 6 characters: ");
        String word = scan.next();

        if (word.length() < 6) {
            System.out.println("You follow the instruction well!");
        } else {
            System.out.println("Where did you learn to count? Bellarmine?");
        }

        System.out.println("Please enter a word in all caps: ");
        String word2 = scan.next();

        if (word2.equals(word2.toUpperCase())) {
            System.out.println("You follow the instruction well!");
        } else {
            System.out.println("Come on! You know how to type, don't you?");
        }

        System.out.println("Please enter a word starting with \"L\": ");
        String word3 = scan.next();

        if (word3.charAt(0) == 'L') {
            System.out.println("You follow the instruction well!");
        } else {
            System.out.println("You got to know the alphabet, dude!");
        }

        System.out.println("Please enter a number less than 10: ");
        int num = scan.nextInt();

        if (num < 10) {
            System.out.println("You follow the instruction well!");

        } else {
            System.out.println("Your math teacher must be mad...");
        }
    }

}
