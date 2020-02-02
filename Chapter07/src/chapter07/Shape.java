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
public abstract class Shape
{

    private String shapeName;

    public abstract double area();

    public Shape(String name)
    {
        shapeName = name;
    }

    public String toString()
    {
        return shapeName;
    }
}
