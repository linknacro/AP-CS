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
import java.text.DecimalFormat;
public class PaintThings
{

    public static void main(String[] args)
    {
        final double COVERAGE = 350;
        Paint p =  new Paint(COVERAGE);
        
        Rectangle deck = new Rectangle(20, 30);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(30, 10);
        
        double deckAmt = p.amount(deck);
        double ballAmt = p.amount(bigBall);
        double tankAmt = p.amount(tank);
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
