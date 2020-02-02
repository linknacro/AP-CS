/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class IntegerListTest
{

    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    public static void dispatch(int choice)
    {
        if (choice == 1) {
            System.out.println("How big should the list be?");
            int size = scan.nextInt();
            list = new IntegerList(size);
            list.randomize();
        }
        else if (choice == 2) {
            list.print();
        }
        else if (choice == 3) {
            System.out.println("What element do you want to add to the list?");
            int element = scan.nextInt();
            list.addElement(element);
        }
        else if (choice == 4){
            System.out.println("What element's first occurence do you want to remove?");
            int element = scan.nextInt();
            list.removeFirst(element);
        }
        else if (choice == 5){
            System.out.println("What element's all occurence do you want to remove?");
            int element = scan.nextInt();
            list.removeAll(element);
        }
        else {
            System.out.println("Sorry, invalid choice");
        }
    }

    public static void printMenu()
    {
        System.out.println("\n   Menu   ");
        System.out.println("   ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.println("3: To add one element to the list");
        System.out.println("4: To remove an element's first occurence from the list");
        System.out.println("5: To remove an element's all occurences from the lsit ");
        System.out.println("\nEnter your choice: ");
    }
}
