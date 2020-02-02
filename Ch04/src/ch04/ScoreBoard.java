/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author 19502
 */
public class ScoreBoard {
    
    private int homeScore;
    private int awayScore;
    private int homeFouls;
    private int awayFouls;
    private int seconds;
    private int quarter;
    
    public ScoreBoard(int homeScore, int awayScore, int homeFouls, int awayFouls, int seconds, int quarter){
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.homeFouls = homeFouls;
        this.awayFouls = awayFouls;
        this.seconds = seconds;
        this.quarter = quarter;
    }
    
    public void twoPointer(String team){
        if (team.equals("home")){
            homeScore += 2;
        }
        else {
            awayScore += 2;
        }
    }
    
    public void timePass(int seconds){
        this.seconds -= seconds;
    }
    
    public void threePointer(String team){
        if (team.equals("home")){
            homeScore += 3;
        }
        else {
            awayScore += 3;
        }
    }
    
    public void foul(String team){
        if (team.equals("home")){
            homeFouls += 1;
        }
        else {
            awayFouls += 1;
        }
    }
    
    public void printSummary(){
        System.out.println("Home team scored: " + homeScore);
        System.out.println("Visitors scored: " + awayScore);
        System.out.println("Quarter " + quarter);
        System.out.println("Fouls");
        System.out.println("Home: " + homeFouls);
        System.out.println("Visitors: " + awayFouls);
        int minutes = seconds / 60;
        int seconds = this.seconds % 60;
        System.out.println(minutes + " minutes and " + seconds + " seconds left");
    }
    
    public String winner(){
        String winner;
        if (homeScore > awayScore){
            winner = "home";
        }
        else if (awayScore > homeScore){
            winner = "visitor";
        }
        else {
            winner = "tie";
        }
        return winner;
    }
}
