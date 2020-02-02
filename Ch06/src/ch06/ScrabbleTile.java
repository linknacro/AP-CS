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
public class ScrabbleTile
{
    private String letter;
    private int points;

    public ScrabbleTile(String letter, int points)
    {
        this.letter = letter;
        this.points = points;
    }

    public String getLetter()
    {
        return letter;
    }

    public int getPoints()
    {
        return points;
    }

    public String toString()
    {
        return letter + "  " + points;
    }
}
