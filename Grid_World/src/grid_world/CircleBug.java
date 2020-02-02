/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 19502
 */
import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public CircleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    public void act()
    {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        }
        else {
            turn();
            steps = 0;
        }
    }
}
