/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author 19502
 */
public class PersonDriver {
    public static void main(String[] args) {
        int age1 = 10, age2 = 15, age3 = 20;
        Person p1 = new Person(30);
        Person p2 = new Person(35);
        Person p3 = new Person(40);
        
        age1 = age2;
        age3 = age2;
        p1 = p2;
        p3 = p2;
        p2.changeAge(age2);
        age2 += 3;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
    }
}
