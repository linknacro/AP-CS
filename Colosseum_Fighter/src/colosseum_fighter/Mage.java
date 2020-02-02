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
public class Mage extends Foe
{

    public Mage(int lv)
    {
        super(lv, "Mage", "          \\'/\n"
                + "                    -= * =-\n"
                + "                .-\"-. / #,_\n"
                + "               / /\\_ \\  `#|\\\n"
                + "              / /')'\\ \\  /#/\n"
                + "             (  \\ = /  )/\\/#\n"
                + "              )  ) (  (/  \\\n"
                + "             (_.;`\"`;._)  |\n"
                + "            / (  \\|/  )   |\n"
                + "           /  /\\-'^'-/\\   |\n"
                + "          |  \\| )=@=(  \\_/\n"
                + "          |  /\\/     \\\n"
                + "          | /\\ \\      ;\n"
                + "          \\(// /'     |\n"
                + "             \\/       |\n"
                + "              |     / /\n"
                + "              | ___/\\_\\\n"
                + "              |/ / \\ \\|\n"
                + "             / | | | | \\\n"
                + "             \\_|/   \\|_/\n"
                + "              / \\`-'/ \\\n"
                + "              `-'   '-`");
        setHp(getHp() * lv / 10);
        setAtk(getAtk() * lv / 4);
        setDef(getDef() * lv / 12);
        setSpe(getSpe() * lv / 8);
        getMoves().add(new Move("Fire Ball", 13, 0));
        getMoves().add(new Move("Nasty Plot", 10, 0));
        getMoves().add(new Move("Frost Blast", 15, 0));
    }

    public String speak()
    {
        return "Abracadabra!!!";
    }
}
