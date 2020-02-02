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

public class ZBug extends Bug
{

    private int steps;
    private int sideLength;
    private int count = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     *
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        setDirection(90);
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (count == 1){
            turn();
            turn();
            turn();
            count++;
        }
        if (count == 3){
            turn();
            turn();
            turn();
            turn();
            turn();
            count++;
        }
        if (count == 5){
            
        }
        if (steps < sideLength * 3 - 3 && canMove()) {
            move();
            steps++;
        }
        if (steps == sideLength - 1) {
            count++;
        }
        if (steps == sideLength * 2 - 2){
            count++;
        }
        if (steps == sideLength * 3 - 1){
            count++;
        }
    }
}
