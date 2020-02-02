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
import info.gridworld.grid.Location;

public class TeleportBug extends Bug
{

    private int steps;
    private int chance;

    /**
     * Constructs a box bug that traces a square of a given side length
     *
     * @param length the side length
     */
    public TeleportBug(int length)
    {
        steps = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        chance = (int)(Math.random() * 5);
        if (steps % 3 == 0) {
            if (chance == 0) {
                moveTo(new Location((int) (Math.random() * 10), (int) (Math.random() * 10)));
            }
        }
        if (canMove()) {
            move();
            steps++;
        }
        else {
            turn();
            turn();
            steps = 0;
        }
    }
}
