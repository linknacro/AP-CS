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
public class Rectangle extends Shape
{

    private double width;
    private double length;

    public Rectangle(double width, double length)
    {
        super("rectangle");
        this.width = width;
        this.length = length;
    }

    public double area()
    {
        return width * length;
    }

    public String toString()
    {
        return super.toString() + " of width " + width + " and length " + length;
    }
}
