/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colosseum_fighter;

/**
 *
 * @author Link
 */
public class Thief extends Foe
{

    public Thief(int lv)
    {
        super(lv, "Thief", "  \\\\\\|||///\n"
                + " .  ======= \n"
                + "/ \\| O   O |\n"
                + "\\ / \\`___'/ \n"
                + " #   _| |_\n"
                + "(#) (     )  \n"
                + " #\\//|* *|\\\\ \n"
                + " #\\/(  *  )/   \n"
                + " #   =====  \n"
                + " #   (   ) \n"
                + " #   || ||\n"
                + ".#---'| |`----.\n"
                + "`#----' `-----'");
        setHp(getHp() * lv / 10);
        setAtk(getAtk() * lv / 12);
        setDef(getDef() * lv / 25);
        setSpe(getSpe() * lv / 10);
        getMoves().add(new Move("Sucker Punch", 8, 0));
        getMoves().add(new Move("Stab", 5, 0));
    }

    public String speak()
    {
        return "Give me ya GOLD!!!";
    }
}
