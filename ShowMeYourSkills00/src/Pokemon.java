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

public class Pokemon
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println("Welcome to the world of Pokemons!!!");
        System.out.println("");
        System.out.println("Nowadays, you can find pokemon in the real world, and you don't even have to play Pokemon Go!");
        System.out.println("How cool is that? Everyone gets to pick their own pokemons, so what are you waiting for?");
        System.out.println("Let's go and chatchem all!!");
        System.out.println("");
        System.out.println("Mr. Chissoe gives you three pokemons to pick! Do you want Charmander, Bulbasaur, or Squirtle?");
        String mon = scan.next();
        System.out.println("");
        System.out.println("------------------------------------------------");
        double mAtk, mDef, mSpA, mSpD;
        if (mon.equals("Charmander") || mon.equals("charmander")) {
            mon = "Charmander";
            System.out.println("You have chosen " + mon + ". What a good choice!");
            mAtk = 11;
            mDef = 10;
            mSpA = 12;
            mSpD = 11;
            System.out.println("Charmander is a fire type pokemon");
            System.out.println("Charmander's stats: ");
            System.out.println("===========================");
            System.out.println("HP  Atk  Def  SpD  SpA  Spe");
            System.out.println("39  52   43   50   60   65 ");
            System.out.println("");
            System.out.println("Ability: Blaze");
            System.out.println("");
            System.out.println("Moves: ");
            System.out.println("Brick Break(Normal Physical)  Flamethrower(Fire Special)  Work up(Normal Status)");
        }
        else if (mon.equals("Bulbasaur") || mon.equals("bulbasaur")) {
            mon = "Bulbasaur";
            System.out.println("You have chosen " + mon + ". What a good choice!");
            mAtk = 11;
            mDef = 11;
            mSpA = 13;
            mSpD = 13;
            System.out.println("Bulbasuar is a grass type pokemon");
            System.out.println("Bulbasaur's stats: ");
            System.out.println("===========================");
            System.out.println("HP  Atk  Def  SpD  SpA  Spe");
            System.out.println("45  49   49   65   65   45 ");
            System.out.println("");
            System.out.println("Ability: Overgrow");
            System.out.println("");
            System.out.println("Moves: ");
            System.out.println("Growth(Grass Status)  Leaf Storm(Grass Special)  Synthesis(Grass Status)");
        }
        else if (mon.equals("Squirtle") || mon.equals("squirtle")) {
            mon = "Squirtle";
            System.out.println("You have chosen " + mon + ". What a good choice!");
            mAtk = 11;
            mDef = 13;
            mSpA = 11;
            mSpD = 12;
            System.out.println("Squirtle is a grass type pokemon");
            System.out.println("Squirtle's stats: ");
            System.out.println("===========================");
            System.out.println("HP  Atk  Def  SpD  SpA  Spe");
            System.out.println("44  48   65   50   64   43 ");
            System.out.println("");
            System.out.println("Ability: Torrent");
            System.out.println("");
            System.out.println("Moves: ");
            System.out.println("Power-up Punch(Fighting Physical)  Surf(Water Special)  Iron Defense(Normal Status)");
        }
        else {
            System.out.println("Please pick a pokemon! Don't you want to have one?");
            mAtk = 0;
            mDef = 0;
            mSpA = 0;
            mSpD = 0;
            System.exit(0);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("");
        System.out.println("Mr. Chissoe is challenging you for a pokemon battle!!!");
        System.out.println("Do you want to fight? Yes or no?");
        String ans = scan.next();
        int ehp;
        if (ans.equals("Yes") || ans.equals("yes")) {
            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("Mr. Chissoe: Let's Rock'n Roll!!!");
            System.out.println("");
            System.out.println("Mr.Chissoe Lv 10 ");
            ehp = 150;
            System.out.println("Hp: " + (int) ehp);
            System.out.println("Mr.Chissoe is looking threatening");
            System.out.println("");
            System.out.println("Let's show them what you got, " + mon + "!!!");
            System.out.println("");
            System.out.println(mon + " Lv 5 ");
        }
        else {
            System.out.println("Come on! It is not fun!!");
            System.out.println("Mr. Chissoe is disappointed at you!!");
            ehp = 0;
            System.exit(0);
        }
        String move;
        int eAtk = 12;
        int eDef = 12;
        int eSpA = 14;
        int eSpD = 10;
        double damage;
        int mhp;

        if (mon.equals("Charmander")) {
            mhp = 39;
            System.out.println("Hp: " + mhp);
            System.out.println("We got this!!");

            while (ehp > 0) {
                System.out.println("");
                System.out.println("============================================");
                System.out.println("Please enter the move that you want to use: ");
                System.out.println("Brick Break     Flamethrower     Work Up");
                System.out.println("(Enter the move without space)");
                System.out.println("(fl for Flamethrower)");
                System.out.println("(bb for Brick Break)");
                System.out.println("(wu for Work Up)");
                move = scan.next();
                int cNum = (int) (Math.random() * 9);
                if (move.equals("bb")) {
                    System.out.println("");
                    System.out.println(mon + " uses Brick Break!!");
                    damage = ((4 * 75 * mAtk / eDef) / 50 + 2) * 2 * (Math.random() * 0.16 + 0.85);
                    ehp = ehp - (int) damage;
                    System.out.println("It is super effective!");
                    System.out.println("Mr. Chissoe loses " + (int) damage + " Hp");
                    System.out.println("Mr. Chissoe's Hp: " + ehp);
                }
                else if (move.equals("fl")) {
                    System.out.println("");
                    System.out.println(mon + " uses Flamethrower!!");
                    damage = ((4 * 90 * mSpA / eSpD) / 50 + 2) * 1.5 * (Math.random() * 0.16 + 0.85);
                    ehp = ehp - (int) damage;
                    System.out.println("Mr. Chissoe loses " + (int) damage + " Hp");
                    System.out.println("Mr. Chissoe's Hp: " + ehp);
                }
                else {
                    System.out.println("");
                    System.out.println(mon + "uses Work Up!!");
                    System.out.println(mon + "'s attack rose");
                    System.out.println(mon + "'s special attack rose");
                    System.out.println("Mr. Chissoe's Hp: " + ehp);
                    mAtk = mAtk * 1.5;
                    mSpA = mSpA * 1.5;
                }

                double cD;

                if (cNum == 2 || cNum == 3 || cNum == 4) {
                    System.out.println("");
                    System.out.println("Mr. Chissoe thinks you are too weak");
                    System.out.println("He is hanging around");
                    mhp = mhp * 1;
                    System.out.println(mon + "'s Hp: " + mhp);
                }
                else if (cNum == 0 || cNum == 1 || cNum == 5 || cNum == 7) {

                    System.out.println("");
                    System.out.println("Mr. Chissoe uses Roast!!");
                    System.out.println("He mocks at you and your pokemon!");
                    cD = ((4 * 10 * eSpA / mSpD) / 50 + 2) * (Math.random() * 0.16 + 0.85);
                    System.out.println("Charmander loses " + (int) cD + " Hp");
                    mhp = mhp - (int) cD;
                    System.out.println(mon + "'s Hp: " + mhp);
                    System.out.println(mon + "'s defense fell");
                    System.out.println(mon + "'s special defense fell");
                    System.out.println("Jesus Christ you feel hurt");
                    mDef = mDef * 0.67;
                    mSpD = mSpD * 0.67;
                }
                else {
                    System.out.println("");
                    System.out.println("Mr. Chissoe uses Soccor Player's Kick!!");
                    System.out.println("What a powerful kick!");
                    cD = ((4 * 70 * eAtk / mDef) / 50 + 2) * (Math.random() * 0.16 + 0.85);
                    mhp = mhp - (int) cD;
                    System.out.println("Charmander loses " + (int) cD + " Hp");
                    System.out.println(mon + "'s Hp: " + mhp);
                }

                if (ehp < 0) {
                    System.out.println("");
                    System.out.println("====================================================");
                    System.out.println("");
                    System.out.println("Congratulations You beat Mr. Chissoe!!!!!");
                    System.out.println("Now you are the King of the G block apcs class!!!!");
                    System.out.println("");
                    System.out.println("====================================================");
                    System.exit(0);
                }
                else if (mhp < 0) {
                    System.out.println("");
                    System.out.println("Charmander fainted");
                    System.out.println("You lose to Mr. Chissoe!!");
                    System.out.println("Don't give up!! Try one more time!!");
                    System.exit(0);
                }
            }

        }
        else if (mon.equals("Bulbasaur")) {
            mhp = 45;
            System.out.println("Hp: " + mhp);
            System.out.println("We got this!!");

            while (ehp > 0) {
                System.out.println("");
                System.out.println("============================================");
                System.out.println("Please enter the move that you want to use: ");
                System.out.println("Growth     Leaf Storm    Synthesis");
                System.out.println("(Enter the move without space)");
                System.out.println("(gt for Growth)");
                System.out.println("(lf for Leaf Storm)");
                System.out.println("(st for Synthesis)");
                move = scan.next();
                int cNum = (int) (Math.random() * 9);
                if (move.equals("gt")) {
                    System.out.println("");
                    System.out.println(mon + " uses Growth!!");
                    System.out.println(mon + "'s attack and special attack rose!!");
                    mAtk = mAtk * 1.5;
                    mSpA = mSpA * 1.5;
                }
                else if (move.equals("lf")) {
                    System.out.println("");
                    System.out.println(mon + " uses Leaf Storm!!");
                    damage = ((4 * 130 * mSpA / eSpD) / 50 + 2) * 1.5 * (Math.random() * 0.16 + 0.85);
                    ehp = ehp - (int) damage;
                    System.out.println("Mr. Chissoe loses " + (int) damage + " Hp");
                    System.out.println("Mr. Chissoe's Hp: " + ehp);
                    System.out.println(mon + "'s special attack fell harshly!!");
                    mSpA *= 0.5;
                }
                else {
                    System.out.println("");
                    System.out.println(mon + "uses Synthesis!!");
                    System.out.println(mon + " recovers its Hp");
                    mhp = mhp + 23;
                    if (mhp >= 45) {
                        mhp = 45;
                        System.out.println(mon + "'s Hp: " + mhp);
                    }
                    else {
                        System.out.println(mon + "'s Hp: " + mhp);
                    }
                }

                double cD;

                if (cNum == 2 || cNum == 3 || cNum == 4) {
                    System.out.println("");
                    System.out.println("Mr. Chissoe thinks you are too weak");
                    System.out.println("He is hanging around");
                    mhp = mhp * 1;
                    System.out.println(mon + "'s Hp: " + mhp);
                }
                else if (cNum == 0 || cNum == 1 || cNum == 5 || cNum == 7) {

                    System.out.println("");
                    System.out.println("Mr. Chissoe uses Roast!!");
                    System.out.println("He mocks at you and your pokemon!");
                    cD = ((4 * 10 * eSpA / mSpD) / 50 + 2) * (Math.random() * 0.16 + 0.85);
                    System.out.println(mon + " loses " + (int) cD + " Hp");
                    mhp = mhp - (int) cD;
                    System.out.println(mon + "'s Hp: " + mhp);
                    System.out.println(mon + "'s defense fell");
                    System.out.println(mon + "'s special defense fell");
                    System.out.println("Jesus Christ you feel hurt");
                    mDef = mDef * 0.67;
                    mSpD = mSpD * 0.67;
                }
                else {
                    System.out.println("");
                    System.out.println("Mr. Chissoe uses Soccor Player's Kick!!");
                    System.out.println("What a powerful kick!");
                    cD = ((4 * 70 * eAtk / mDef) / 50 + 2) * (Math.random() * 0.16 + 0.85);
                    mhp = mhp - (int) cD;
                    System.out.println(mon + " loses " + (int) cD + " Hp");
                    System.out.println(mon + "'s Hp: " + mhp);
                }

                if (ehp < 0) {
                    System.out.println("");
                    System.out.println("====================================================");
                    System.out.println("");
                    System.out.println("Congratulations You beat Mr. Chissoe!!!!!");
                    System.out.println("Now you are the King of the G block apcs class!!!!");
                    System.out.println("");
                    System.out.println("====================================================");
                    System.exit(0);
                }
                else if (mhp < 0) {
                    System.out.println("");
                    System.out.println("Bulbasaur fainted");
                    System.out.println("You lose to Mr. Chissoe!!");
                    System.out.println("Don't give up!! Try one more time!!");
                    System.exit(0);
                }
            }
        }
        else {
            mhp = 44;
            System.out.println("Hp: " + mhp);
            System.out.println("We got this!!");

            while (ehp > 0) {
                System.out.println("");
                System.out.println("============================================");
                System.out.println("Please enter the move that you want to use: ");
                System.out.println("Power-up Punch     Surf    Iron Defense");
                System.out.println("(Enter the move without space)");
                System.out.println("(ppp for Power-up Punch)");
                System.out.println("(sf for Surf)");
                System.out.println("(id for Iron Defense)");
                move = scan.next();
                int cNum = (int) (Math.random() * 9);
                if (move.equals("ppp")) {
                    System.out.println("");
                    System.out.println(mon + " uses Power-up Punch!!");
                    damage = ((4 * 40 * mAtk / eDef) / 50 + 2) * 2 * (Math.random() * 0.16 + 0.85);
                    ehp = ehp - (int) damage;
                    System.out.println("It is super effective!");
                    System.out.println("Mr. Chissoe loses " + (int) damage + " Hp");
                    System.out.println("Mr. Chissoe's Hp: " + ehp);
                    mAtk = mAtk * 1.5;
                }
                else if (move.equals("sf")) {
                    System.out.println("");
                    System.out.println(mon + " uses Surf!!");
                    damage = ((4 * 90 * mSpA / eSpD) / 50 + 2) * 1.5 * (Math.random() * 0.16 + 0.85);
                    ehp = ehp - (int) damage;
                    System.out.println("Mr. Chissoe loses " + (int) damage + " Hp");
                    System.out.println("Mr. Chissoe's Hp: " + ehp);
                }
                else {
                    System.out.println("");
                    System.out.println(mon + " uses Iron Defense!!");
                    System.out.println(mon + "'s defense rose sharply!!");
                    mDef = mDef * 2;
                }

                double cD;

                if (cNum == 2 || cNum == 3 || cNum == 4) {
                    System.out.println("");
                    System.out.println("Mr. Chissoe thinks you are too weak");
                    System.out.println("He is hanging around");
                    mhp = mhp * 1;
                    System.out.println(mon + "'s Hp: " + mhp);
                }
                else if (cNum == 0 || cNum == 1 || cNum == 5 || cNum == 7) {

                    System.out.println("");
                    System.out.println("Mr. Chissoe uses Roast!!");
                    System.out.println("He mocks at you and your pokemon!");
                    cD = ((4 * 10 * eSpA / mSpD) / 50 + 2) * (Math.random() * 0.16 + 0.85);
                    System.out.println(mon + " loses " + (int) cD + " Hp");
                    mhp = mhp - (int) cD;
                    System.out.println(mon + "'s Hp: " + mhp);
                    System.out.println(mon + "'s defense fell");
                    System.out.println(mon + "'s special defense fell");
                    System.out.println("Jesus Christ you feel hurt");
                    mDef = mDef * 0.67;
                    mSpD = mSpD * 0.67;
                }
                else {
                    System.out.println("");
                    System.out.println("Mr. Chissoe uses Soccor Player's Kick!!");
                    System.out.println("What a powerful kick!");
                    cD = ((4 * 70 * eAtk / mDef) / 50 + 2) * (Math.random() * 0.16 + 0.85);
                    mhp = mhp - (int) cD;
                    System.out.println(mon + " loses " + (int) cD + " Hp");
                    System.out.println(mon + "'s Hp: " + mhp);
                }

                if (ehp < 0) {
                    System.out.println("");
                    System.out.println("====================================================");
                    System.out.println("");
                    System.out.println("Congratulations You beat Mr. Chissoe!!!!!");
                    System.out.println("Now you are the King of the G block apcs class!!!!");
                    System.out.println("");
                    System.out.println("====================================================");
                    System.exit(0);
                }
                else if (mhp < 0) {
                    System.out.println("");
                    System.out.println("Squirtle fainted");
                    System.out.println("You lose to Mr. Chissoe!!");
                    System.out.println("Don't give up!! Try one more time!!");
                    System.exit(0);
                }
            }
        }
    }
}
