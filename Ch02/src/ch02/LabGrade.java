/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

/**
 *
 * @author 19502
 */
import java.util.Scanner;
public class LabGrade {
    public static void main(String[] args) {
        final double IN_WEIGHT = 0.6;
        final double OUT_WEIGHT = 0.4;
        double preTotal;
        double inTotal;
        double postTotal;
        double prePts;
        double inPts;
        double postPts;
        double outClassAvg;
        double inClassAvg;
        double labGrade;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.println("The pre-lab points that the student got is: ");
        prePts = scan.nextDouble();
        System.out.println("Please enter the maximum points of pre-lab section: ");
        preTotal = scan.nextDouble();
        System.out.println("The in-class points that the student got is: ");
        inPts = scan.nextDouble();
        System.out.println("Please enter the maximum points of the in-class section: ");
        inTotal = scan.nextDouble();
        System.out.println("The post-lab points that the student got is: ");
        postPts = scan.nextDouble();
        System.out.println("Please enter the maximum points of the post-lab section: ");
        postTotal = scan.nextDouble();
        
        outClassAvg = ((prePts + postPts) / (preTotal + postTotal)) * 100;
        inClassAvg = (inPts / inTotal) * 100;
        labGrade = (outClassAvg * OUT_WEIGHT) + (inClassAvg * IN_WEIGHT);
        
        System.out.println("The student's averge on out-of-class section is " + outClassAvg + 
                "%");
        System.out.println("The student's average on in-class section is " + inClassAvg + 
                "%");
        System.out.println("The student's Lab Grade is " + labGrade + "%");
        System.out.println();
        
        
        
        
        
        
      
    }
    
}
