package ch02;

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

public class StringManips {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        String phrase = new String ("This is a String test.");
        int phraseLength;
        int middleIndex;
        String firstHalf;
        String secondHalf;
        String switchedPhrase;
        
        System.out.println("Please enter the city name: ");
        String city = scan.next( );
        System.out.println("Please enter the state name: ");
        String state = scan.next();
        String cityAndState = new String(((state.toUpperCase()).concat(city.toLowerCase())).concat(state.toUpperCase()));
        System.out.println(cityAndState);
          
       
        
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        int middle1 = middleIndex - 1;
        int middle2 = middleIndex + 2;
        String middle3 = new String(phrase.substring(middle1, middle2));
        
        
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        switchedPhrase = (secondHalf.concat(firstHalf)).replace(' ', '*');
        
        
        System.out.println();
        System.out.println("Original Phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength + " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println("Swtiched phrase: " + switchedPhrase);
        System.out.println("The three middle characters are: " + middle3);
        System.out.println();
        
       
        
        
    }
    
}
