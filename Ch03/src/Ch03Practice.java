/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19502
 */
import java.util.Scanner; 
import java.text.*;

public class Ch03Practice {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        double value = 89.35689;
        String s = twoDigits.format(value);
        System.out.println(s);
        
        
        
        
    }
}
