/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter07;

/**
 *
 * @author 19502
 */
public class GuessWord
{
    public static void main(String[] args)
    {
        HiddenWord answer = new HiddenWord("HARPS");
        System.out.println(answer.getHint("HARPS"));
    }
}
