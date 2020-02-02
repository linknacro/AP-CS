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
public class Legit_Knight extends Foe
{

    public Legit_Knight(int lv)
    {
        super(lv, "Legit Knight", "     ____\n"
                + "                 []|    (______\n"
                + "                 []|__ / snd   \\\n"
                + "                 ||   \\________/\n"
                + "                 ||      ___\n"
                + "                 ||     /_  )__\n"
                + "      __|\\/)     ||   _/_ \\____)\n"
                + ",----`     \\     ||  />=o)\n"
                + "\\_____      \\    ||  \\]__\\\n"
                + "      `--,_/U\\  B|\\__/===\\\n"
                + "         |UUUU\\  ||_ _|_\\_ \\\n"
                + "         |UUUUU\\_|[,`_|__|_)\n"
                + "         |UUUUUU\\||__/_ __|\n"
                + "         |UUUUUU/-(_\\_____/-------,\n"
                + "         /UU/    |H\\__\\    HHHH|   \\\\\n"
                + "         |UU/    |H\\  |HHHHHHH|    |\\\\\\\n"
                + "         UU      |HH\\ \\HHHHHHH|    | \\\\\\\n"
                + "         U       |<_\\,_\\HHHHHH|   /  \\\\\\\n"
                + "          \\ (    |HHHHHHHHHHHHH   /  \\\\\\\\\n"
                + "           \\ \\   |=============  /    \\\\\\\\\\\n"
                + "              \\ |             | |");
        setHp(getHp() * lv / 7);
        setAtk(getAtk() * lv / 7);
        setDef(getDef() * lv / 7);
        setSpe(getSpe() * lv / 7);
        getMoves().add(new Move("Charge", 12, 0));
        getMoves().add(new Move("Guard", 12, 0));
        getMoves().add(new Move("Slash and Tackle", 8, 7));
    }

    public String speak()
    {
        return "YOU SHALL NOT PASS!!!!!!!!!";
    }
}
