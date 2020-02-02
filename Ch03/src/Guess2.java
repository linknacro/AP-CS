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

public class Guess2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numToGuess, guess;
        int tooH = 0, tooL = 0;
        int numOfGuess = 0;

        numToGuess = (int) (Math.random() * 10 + 1);

        System.out.println("Please enter a guess: ");
        guess = scan.nextInt();

        do
        {
            
            if (guess > numToGuess) {
                System.out.println("Your guess is too big");
                tooH++;
            } else {
                System.out.println("Your guess is too small");
                tooL++;

            }
            numOfGuess++;
            System.out.println("The guess is wrong.");
            System.out.println("Please enter another guess: ");
            guess = scan.nextInt();
        }
        while (guess != numToGuess); 
        System.out.println("The guess is correct!!");
        System.out.println("You have guesses " + numOfGuess + " times");
        System.out.println(tooH + " times are too high");
        System.out.println(tooL + " times are too low");
    }

}
