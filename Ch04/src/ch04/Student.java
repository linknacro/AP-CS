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
import java.util.Scanner;

public class Student {

    private Name dudeName;
    private int test1Score, test2Score;

    Scanner scan = new Scanner(System.in);

    public Student(Name someName) {
        dudeName = someName;
        test1Score = 0;
        test2Score = 0;
    }

    public Name getName() {
        return dudeName;
    }

    public void inputGrades() {
        System.out.println(dudeName + "'s Test 1 score: ");
        test1Score = scan.nextInt();
        while (test1Score < 0 || test1Score > 100) {
            System.out.println("Please enter again: ");
            test1Score = scan.nextInt();
        }
        System.out.println(dudeName + "'s Test 2 score: ");
        test2Score = scan.nextInt();
        while (test2Score < 0 || test2Score > 100) {
            System.out.println("Please enter again: ");
            test2Score = scan.nextInt();
        }
    }

    public String toString() {
        return "Name: " + dudeName + " Test 1: " + test1Score + " Test2: " + test2Score;
    }

    public double getAverage() {
        double avg = (double) (test1Score + test2Score) / 2;
        return avg;
    }

    public static void main(String[] args) {
        Name n1 = new Name("Nikki", "Lin", "Fast");
        Student d1 = new Student(n1);
        System.out.println(d1.getName());
        System.out.println(d1);
    }
}
