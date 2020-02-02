/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colosseum_fighter;

/**
 *
 * @author Link
 */
import java.util.Scanner;

public class Stats_Item extends Item
{

    Scanner scan = new Scanner(System.in);
    private String answer;

    public Stats_Item(String description, int amount, String graphics)
    {
        super(description, amount, graphics);
    }

    public void function(Player guy)
    {
        System.out.println("What stat do you want to boost?\n(Hp/Mp/Atk/Def/Spe)");
        answer = scan.next();
        if (answer.equals("Hp")) {
            guy.setAtk(guy.getHp() + 13);
        }
        if (answer.equals("Mp")) {
            guy.setAtk(guy.getMp() + 15);
        }
        if (answer.equals("Atk")) {
            guy.setAtk(guy.getAtk() + 7);
        }
        if (answer.equals("Def")) {
            guy.setDef(guy.getDef() + 7);
        }
        if (answer.equals("Spe")) {
            guy.setSpe(guy.getSpe() + 7);
        }
    }

    public void effect(Fighter guy)
    {
        System.out.println(guy.getName() + " gained some boost in " + answer);
    }
}
