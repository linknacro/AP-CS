/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colosseum_fighter;

import java.util.ArrayList;

/**
 *
 * @author Link
 */
public class Fighter
{

    private int lv;
    private double hp;
    private double atk;
    private double def;
    private double spe;
    private String name;
    private String graphics;
    private ArrayList<Move> moves;
    private double dodgeChance;
    
    private double CurrentDef;
    private double CurrentAtk;
    private double CurrentSpe;

    public Fighter(int lv, double hp, double atk, double def, double spe, String name, String graphics)
    {
        this.lv = lv;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spe = spe;
        this.name = name;
        this.graphics = graphics;
        moves = new ArrayList<Move>();
        dodgeChance = spe * 0.1;
        CurrentAtk = atk;
        CurrentDef = def;
        CurrentSpe = spe;
    }

    public double getCurrentDef()
    {
        return CurrentDef;
    }

    public void setCurrentDef(double CurrentDef)
    {
        this.CurrentDef = CurrentDef;
    }

    public double getCurrentAtk()
    {
        return CurrentAtk;
    }

    public void setCurrentAtk(double CurrentAtk)
    {
        this.CurrentAtk = CurrentAtk;
    }

    public double getCurrentSpe()
    {
        return CurrentSpe;
    }

    public void setCurrentSpe(double CurrentSpe)
    {
        this.CurrentSpe = CurrentSpe;
    }

    public double getDodgeChance()
    {
        return dodgeChance;
    }

    public void setDodgeChance(double dodgeChance)
    {
        this.dodgeChance = dodgeChance;
    }

    public ArrayList<Move> getMoves()
    {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves)
    {
        this.moves = moves;
    }

    public void setHp(double hp)
    {
        this.hp = hp;
    }

    public double getHp()
    {
        return hp;
    }

    

    public int getLv()
    {
        return lv;
    }

    public void setLv(int lv)
    {
        this.lv = lv;
    }

    public double getAtk()
    {
        return atk;
    }

    public void setAtk(double atk)
    {
        this.atk = atk;
    }

    public double getDef()
    {
        return def;
    }

    public void setDef(double def)
    {
        this.def = def;
    }

    public double getSpe()
    {
        return spe;
    }

    public void setGraphics(String graphics)
    {
        this.graphics = graphics;
    }

    public String getGraphics()
    {
        return graphics;
    }

    public void setSpe(double spe)
    {
        this.spe = spe;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return graphics;
    }
}
