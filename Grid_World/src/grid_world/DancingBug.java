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

public class DancingBug extends Bug
{

    int[] turnInstructions;
    private int index = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     *
     * @param length the side length
     */
    public DancingBug(int[] nums)
    {
        turnInstructions = nums;
    }

    public void act()
    {
        if (index == turnInstructions.length - 1){
            index = 0;
        }
        for (int i = 0; i < turnInstructions[index]; i++) {
            turn();
        }
        if (canMove()) {
            move();
        }
        else {
            turn();
        }
        index++;
    }

}
