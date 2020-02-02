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

public class DiceGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Die d1 = new Die();
        Die d2 = new Die();
        int face1 = 6;
        int face2 = 6;
        String ans;
        int pointsThisRound1 = 0, pointsTotal1 = 0;
        int pointsThisRound2 = 0, pointsTotal2 = 0;
        System.out.println("Do you want to play two players?");
        ans = scan.next();
        String player1, player2;
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("What is the name of player one: ");
            player1 = scan.next();
            System.out.println("What is the name of player two: ");
            player2 = scan.next();
        } else {
            System.out.println("What is the name of player one: ");
            player1 = scan.next();
            player2 = "AI";
        }

        while (pointsTotal1 < 70 && pointsTotal2 < 70) {
            System.out.println("");
            System.out.println("****** " + player1 + "'s turn ******");
            System.out.println("");

            System.out.println("Do you want to roll? ");
            ans = scan.next();
            while (ans.equalsIgnoreCase("yes")) {
                d1.roll();
                d2.roll();
                face1 = d1.getFaceValue();
                face2 = d2.getFaceValue();
                System.out.println("d1: " + face1);
                System.out.println("d2: " + face2);
                pointsThisRound1 += face1 + face2;
                if (face1 == 1 || face2 == 1) {
                    pointsThisRound1 = 0;
                }
                System.out.println("Points in this round: " + pointsThisRound1);
                System.out.println("Your total points are: " + pointsTotal1);
                if (face1 == 1 && face2 == 1) {
                    pointsTotal1 = 0;
                    pointsThisRound1 = 0;
                }
                if (face1 != 1 && face2 != 1) {
                    System.out.println("Do you wanna keep rolling?");
                    ans = scan.next();
                } else {
                    ans = "no";
                }
            }
            pointsTotal1 += pointsThisRound1;
            System.out.println(player1 + "'s Total points: " + pointsTotal1);
            pointsThisRound1 = 0;
            if (pointsTotal1 >= 70){
                break;
            }

            if (!(player2.equals("AI"))) {
                System.out.println("");
                System.out.println("****** " + player2 + "'s turn ******");
                System.out.println("");

                System.out.println("Do you want to roll? ");
                ans = scan.next();
                while (ans.equalsIgnoreCase("yes")) {
                    d1.roll();
                    d2.roll();
                    face1 = d1.getFaceValue();
                    face2 = d2.getFaceValue();
                    System.out.println("d1: " + face1);
                    System.out.println("d2: " + face2);
                    pointsThisRound2 += face1 + face2;
                    if (face1 == 1 || face2 == 1) {
                        pointsThisRound2 = 0;
                    }
                    System.out.println("Points in this round: " + pointsThisRound2);
                    System.out.println("Your total points are: " + pointsTotal2);
                    if (face1 == 1 && face2 == 1) {
                        pointsTotal2 = 0;
                        pointsThisRound2 = 0;
                    }
                    if (face1 != 1 && face2 != 1) {
                        System.out.println("Do you wanna keep rolling?");
                        ans = scan.next();
                    } else {
                        ans = "no";
                    }
                }
                pointsTotal2 += pointsThisRound2;
                System.out.println(player2 + "'s Total points: " + pointsTotal2);
                pointsThisRound2 = 0;
            }
            else{
                System.out.println("");
                System.out.println("****** " + player2 + "'s turn ******");
                System.out.println("");
                while (pointsThisRound2 < 15){
                    d1.roll();
                    d2.roll();
                    face1 = d1.getFaceValue();
                    face2 = d2.getFaceValue();
                    System.out.println("d1: " + face1);
                    System.out.println("d2: " + face2);
                    pointsThisRound2 += face1 + face2;
                    if (face1 == 1 || face2 == 1) {
                        pointsThisRound2 = 0;
                        break;
                    }
                    System.out.println("Points in this round: " + pointsThisRound2);
                    System.out.println("Your total points are: " + pointsTotal2);
                    if (face1 == 1 && face2 == 1) {
                        pointsTotal2 = 0;
                        break;
                    }
                }
                pointsTotal2 += pointsThisRound2;
                System.out.println(player2 + "'s Total points: " + pointsTotal2);
                pointsThisRound2 = 0;
            }
        }
        if (pointsTotal1 >= 70) {
            System.out.println(player1 + " wins!!");
        } else {
            System.out.println(player2 + " wins!!");
        }
    }

}
