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

public class Temps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        final int HOURS_PER_DAY = 24;
        int temp, maxTemp = -1000000, minTemp = 100000;
        int timeOfMax = 0, timeOfMin = 0;

        System.out.println("");
        System.out.println("Temperature Readings for 24 Hour Period");
        System.out.println("");

        for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
            System.out.println("Enter the temperature reading at " + hour);
            temp = scan.nextInt();
            if (temp > maxTemp) {
                maxTemp = temp;
                timeOfMax = hour;
            } else {

            }
            if (temp < minTemp) {
                minTemp = temp;
                timeOfMin = hour;
            } else {

            }
        }
        System.out.println("The maximum temperature is " + maxTemp);
        System.out.println("The time is at " + timeOfMax);
        System.out.println("The minimum temperature is " + minTemp);
        System.out.println("The time is at " + timeOfMin);
    }

}
