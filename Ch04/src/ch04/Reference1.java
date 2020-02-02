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
public class Reference1 {
    public static void main (String[] args)
    {
	Person person1 = new Person ("Rachel", 6);
	Person person2 = new Person ("Elly", 4);
	Person person3 = new Person ("Sarah", 19);

	System.out.println ("\nThe three original people...");
	System.out.println (person1 + ", " + person2 + ", " + person3);

	// Reassign people
	person1 = person2;
	person2 = person3;
	person3 = person1;


	System.out.println("\nThe three people reassigned...");
	System.out.println (person1 + ", " + person2 + ", " + person3);
	
	System.out.println();
	System.out.println ("Changing the second name to Bozo...");
	person2.changeName ("Bozo");
	System.out.println (person1 + ", " + person2 + ", " + person3);

	System.out.println();
	System.out.println ("Changing the third name to Clarabelle...");
	person3.changeName ("Clarabelle");
	System.out.println (person1 + ", " + person2 + ", " + person3);
	System.out.println();
	System.out.println ("Changing the first name to Harpo...");
	person1.changeName("Harpo");
	System.out.println (person1 + ", " + person2 + ", " + person3);
    }
    
}
