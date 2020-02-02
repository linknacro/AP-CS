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
public class Grades {

    public static void main(String[] args) {

        Name n1 = new Name("Link", "Ziqi", "Lin");
        Name n2 = new Name("James", "Hyun", "Lee");
        Student s1 = new Student(n1);
        Student s2 = new Student(n2);

        s1.inputGrades();
        s2.inputGrades();

        System.out.println("The average for " + s1.getName() + " is " + s1.getAverage());
        System.out.println("The average for " + s2.getName() + " is " + s2.getAverage());

        System.out.println(s1);
        System.out.println(s2);
    }
}
