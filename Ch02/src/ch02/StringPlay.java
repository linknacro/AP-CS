/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19502
 */
public class StringPlay {
    public static void main(String[] args){
        String college = new String ("PoDunk College");
        String town = new String ("Anytown, USA");
        
        int stringLength;
        String change1;
        String change2;
        String change3;
        
        stringLength = college.length();
        System.out.println(college + "contains" + stringLength + "characters.");
        change1 = college.toUpperCase();
        change2 = change1.replace('O','*');
        change3 = change1.concat(change2);
        
        System.out.println("The final string is " + change3);
        
    
}
}