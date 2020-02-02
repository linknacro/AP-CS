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
import java.util.ArrayList;

public class Player extends Fighter
{

    private double currentHp;
    private double exp;
    private double mp;
    private double currentMp;
    private double expRequired = 40;
    private double expInc = 40;
    private ArrayList<Item> bag;
    private ArrayList<Equipment> equipments;
    private ArrayList<Equipment> gears;

    public Player()
    {
        super(1, 20, 10, 10, 10, "Player", ",   A           {}\n"
                + " / \\, | ,        .--.\n"
                + "|    =|= >      /.--.\\\n"
                + " \\ /` | `       |====|\n"
                + "  `   |         |`::`|  \n"
                + "      |     .-;`\\..../`;_.-^-._\n"
                + "     /\\\\/  /  |...::..|`   :   `|\n"
                + "     |:'\\ |   /'''::''|   .:.   |\n"
                + "      \\ /\\;-,/\\   ::  |..:::::..|\n"
                + "      |\\ <` >  >._::_.| ':::::' |\n"
                + "      | `\"\"`  /   ^^  |   ':'   |\n"
                + "      |       |       \\    :    /\n"
                + "      |       |        \\   :   / \n"
                + "      |       |___/\\___|`-.:.-`\n"
                + "      |        \\_ || _/    `\n"
                + "      |        <_ >< _>\n"
                + "      |        |  ||  |\n"
                + "      |        |  ||  |\n"
                + "      |       _\\.:||:./_\n"
                + "      |      /____/\\____\\");
        exp = 0;
        mp = 15;
        bag = new ArrayList<Item>();
        bag.add(new Healing_Item("Apple", 15, " ,--./,-.\n"
                + " / #      \\\n"
                + "|          |\n"
                + " \\        /       \n"
                + "  `._,._,'"));
        equipments = new ArrayList<Equipment>(2);
        currentHp = getHp();
        currentMp = mp;
        getMoves().add(new Move("Strike", 15, 0));
        gears = new ArrayList<Equipment>();
    }

    public ArrayList<Equipment> getGears()
    {
        return gears;
    }

    public void use(Item thing)
    {
        thing.function(this);
    }

    public void setGears(ArrayList<Equipment> gears)
    {
        this.gears = gears;
    }

    public double getCurrentHp()
    {
        return currentHp;
    }

    public void setCurrentHp(double currentHp)
    {
        this.currentHp = currentHp;
    }

    public double getCurrentMp()
    {
        return currentMp;
    }

    public void setCurrentMp(double currentMp)
    {
        this.currentMp = currentMp;
    }

    public double getExpInc()
    {
        return expInc;
    }

    public void setExpInc(double expInc)
    {
        this.expInc = expInc;
    }

    public double getExp()
    {
        return exp;
    }

    public void setExp(double exp)
    {
        this.exp = exp;
    }

    public double getMp()
    {
        return mp;
    }

    public void setMp(double mp)
    {
        this.mp = mp;
    }

    public double getExpRequired()
    {
        return expRequired;
    }

    public void setExpRequired(double expRequired)
    {
        this.expRequired = expRequired;
    }

    public ArrayList<Item> getBag()
    {
        return bag;
    }

    public void setBag(ArrayList<Item> bag)
    {
        this.bag = bag;
    }

    public ArrayList<Equipment> getEquipments()
    {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments)
    {
        this.equipments = equipments;
    }

    public void Equip(Equipment thing, int i)
    {
        thing.function(this);
        equipments.add(i, thing);
    }

    public void lvUp(double exp)
    {
        System.out.println("You gained " + exp + " EXP");
        this.exp += exp;
        if (this.exp >= expRequired) {
            System.out.println("LEVEL UP ! HECK YEAH!");
            setLv(getLv() + 1);
            double expExtra = this.exp - expRequired;
            this.exp = expExtra;
            expRequired += expInc;
            expInc += 10;
            if (getLv() < 6) {
                setHp(getHp() + 15);
                setAtk(getAtk() + 10);
                setDef(getDef() + 10);
                setSpe(getSpe() + 10);
                mp += 15;
            }
            else {
                setHp(getHp() + 18);
                setAtk(getAtk() + 15);
                setDef(getDef() + 15);
                setSpe(getSpe() + 15);
                mp += 18;
            }
            System.out.println("You leanred: " + learn().getName());
        }
    }

    public Move learn()
    {
        Move newMove;
        if (getLv() == 2) {
            newMove = new Move("Heal", 60, 2);
            getMoves().add(newMove);
            return newMove;
        }
        if (getLv() == 4) {
            newMove = new Move("Reflect", 10, 6);
            getMoves().add(newMove);
            return newMove;
        }
        if (getLv() == 5) {
            newMove = new Move("Fire Ball", 20, 4);
            getMoves().add(newMove);
            return newMove;
        }
        if (getLv() == 6) {
            newMove = new Move("Hype Up", 0, 3);
            getMoves().add(newMove);
            return newMove;
        }
        if (getLv() == 8) {
            newMove = new Move("いあいどう", 35, 6);
            getMoves().add(newMove);
            return newMove;
        }
        if (getLv() == 9) {
            newMove = new Move("Agility", 0, 4);
            getMoves().add(newMove);
            return newMove;
        }
        if (getLv() == 10) {
            newMove = new Move("Triple", 0, 10);
            getMoves().add(newMove);
            return newMove;
        }
        return new Move("Nothing", 0, 0);
    }
}
