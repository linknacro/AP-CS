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
public class Lord_Cassius extends Foe
{

    public Lord_Cassius(int lv)
    {
        super(lv, "Lord Cassius", "                                           .\"\"--.._\n"
                + "                                           []      `'--.._\n"
                + "                                           ||__           `'-,\n"
                + "                                         `)||_ ```'--..       \\\n"
                + "                     _                    /|//}        ``--._  |\n"
                + "                  .'` `'.                /////}              `\\/\n"
                + "                 /  .\"\"\".\\              //{///\n"
                + "                /  /_  _`\\\\            // `||\n"
                + "                | |(_)(_)||          _//   ||\n"
                + "                | |  /\\  )|        _///\\   ||\n"
                + "                | |L====J |       / |/ |   ||\n"
                + "               /  /'-..-' /    .'`  \\  |   ||\n"
                + "              /   |  :: | |_.-`      |  \\  ||\n"
                + "             /|   `\\-::.| |          \\   | ||\n"
                + "           /` `|   /    | |          |   / ||\n"
                + "         |`    \\   |    / /          \\  |  ||\n"
                + "        |       `\\_|    |/      ,.__. \\ |  ||\n"
                + "        /                     /`    `\\ ||  ||\n"
                + "       |           .         /        \\||  ||\n"
                + "       |                     |         |/  ||\n"
                + "       /         /           |         (   ||\n"
                + "      /          .           /          )  ||");
        setHp(100);
        setAtk(70);
        setDef(60);
        setSpe(50);
        getMoves().add(new Move("Death Breath", 25, 0));
        getMoves().add(new Move("Drain", 15, 0));
        getMoves().add(new Move("Soul Harvest", 15, 0));
        getMoves().add(new Move("Mist", 0, 0));
    }

    public String speak()
    {
        return "You will suffer and regret forever in HELL!!!!";
    }
}
