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

public class Election {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int votesForPolly, votesForErnest, totalPolly = 0, totalErnest = 0;
        String response;
        int pollyWins = 0, ernestWins = 0, tie = 0;

        System.out.println("");
        System.out.println("Election Day Vote Counting Program");
        System.out.println("");

        do {
            System.out.println("How many votes for Polly?");
            votesForPolly = scan.nextInt();
            System.out.println("How many votes for Ernest?");
            votesForErnest = scan.nextInt();
            if (votesForPolly > votesForErnest) {
                pollyWins++;
            } else if (votesForPolly < votesForErnest) {
                ernestWins++;
            } else {
                tie++;
            }
            totalErnest = totalErnest + votesForErnest;
            totalPolly = totalPolly + votesForPolly;
            System.out.println("Are there more reports to make?");
            response = scan.next();
        } while (response.equalsIgnoreCase("y"));
        int total = totalErnest + totalPolly;
        double percentPolly = (double) totalPolly / total * 100;
        double percentErnest = (double) totalErnest / total * 100;
        System.out.println("Polly receives " + totalPolly + " votes.");
        System.out.println("He receives " + percentPolly + "% of votes.");
        System.out.println("He wins " + pollyWins + " precincts.");
        System.out.println("");
        System.out.println("Ernest receives " + totalErnest + " votes.");
        System.out.println("He receives " + percentErnest + "% of votes.");
        System.out.println("He wins " + ernestWins + " precincts.");
        if (percentPolly > percentErnest){
            System.out.println("The final winner is Polly!!");
        }
        else{
            System.out.println("The final winner is Ernest!!");
        }
    }
}
