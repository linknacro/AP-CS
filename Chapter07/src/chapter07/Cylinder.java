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
public class Cylinder extends Shape
{

    private double height;
    private double radius;

    public Cylinder(double height, double radius)
    {
        super("cylinder");
        this.height = height;
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * radius * 2 * height;
    }

    public String toString()
    {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
