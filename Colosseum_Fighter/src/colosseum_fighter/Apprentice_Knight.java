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
public class Apprentice_Knight extends Foe
{

    public Apprentice_Knight(int lv)
    {
        super(lv, "Apprentice Knight", " |\\             //\n"
                + "    \\\\           _!_\n"
                + "     \\\\         /___\\\n"
                + "      \\\\        [+++] \n"
                + "       \\\\    _ _\\^^^/_ _\n"
                + "        \\\\/ (    '-'  ( )\n"
                + "        /( \\/ | {&}   /\\ \\\n"
                + "          \\  / \\     / _> )\n"
                + "           \"`   >:::;-'`\"\"'-.\n"
                + "               /:::/         \\\n"
                + "              /  /||   {&}   |\n"
                + "             (  / (\\         /\n"
                + "             / /   \\'-.___.-'\n"
                + "           _/ /     \\ \\\n"
                + "          /___|    /___|");
        setHp(getHp() * lv / 7);
        setAtk(getAtk() * lv / 10);
        setDef(getDef() * lv / 20);
        setSpe(getSpe() * lv / 15);
        getMoves().add(new Move("Shield Up", 0, 0));
        getMoves().add(new Move("Slice", 6, 0));
        getMoves().add(new Move("Shield Tackle", 4, 0));
    }

    public String speak()
    {
        return "I fi... I fight for my Lord Cassious!!!";
    }
}
