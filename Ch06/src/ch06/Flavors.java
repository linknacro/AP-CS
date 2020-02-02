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
import java.util.ArrayList;
public class Flavors
{
    public static void main(String[] args)
    {
        ArrayList<String> flavors = new ArrayList<String>();
        
        flavors.add("Chocolate");
        flavors.add("Blue Berry");
        flavors.add("Straw Berry");
        flavors.add("Milk");
        
        System.out.println(flavors);
    }
}
