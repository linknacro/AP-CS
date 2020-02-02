/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmeyourskills01;

/**
 *
 * @author 19502
 */
import java.util.Scanner;
import java.io.IOException;
public class Isolated_Island
{

    private int numLogs;
    private int numWater;
    private int numFood;
    private boolean poisoned;
    private int actionPoints;

    public static void main(String... arg) throws IOException, InterruptedException
    {
        printStars();
        System.out.println("IMPORTANT!!!\n");
        System.out.println("To have better game experience, double click the tag to enter full screeen\n");
        System.out.println("If you are already in full screen, ignore it");
        printStars();
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        promptEnterKey();
        Runtime.getRuntime().exec("cls");
        printInstruction();
    }

    public static void promptEnterKey()
    {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void printStars()
    {
        System.out.println("***********************************");
    }

    public static void printInstruction()
    {
        printStars();
        System.out.println("");
        System.out.println("Welcome to Isolated Island!!!!\n");
        printStars();

        promptEnterKey();
        clear();
        System.out.println("You are on an isolated island");
    }

    public static void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
