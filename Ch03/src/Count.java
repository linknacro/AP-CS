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

public class Count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        String phrase;
        int countBlank;
        int length;
        char ch;
        int countA, countE, countS, countT;
        String response;
        do {
            System.out.println("");
            System.out.println("Character Counter");
            System.out.println("");
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;

            System.out.println("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            length = phrase.length();

            countBlank = 0;

            for (int index = 0; index < length; index++) {
                ch = phrase.charAt(index);
                switch (ch) {
                    case ' ':
                        countBlank++;
                        break;
                    case 'a':
                    case 'A':
                        countA++;
                        break;
                    case 'e':
                    case 'E':
                        countE++;
                        break;
                    case 's':
                    case 'S':
                        countS++;
                        break;
                    case 't':
                    case 'T':
                        countT++;
                        break;
                }
            }
            System.out.println("This phrase has " + countBlank + " blanks");
            System.out.println("It has " + countA + " \"A\"s");
            System.out.println("It has " + countE + " \"E\"s");
            System.out.println("It has " + countS + " \"S\"s");
            System.out.println("It has " + countT + " \"T\"s");
            System.out.println("Do you want to keep going?");
            response = scan.nextLine();
        } while (!(response.equalsIgnoreCase("no")));
    }
}
