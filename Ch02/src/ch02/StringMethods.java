/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

/**
 *
 * @author 19502
 */
public class StringMethods {
     public static void main(String[] args) {
        
        String s1 = "Charles Wright Academy";
        String s2 = "Go Tarriers!";
        String teachName = "Mr. Chissoe";
        
        // Example of using the length method
        int s1Length = s1.length();
        
        System.out.println("s1 is " + s1Length + " characters long");
        // End example
        
        
        System.out.println("\n\n");    // just giving some whitespace
        
                
        
        
        // *** PART 1:  Find the length of s2
        int s2Length = s2.length();
        System.out.println("s2 is " + s2Length + " characters long");
        
        // *** PART 2:  Find the length of all three strings
        int teachNameLength = teachName.length();
        int sumLength = s1Length + s2Length + teachNameLength;
        System.out.println("The strings s1, s2, and teachName have " + sumLength +  
                           " number of characters in them");
        
        
        System.out.println("\n\n");    // just giving some whitespace
        
        // PART 3:  Example of using the substring method
        String newString = s2.substring(4);
        System.out.println(newString);
        // End of example
        
        System.out.println("\n\n");    // just giving some whitespace
        
        // PART 4:  Using the indexOf method
        int index = s1.indexOf("Wright");
        
        //  *** use the indexOf method to find where "Wright" starts in s1
        System.out.println("\"Wright\" starts at index " + index +
                           " in the String s1");
        
        
        System.out.println("\n\n");    // just giving some whitespace
        
        // PART 5:  
        // This one's a good challenge, let's see if you can do it ...
        // * We're going to create a new string of text, which is the
        // * second half of string s2
        // *
        
        // first, find the length of s2:
        // **** Write code which finds the length of s2
        
        // next, write code which finds which index is half the length of s2
        int halfwayIndex = s2Length / 2;  //  *** write the code
        
        // next, create a new String 
        
        
        // finally use the substring method to get the substring, or part of the
        // *  string, starting at the character ath the halfwayIndex, and 
        // *  continuing to the end of the string. Assign this to secondHalf
        // *
        
        // *** put your code here
        String secondHalf = new String( s2.substring(halfwayIndex));
        
        // This will output for you (you don't need to edit anything below this comment)
        System.out.println("The second half of " + s2 + " is " + secondHalf);
        
        /*   THIS COMMENTS OUT THE REST OF CODE, MOVE IT DOWN PER INSTRUCTIONS
        */
    
}
}