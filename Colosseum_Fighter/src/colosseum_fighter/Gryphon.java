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
public class Gryphon extends Foe
{

    public Gryphon(int lv)
    {
        super(lv, "Gryphon", "                               _\n"
                + "                                     _)\\.-.\n"
                + "                    .-.__,___,_.-=-. )\\`  a`\\_\n"
                + "                .-.__\\__,__,__.-=-. `/  \\     `\\\n"
                + "                {~,-~-,-~.-~,-,;;;;\\ |   '--;`)/\n"
                + "                 \\-,~_-~_-,~-,(_(_(;\\/   ,;/\n"
                + "                  \",-.~_,-~,-~,)_)_)'.  ;;(\n"
                + "                    `~-,_-~,-~(_(_(_(_\\  `;\\\n"
                + "              ,          `\"~~--,)_)_)_)\\_   \\\n"
                + "              |\\              (_(_/_(_,   \\  ;\n"
                + "              \\ '-.       _.--'  /_/_/_)   | |\n"
                + "               '--.\\    .'          /_/    | |\n"
                + "                   ))  /       \\      |   /.'\n"
                + "                  //  /,        | __.'|  ||\n"
                + "                 //   ||        /`    (  ||\n"
                + "                ||    ||      .'       \\ \\\\\n"
                + "                ||    ||    .'_         \\ \\\\\n"
                + "                 \\\\   //   / _ `\\        \\ \\\\__\n"
                + "                  \\'-'/(   _  `\\,;        \\ '--:,\n"
                + "                   `\"`  `\"` `-,,;         `\"`\",,;\n"
                + " ");
        setHp(getHp() * lv / 5);
        setAtk(getAtk() * lv / 10);
        setDef(getDef() * lv / 8);
        setSpe(getSpe() * lv / 5);
        getMoves().add(new Move("Wing attack", 8, 7));
        getMoves().add(new Move("Tornado", 15, 0));
        getMoves().add(new Move("Agility", 10, 0));
    }

    public String speak()
    {
        return "ROARRRRRRRRRRRRR!!!!!!!!!!!!!!";
    }
}
