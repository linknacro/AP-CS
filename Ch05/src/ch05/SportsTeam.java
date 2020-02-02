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
public interface SportsTeam {
    
    public abstract void setName(String name);
    public abstract void win();
    public abstract void lose();
    public abstract void printRecord();
}
