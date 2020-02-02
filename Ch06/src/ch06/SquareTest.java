// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
public class SquareTest {
    
    public static void main(String[] args) throws IOException {
        // *********************
        // NOTE: Remember to place data files in the project directory 
        //       NOT the src directory!
        // *********************
        File file = new File("magicdata.txt");
        Scanner scan = new Scanner(file);
        
        int count = 1;                  // count which square we're on
        int size = scan.nextInt();      // size of next square

	//Expecting -1 at bottom of input file
	while (size != -1)
	    {

		//create a new Square of the given size
                Square q = new Square(size);
		//call its read method to read the values of the square
                q.readSquare(scan);
		System.out.println("\n******** Square " + count + " ********");
		//print the square
                q.printSquare();
		//print the sums of its rows
                System.out.println(q.sumRow(0));
		//print the sums of its columns
                System.out.println(q.sumCol(0));
		//print the sum of the main diagonal
                System.out.println(q.sumMainDiag());
		//print the sum of the other diagonal
                System.out.println(q.sumOtherDiag());
		//determine and print whether it is a magic square
                System.out.println(q.magic());
		//get size of next square
		count++;
                size = scan.nextInt();

	    }

   }
}