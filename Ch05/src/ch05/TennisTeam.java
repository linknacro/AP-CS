/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author 19502
 */
public class TennisTeam implements SportsTeam {

    private int numPeople;
    private String teamName;
    private boolean isTraining;
    private int numWins = 0;
    private int numLosses = 0;

    public TennisTeam(int numPeople, String teamName, boolean isTraining) {
        this.numPeople = numPeople;
        this.teamName = teamName;
        this.isTraining = isTraining;
    }

    public void setName(String name) {
        teamName = name;
    }

    public void win() {
        numWins++;
    }

    public void lose() {
        numLosses++;
    }

    public void printRecord() {
        System.out.println("Team " + teamName + " wins " + numWins + " games.");
        System.out.println("Team " + teamName + " loses " + numLosses + " games.");
    }
}
