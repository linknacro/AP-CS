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
public class Gnome extends Foe
{

    public Gnome(int lv)
    {
        super(lv, "Gnome", " ,-.\n"
                + "            ) \\\n"
                + "        .--'   |\n"
                + "       /       /\n"
                + "       |_______|\n"
                + "      (  O   O  )\n"
                + "       {'-(_)-'}\n"
                + "     .-{   ^   }-.\n"
                + "    /   '.___.'   \\\n"
                + "   /  |    o    |  \\\n"
                + "   |__|    o    |__|\n"
                + "   (((\\_________/)))\n"
                + "       \\___|___/\n"
                + "      --' | | '--.\n"
                + "     \\__._| |_.__/");
        setHp(getHp() * lv / 10);
        setAtk(getAtk() * lv / 15);
        setDef(getDef() * lv / 25);
        setSpe(getSpe() * lv / 5);
        getMoves().add(new Move("Mock", 3, 0));
        getMoves().add(new Move("Tackle", 5, 0));
    }

    public String speak()
    {
        return "GROINK    GROINK";
    }
}
