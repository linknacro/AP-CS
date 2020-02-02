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
import java.util.Scanner;
import java.util.ArrayList;

public class Driver
{

    private static Move theMove;
    private static Move foeMove;
    private static double damage;
    private static boolean isTripled = false;
    private static boolean willReflect = false;
    private static double foeMaxHp;
    private static boolean foundEnemy = false;
    private static ArrayList<Item> gameItems = new ArrayList<Item>();
    private static boolean gameBeaten = false;
    private static boolean gameOver = false;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("*********************************");
        System.out.println("Welcome to COLOSSRUM FIGHTER!!!!!");
        System.out.println("*********************************");
        System.out.println("You are a knight who is dedicated to defeat the evil LORD CASSIUS");
        System.out.println("There will be enemies in your way");
        System.out.println("Equipment the equipment that you have found and use the items and moves wisely");
        System.out.println("Fight your way out and good luck with your advanture!!!!");
        System.out.println("////////////////////////////////////////////////////////////////\n\n\n");

        gameItems.add(new Exp_Item("Small Exp Booklet", 30, " _______\n"
                + "   /      /,\n"
                + "  /      //\n"
                + " /______//\n"
                + "(______(/"));
        gameItems.add(new Exp_Item("Big Exp Booklet", 60, "   ______ ______\n"
                + "    _/      Y      \\_\n"
                + "   // ~~ ~~ | ~~ ~  \\\\\n"
                + "  // ~ ~ ~~ | ~~~ ~~ \\\\\n"
                + " //________.|.________\\\\\n"
                + "`----------`-'----------'"));
        gameItems.add(new Healing_Item("Apple", 15,
                "    ,--./,-.\n"
                + " / #      \\\n"
                + "|          |\n"
                + " \\        /       \n"
                + "  `._,._,'"));
        gameItems.add(new Healing_Item("Butter Scotch Pie", 25, "(\n"
                + "          )\n"
                + "     __..---..__\n"
                + " ,-='  /  |  \\  `=-.\n"
                + ":--..___________..--;\n"
                + " \\.,_____________,./"));
        gameItems.add(new Stats_Item("Nutritious Beverage", 5, "   .\n"
                + "  .\n"
                + " . .\n"
                + "  ...\n"
                + "\\~~~~~/\n"
                + " \\   /\n"
                + "  \\ /\n"
                + "   V\n"
                + "   |\n"
                + "   |\n"
                + "  ---"));

        Player guy = new Player();

        while (!gameBeaten && !gameOver) {

            while (!foundEnemy) {
                freePeriod(guy);
            }

            battle(guy, encounter(guy.getLv()));
        }

        if (gameBeaten) {
            gameBeaten();
        }

        if (gameOver) {
            gameOver();
        }
    }

    public static void freePeriod(Player guy)
    {
        System.out.println("*********************************************\n");
        System.out.println("Would you like to: \n1. Explore\n2. Equip\n3. See Stats\n4. Use Items");
        System.out.println("(1/2/3/4)");
        int reply = scan.nextInt();
        if (reply == 1) {
            explore(guy);
        }
        if (reply == 2) {
            equip(guy);
        }
        if (reply == 3) {
            seeStats(guy);
        }
        if (reply == 4) {
            useItems(guy);
        }
    }

    public static void explore(Player guy)
    {
        System.out.println("*********************************************\n");
        int random = (int) (Math.random() * 100);
        if (random <= 49) {
            if (random <= 9) {
                System.out.println("You have found a " + gameItems.get(0).getDescription());
                System.out.println(gameItems.get(0));
                guy.getBag().add(gameItems.get(0));
            }
            else if (random <= 29) {
                System.out.println("You have found a " + gameItems.get(2).getDescription());
                System.out.println(gameItems.get(2));
                guy.getBag().add(gameItems.get(2));
            }
            else if (random <= 34) {
                System.out.println("You have found a " + gameItems.get(1).getDescription());
                System.out.println(gameItems.get(1));
                guy.getBag().add(gameItems.get(1));
            }
            else if (random <= 44) {
                System.out.println("You have found a " + gameItems.get(3).getDescription());
                System.out.println(gameItems.get(3));
                guy.getBag().add(gameItems.get(3));
            }
            else {
                System.out.println("You have found a " + gameItems.get(4).getDescription());
                System.out.println(gameItems.get(4));
                guy.getBag().add(gameItems.get(4));
            }
        }
        else {
            System.out.println("You encounter an enemy!!!");
            foundEnemy = true;
        }
    }

    public static void seeStats(Player guy)
    {
        System.out.println("*********************************************");
        System.out.println("STATS: \n");
        System.out.println("Lv: " + guy.getLv());
        System.out.println("Hp: " + (int) guy.getCurrentHp());
        System.out.println("Mp: " + guy.getCurrentMp());
        System.out.println("Atk: " + guy.getAtk());
        System.out.println("Def: " + guy.getDef());
        System.out.println("Spe: " + guy.getSpe());
        System.out.println("Exp: " + guy.getExp());
        System.out.println("You need " + (guy.getExpRequired() - guy.getExp()) + " Exps to go to the next level");
        System.out.println("Moves: ");
        for (int i = 0; i < guy.getMoves().size(); i++) {
            System.out.print(guy.getMoves().get(i).getName() + "    " + guy.getMoves().get(i).getCost() + " Mp\n");
        }
        if (guy.getEquipments().size() < 1) {
            System.out.println("You are not wearing any equipments");
        }
        else {
            System.out.println("You are now wearing: ");
            for (int i = 0; i < guy.getEquipments().size(); i++) {
                System.out.println(guy.getEquipments().get(i).getDescription() + "\n" + guy.getEquipments().get(i));
            }
        }
        System.out.println("*********************************************\n");
    }

    public static void equip(Player guy)
    {
        System.out.println("*********************************************\n");
        if (guy.getGears().size() < 1) {
            System.out.println("You do not have any equipments");
        }
        else {
            System.out.println("Here are the equipments: ");
            for (int i = 0; i < guy.getGears().size(); i++) {
                System.out.println("" + (1 + i) + ". " + guy.getGears().get(i).getDescription() + "\n " + guy.getGears().get(i));
            }
            String answer = "y";
            int reply;
            while (!answer.equals("n")) {
                System.out.println("Which one do you want to equip? (enter the number in front of the equipment and 0 to exit)");
                reply = scan.nextInt();
                if (reply == 0) {
                    break;
                }
                if (guy.getGears().size() < 1) {
                    System.out.println("You do not have any equipments");
                    break;
                }
                Equipment theGear = guy.getGears().get(reply - 1);
                guy.getEquipments().add(theGear);
                theGear.function(guy);
                guy.getGears().remove(reply - 1);
                System.out.println("You are now wearing " + theGear.getDescription());
                System.out.println("Do you want to keep equiping equipments? (y/n)");
                answer = scan.next();
                if (guy.getEquipments().size() == 2) {
                    System.out.println("You can only wear two gears");
                    break;
                }
            }
        }
        System.out.println("*********************************************\n");
    }

    public static void useItems(Player guy)
    {
        System.out.println("*********************************************\n");
        if (guy.getBag().size() < 1) {
            System.out.println("You do not have any items");
        }
        else {
            int reply;
            String answer = "y";
            while (!answer.equals("n")) {
                System.out.println("Here are your items: ");
                for (int i = 0; i < guy.getBag().size(); i++) {
                    System.out.println("" + (i + 1) + ". " + guy.getBag().get(i).getDescription() + " \n" + guy.getBag().get(i));
                }
                System.out.println("What do you want to use? (enter the number in front of the item and 0 to exit)");
                reply = scan.nextInt();
                if (reply == 0) {
                    break;
                }
                System.out.println("You used " + guy.getBag().get(reply - 1).getDescription());
                guy.getBag().get(reply - 1).function(guy);
                guy.getBag().get(reply - 1).effect(guy);
                checkHp(guy);
                guy.getBag().remove(reply - 1);
                System.out.println("Do you want to keep using items? (y/n)");
                answer = scan.next();
                if (guy.getBag().size() < 1) {
                    System.out.println("You do not have any items anymore");
                    break;
                }
            }
        }
        System.out.println("*********************************************\n");
    }

    public static Foe encounter(int lv)
    {
        Foe theFoe;
        int random = (int) (Math.random() * 3);
        if (lv < 5) {
            if (random == 0) {
                theFoe = new Thief(lv);
            }
            else if (random == 1) {
                theFoe = new Gnome(lv);
            }
            else {
                theFoe = new Apprentice_Knight(lv);
            }
        }
        else {
            if (random == 0) {
                theFoe = new Gryphon(lv);
            }
            else if (random == 1) {
                theFoe = new Legit_Knight(lv);
            }
            else {
                theFoe = new Mage(lv);
            }
        }
        if (lv == 5) {
            theFoe = new Dragon(lv);
        }
        if (lv == 10) {
            theFoe = new Lord_Cassius(lv);
        }
        return theFoe;
    }

    public static void battle(Player guy, Foe jerk)
    {

        System.out.println("*****************************************");
        System.out.println(jerk);
        System.out.println("");
        System.out.print("Hp: ");
        if (jerk.getHp() > 1) {
            for (int i = 0; i < (int) jerk.getHp() + 1; i++) {
                System.out.print("|");
            }
        }
        else {
            System.out.print("");
        }
        System.out.println("\n\n\n");
        System.out.println(guy);
        System.out.println("");
        System.out.print("Hp: ");
        if (guy.getMp() > 0) {
            for (int i = 0; i < (int) guy.getCurrentHp() + 1; i++) {
                System.out.print("|");
            }
        }
        else {
            System.out.print("");
        }
        System.out.println("");
        System.out.print("Mp: ");
        for (int i = 0; i < (int) guy.getCurrentMp(); i++) {
            System.out.print("|");
        }
        System.out.println("\n");
        System.out.println(jerk.getName() + " is in your way!");
        System.out.println(jerk.getName() + ": " + jerk.speak());
        foeMaxHp = jerk.getHp();

        while (guy.getCurrentHp() >= 1 && jerk.getHp() >= 1) {
            battleMenu(guy);
            foeMove = generateFoeMove(jerk);
            if (theMove == null) {
                enemyTurn(guy, jerk, foeMove);
            }
            else if (guy.getSpe() > jerk.getSpe()) {
                playerTurn(guy, jerk, theMove);
                enemyTurn(guy, jerk, foeMove);
            }
            else {
                enemyTurn(guy, jerk, foeMove);
                playerTurn(guy, jerk, theMove);
            }
            printBattle(guy, jerk);
            turnResult(guy, jerk);
            willReflect = false;
            theMove = new Move("Nothing", 0, 0);
        }

        conclude(guy, jerk);
    }

    public static void turnResult(Player guy, Foe jerk)
    {
        if (guy.getSpe() > jerk.getSpe()) {
            if (isTripled) {
                if (theMove.getName().equals("Strike") || theMove.getName().equals("Fire Ball") || theMove.getName().equals("いあいどう")) {
                    System.out.println("You used " + theMove.getName());
                    System.out.println(jerk.getName()
                            + " took " + (int) ((calcDamage(guy, jerk, theMove) * 3)) + " damage");
                }
                if (theMove.getName().equals("Hype Up")
                        || theMove.getName().equals("Agility")
                        || theMove.getName().equals("Heal")) {
                    if (theMove.getName().equals("Hype Up")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Attack increases by " + (int) (calcDamage(guy, guy, theMove) * 3));
                    }
                    if (theMove.getName().equals("Agility")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Speed increased by " + (int) (calcDamage(guy, guy, theMove) * 3));
                    }
                    if (theMove.getName().equals("Heal")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("You recovered " + (int) (calcDamage(guy, guy, theMove) * 3) + " Hp");
                    }
                }
                if (theMove.getName().equals("Triple")) {
                    isTripled = true;
                    System.out.println("You used " + theMove.getName());
                    System.out.println("The effect of the move next turn will be tripled");
                }
                if (theMove.getName().equals("Reflect")) {
                    willReflect = true;
                }
            }

            else {
                if (theMove.getName().equals("Strike") || theMove.getName().equals("Fire Ball") || theMove.getName().equals("いあいどう")) {
                    System.out.println("You used " + theMove.getName());
                    System.out.println(jerk.getName()
                            + " took " + (int) (calcDamage(guy, jerk, theMove)) + " damage");
                }
                if (theMove.getName().equals("Hype Up")
                        || theMove.getName().equals("Agility")
                        || theMove.getName().equals("Heal")) {
                    if (theMove.getName().equals("Hype Up")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Attack increases by " + (int) calcDamage(guy, guy, theMove));
                    }
                    if (theMove.getName().equals("Agility")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Speed increased by " + (int) calcDamage(guy, guy, theMove));
                    }
                    if (theMove.getName().equals("Heal")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("You recovered " + (int) calcDamage(guy, guy, theMove) + " Hp");
                    }
                }
                if (theMove.getName().equals("Triple")) {
                    isTripled = true;
                    System.out.println("You used " + theMove.getName());
                    System.out.println("The effect of the move next turn will be tripled");
                }
                if (theMove.getName().equals("Reflect")) {
                    willReflect = true;
                }
            }

            if (!willReflect) {
                if (foeMove.getName().equals("Sucker Punch")
                        || foeMove.getName().equals("Stab") || foeMove.getName().equals("Slice")
                        || foeMove.getName().equals("Shield Tackle")
                        || foeMove.getName().equals("Tackle")
                        || foeMove.getName().equals("Death Breath")
                        || foeMove.getName().equals("Flame Thrower")
                        || foeMove.getName().equals("Earthquake")
                        || foeMove.getName().equals("Frost Blast")
                        || foeMove.getName().equals("Fire Ball")
                        || foeMove.getName().equals("Charge")
                        || foeMove.getName().equals("Tornado")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) + " damage");
                }
                if (foeMove.getName().equals("Mock")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("Your Def decreased by " + (int) calcDamage(jerk, guy, foeMove));
                }
                if (foeMove.getName().equals("Shield Up")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Def increased by 1.2 times");
                }
                if (foeMove.getName().equals("Agility")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Spe increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Wing Attack")
                        || foeMove.getName().equals("Slash and Tackle")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) + " damage");
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) + " damage");
                }
                if (foeMove.getName().equals("Slack Off")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " recovered its Hp by 5");
                }
                if (foeMove.getName().equals("Nasty Plot")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Drain")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " drained " + (int) calcDamage(jerk, guy, foeMove) + " Hp from you");
                    System.out.println(jerk.getName() + " recovered " + (int) calcDamage(jerk, guy, foeMove) * 0.75 + " Hp");
                }
                if (foeMove.getName().equals("Mist")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " sets both fighters' stats to default");
                }
                if (foeMove.getName().equals("Soul Harvest")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " increased its Atk by " + (int) calcDamage(jerk, jerk, foeMove) + " and "
                            + "recovered its Hp by 15");
                }
            }
            else {
                if (foeMove.getName().equals("Sucker Punch")
                        || foeMove.getName().equals("Stab") || foeMove.getName().equals("Slice")
                        || foeMove.getName().equals("Shield Tackle")
                        || foeMove.getName().equals("Tackle")
                        || foeMove.getName().equals("Death Breath")
                        || foeMove.getName().equals("Flame Thrower")
                        || foeMove.getName().equals("Earthquake")
                        || foeMove.getName().equals("Frost Blast")
                        || foeMove.getName().equals("Fire Ball")
                        || foeMove.getName().equals("Charge")
                        || foeMove.getName().equals("Tornado")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) / 2 + " damage");
                }
                if (foeMove.getName().equals("Mock")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("Your Def decreased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Shield Up")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Def increased by 1.2 times");
                }
                if (foeMove.getName().equals("Agility")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Spe increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Wing Attack")
                        || foeMove.getName().equals("Slash and Tackle")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) / 2 + " damage");
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) / 2 + " damage");
                }
                if (foeMove.getName().equals("Slack Off")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " recovered its Hp by 5");
                }
                if (foeMove.getName().equals("Nasty Plot")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Drain")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " drained " + (int) calcDamage(jerk, guy, foeMove) / 2 + " Hp from you");
                    System.out.println(jerk.getName() + " recovered " + (int) calcDamage(jerk, guy, foeMove) / 2 * 0.75 + " Hp");
                }
                if (foeMove.getName().equals("Mist")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " sets both fighters' stats to default");
                }
                if (foeMove.getName().equals("Soul Harvest")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " increased its Atk by " + (int) calcDamage(jerk, jerk, foeMove) + " and "
                            + "recovered its Hp by 15");
                }

                System.out.println("You used Reflect");
                System.out.println("You blocked some damage from " + jerk.getName() + " and "
                        + "reflected " + (int) calcDamage(guy, jerk, new Move("Reflect", 10, 6)) + " damage to " + jerk.getName());
            }
        }
        else {

            if (!willReflect) {
                if (foeMove.getName().equals("Sucker Punch")
                        || foeMove.getName().equals("Stab") || foeMove.getName().equals("Slice")
                        || foeMove.getName().equals("Shield Tackle")
                        || foeMove.getName().equals("Tackle")
                        || foeMove.getName().equals("Death Breath")
                        || foeMove.getName().equals("Flame Thrower")
                        || foeMove.getName().equals("Earthquake")
                        || foeMove.getName().equals("Frost Blast")
                        || foeMove.getName().equals("Fire Ball")
                        || foeMove.getName().equals("Charge")
                        || foeMove.getName().equals("Tornado")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) + " damage");
                }
                if (foeMove.getName().equals("Mock")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("Your Def decreased by " + (int) calcDamage(jerk, guy, foeMove));
                }
                if (foeMove.getName().equals("Shield Up")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Def increased by 1.2 times");
                }
                if (foeMove.getName().equals("Agility")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Spe increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Wing Attack")
                        || foeMove.getName().equals("Slash and Tackle")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) + " damage");
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) + " damage");
                }
                if (foeMove.getName().equals("Slack Off")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " recovered its Hp by 5");
                }
                if (foeMove.getName().equals("Nasty Plot")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Drain")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " drained " + (int) calcDamage(jerk, guy, foeMove) + " Hp from you");
                    System.out.println(jerk.getName() + " recovered " + (int) calcDamage(jerk, guy, foeMove) * 0.75 + " Hp");
                }
                if (foeMove.getName().equals("Mist")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " sets both fighters' stats to default");
                }
                if (foeMove.getName().equals("Soul Harvest")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " increased its Atk by " + (int) calcDamage(jerk, jerk, foeMove) + " and "
                            + "recovered its Hp by 15");
                }
            }
            else {
                if (foeMove.getName().equals("Sucker Punch")
                        || foeMove.getName().equals("Stab") || foeMove.getName().equals("Slice")
                        || foeMove.getName().equals("Shield Tackle")
                        || foeMove.getName().equals("Tackle")
                        || foeMove.getName().equals("Death Breath")
                        || foeMove.getName().equals("Flame Thrower")
                        || foeMove.getName().equals("Earthquake")
                        || foeMove.getName().equals("Frost Blast")
                        || foeMove.getName().equals("Fire Ball")
                        || foeMove.getName().equals("Charge")
                        || foeMove.getName().equals("Tornado")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) / 2 + " damage");
                }
                if (foeMove.getName().equals("Mock")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("Your Def decreased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Shield Up")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Def increased by 1.2 times");
                }
                if (foeMove.getName().equals("Agility")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Spe increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Wing Attack")
                        || foeMove.getName().equals("Slash and Tackle")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) / 2 + " damage");
                    System.out.println("You took " + (int) calcDamage(jerk, guy, foeMove) / 2 + " damage");
                }
                if (foeMove.getName().equals("Slack Off")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " recovered its Hp by 5");
                }
                if (foeMove.getName().equals("Nasty Plot")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                    System.out.println(jerk.getName() + "'s Atk increased by " + (int) calcDamage(jerk, jerk, foeMove));
                }
                if (foeMove.getName().equals("Drain")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " drained " + (int) calcDamage(jerk, guy, foeMove) / 2 + " Hp from you");
                    System.out.println(jerk.getName() + " recovered " + (int) calcDamage(jerk, guy, foeMove) / 2 * 0.75 + " Hp");
                }
                if (foeMove.getName().equals("Mist")) {
                    defaultStats(guy, jerk);
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " sets both fighters' stats to default");
                }
                if (foeMove.getName().equals("Soul Harvest")) {
                    System.out.println(jerk.getName() + " used " + foeMove.getName());
                    System.out.println(jerk.getName() + " increased its Atk by " + (int) calcDamage(jerk, jerk, foeMove) + " and "
                            + "recovered its Hp by 15");
                }

                System.out.println("You used Reflect");
                System.out.println("You blocked some damage from " + jerk.getName() + " and "
                        + "reflected " + (int) calcDamage(guy, jerk, new Move("Reflect", 10, 6)) + " damage to " + jerk.getName());
            }
            if (isTripled) {
                if (theMove.getName().equals("Strike") || theMove.getName().equals("Fire Ball") || theMove.getName().equals("いあいどう")) {
                    System.out.println("You used " + theMove.getName());
                    System.out.println(jerk.getName()
                            + " took " + (int) ((calcDamage(guy, jerk, theMove) * 3)) + " damage");
                }
                if (theMove.getName().equals("Hype Up")
                        || theMove.getName().equals("Agility")
                        || theMove.getName().equals("Heal")) {
                    if (theMove.getName().equals("Hype Up")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Attack increases by " + (int) (calcDamage(guy, guy, theMove) * 3));
                    }
                    if (theMove.getName().equals("Agility")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Speed increased by " + (int) (calcDamage(guy, guy, theMove) * 3));
                    }
                    if (theMove.getName().equals("Heal")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("You recovered " + (int) (calcDamage(guy, guy, theMove) * 3) + " Hp");
                    }
                }
                if (theMove.getName().equals("Triple")) {
                    isTripled = true;
                    System.out.println("You used " + theMove.getName());
                    System.out.println("The effect of the move next turn will be tripled");
                }
                if (theMove.getName().equals("Reflect")) {
                    willReflect = true;
                }
            }

            else {
                if (theMove.getName().equals("Strike") || theMove.getName().equals("Fire Ball") || theMove.getName().equals("いあいどう")) {
                    System.out.println("You used " + theMove.getName());
                    System.out.println(jerk.getName()
                            + " took " + (int) (calcDamage(guy, jerk, theMove)) + " damage");
                }
                if (theMove.getName().equals("Hype Up")
                        || theMove.getName().equals("Agility")
                        || theMove.getName().equals("Heal")) {
                    if (theMove.getName().equals("Hype Up")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Attack increases by " + (int) calcDamage(guy, guy, theMove));
                    }
                    if (theMove.getName().equals("Agility")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("Your Speed increased by " + (int) calcDamage(guy, guy, theMove));
                    }
                    if (theMove.getName().equals("Heal")) {
                        System.out.println("You used " + theMove.getName());
                        System.out.println("You recovered " + (int) calcDamage(guy, guy, theMove) + " Hp");
                    }
                }
                if (theMove.getName().equals("Triple")) {
                    isTripled = true;
                    System.out.println("You used " + theMove.getName());
                    System.out.println("The effect of the move next turn will be tripled");
                }
                if (theMove.getName().equals("Reflect")) {
                    willReflect = true;
                }
            }
        }
    }

    public static void printBattle(Player guy, Foe jerk)
    {
        System.out.println("*****************************************");
        System.out.println(jerk);
        System.out.print("Hp: ");
        if (jerk.getHp() > 1) {
            for (int i = 0; i < (int) jerk.getHp() + 1; i++) {
                System.out.print("|");
            }
        }
        else {
            System.out.print("");
        }
        System.out.println("\n\n\n");
        System.out.println(guy);
        System.out.print("Hp: ");
        if (guy.getMp() > 1) {
            for (int i = 0; i < (int) guy.getCurrentHp() + 1; i++) {
                System.out.print("|");
            }
        }
        else {
            System.out.print("");
        }
        System.out.println("");
        System.out.print("Mp: ");
        for (int i = 0; i < (int) guy.getCurrentMp(); i++) {
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("_________________________________________");
    }

    public static void battleMenu(Player guy)
    {
        System.out.println("*********************************************");
        System.out.println("What would you like to do: ");
        System.out.println("1. Fight");
        System.out.println("2. Use Items");
        System.out.println("What is your choice? (1/2)");
        int reply = scan.nextInt();
        if (reply == 1) {
            System.out.println("Your have: ");
            for (int i = 0; i < guy.getMoves().size(); i++) {
                System.out.print("" + (i + 1) + ". " + guy.getMoves().get(i) + "   " + guy.getMoves().get(i).getCost() + " Mp\n");
            }
            System.out.println("Please enter the number of the move: ");
            reply = scan.nextInt();
            while (guy.getMoves().get(reply - 1).getCost() > guy.getCurrentMp()) {
                System.out.println("You do not have enough Mp to use this move");
                System.out.println("Plese re-enter the number: ");
                reply = scan.nextInt();
            }
            while (reply <= 0 || reply > guy.getMoves().size()) {
                System.out.println("Plese re-enter the number: ");
                reply = scan.nextInt();
            }
            theMove = guy.getMoves().get(reply - 1);
        }
        else {
            if (guy.getBag().size() > 0) {
                System.out.println("You have: ");
                for (int i = 0; i < guy.getBag().size(); i++) {
                    System.out.print("" + (i + 1) + ". " + guy.getBag().get(i).getDescription() + "    ");
                }
                System.out.println("Please enter the number of the item: ");
                reply = scan.nextInt();
                while (reply <= 0 || reply > guy.getBag().size()) {
                    System.out.println("Plese re-enter the number: ");
                    reply = scan.nextInt();
                }
                System.out.println("You used \n" + guy.getBag().get(reply - 1));
                guy.use(guy.getBag().get(reply - 1));
                guy.getBag().get(reply - 1).effect(guy);
                guy.getBag().remove(reply - 1);
                checkHp(guy);
            }
            else {
                System.out.println("You do not have any items in your bag");
            }
            theMove = new Move("Nothing", 0, 0);
        }
        System.out.println("*********************************************");
    }

    public static double calcDamage(Fighter character, Fighter opponent, Move theMove)
    {
        damage = (2 * character.getLv() / 5 + 2) * theMove.getPower()
                * (character.getAtk() / (opponent.getDef() * 0.8)) / 50 + 5;
        return damage;
    }

    public static void checkHp(Player guy)
    {
        if (guy.getCurrentHp() > guy.getHp()) {
            guy.setCurrentHp(guy.getHp());
        }
    }

    public static void checkHp(Foe jerk)
    {
        if (jerk.getHp() > foeMaxHp) {
            jerk.setHp(foeMaxHp);
        }
    }

    public static void checkMp(Player guy)
    {
        if (guy.getCurrentMp() > guy.getMp()) {
            guy.setCurrentMp(guy.getMp());
        }
    }

    public static Move generateFoeMove(Foe jerk)
    {
        int random = (int) (Math.random() * jerk.getMoves().size());
        return jerk.getMoves().get(random);
    }

    public static void playerTurn(Player guy, Foe jerk, Move theMove)
    {
        if (isTripled) {
            if (theMove.getName().equals("Strike") || theMove.getName().equals("Fire Ball") || theMove.getName().equals("いあいどう")) {
                jerk.setHp(jerk.getHp() - (calcDamage(guy, jerk, theMove) * 3));
            }
            if (theMove.getName().equals("Hype Up")
                    || theMove.getName().equals("Agility")
                    || theMove.getName().equals("Heal")) {
                if (theMove.getName().equals("Hype Up")) {
                    guy.setCurrentAtk(guy.getCurrentAtk() + (calcDamage(guy, guy, theMove) * 3));
                }
                if (theMove.getName().equals("Agility")) {
                    guy.setCurrentSpe(guy.getCurrentSpe() * (calcDamage(guy, guy, theMove) * 3));
                }
                if (theMove.getName().equals("Heal")) {
                    guy.setCurrentHp(guy.getCurrentHp() + (calcDamage(guy, guy, theMove) * 3));
                }
            }
            if (theMove.getName().equals("Triple")) {
                isTripled = true;
            }
            if (theMove.getName().equals("Reflect")) {
                willReflect = true;
            }
        }

        else {
            if (theMove.getName().equals("Strike") || theMove.getName().equals("Fire Ball") || theMove.getName().equals("いあいどう")) {
                jerk.setHp(jerk.getHp() - calcDamage(guy, jerk, theMove));
            }
            if (theMove.getName().equals("Hype Up")
                    || theMove.getName().equals("Agility")
                    || theMove.getName().equals("Heal")) {
                if (theMove.getName().equals("Hype Up")) {
                    guy.setCurrentAtk(guy.getCurrentAtk() + calcDamage(guy, guy, theMove));
                }
                if (theMove.getName().equals("Agility")) {
                    guy.setCurrentSpe(guy.getCurrentSpe() * calcDamage(guy, guy, theMove));
                }
                if (theMove.getName().equals("Heal")) {
                    guy.setCurrentHp(guy.getCurrentHp() + calcDamage(guy, guy, theMove));
                }
            }
            if (theMove.getName().equals("Triple")) {
                isTripled = true;
            }
            if (theMove.getName().equals("Reflect")) {
                willReflect = true;
            }
        }

        checkHp(guy);
        guy.setCurrentMp(guy.getCurrentMp() - theMove.getCost());
    }

    public static void enemyTurn(Player guy, Foe jerk, Move theMove)
    {
        if (!willReflect) {
            if (foeMove.getName().equals("Sucker Punch")
                    || foeMove.getName().equals("Stab") || foeMove.getName().equals("Slice")
                    || foeMove.getName().equals("Shield Tackle")
                    || foeMove.getName().equals("Tackle")
                    || foeMove.getName().equals("Death Breath")
                    || foeMove.getName().equals("Flame Thrower")
                    || foeMove.getName().equals("Earthquake")
                    || foeMove.getName().equals("Frost Blast")
                    || foeMove.getName().equals("Fire Ball")
                    || foeMove.getName().equals("Charge")
                    || foeMove.getName().equals("Tornado")) {
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove));
            }
            if (foeMove.getName().equals("Mock")) {
                guy.setCurrentDef(guy.getCurrentDef() - calcDamage(jerk, guy, foeMove));
            }
            if (foeMove.getName().equals("Shield Up")) {
                jerk.setCurrentDef(jerk.getCurrentDef() * 1.2);
            }
            if (foeMove.getName().equals("Agility")) {
                jerk.setCurrentSpe(jerk.getCurrentSpe() + calcDamage(jerk, jerk, foeMove));
            }
            if (foeMove.getName().equals("Wing Attack")
                    || foeMove.getName().equals("Slash and Tackle")) {
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove));
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove));
            }
            if (foeMove.getName().equals("Slack Off")) {
                jerk.setHp(jerk.getHp() + 5);
            }
            if (foeMove.getName().equals("Nasty Plot")) {
                jerk.setCurrentAtk(jerk.getCurrentAtk() + calcDamage(jerk, jerk, foeMove));
                jerk.setCurrentAtk(jerk.getCurrentAtk() + calcDamage(jerk, jerk, foeMove));
            }
            if (foeMove.getName().equals("Drain")) {
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove));
                jerk.setHp(jerk.getHp() + calcDamage(jerk, guy, foeMove) * 0.75);
            }
            if (foeMove.getName().equals("Mist")) {
                defaultStats(guy, jerk);
            }
            if (foeMove.getName().equals("Soul Harvest")) {
                jerk.setHp(jerk.getHp() + 15);
                jerk.setCurrentAtk(jerk.getCurrentAtk() + calcDamage(jerk, jerk, foeMove));
            }
        }
        else {
            if (foeMove.getName().equals("Sucker Punch")
                    || foeMove.getName().equals("Stab") || foeMove.getName().equals("Slice")
                    || foeMove.getName().equals("Shield Tackle")
                    || foeMove.getName().equals("Tackle")
                    || foeMove.getName().equals("Death Breath")
                    || foeMove.getName().equals("Flame Thrower")
                    || foeMove.getName().equals("Earthquake")
                    || foeMove.getName().equals("Frost Blast")
                    || foeMove.getName().equals("Fire Ball")
                    || foeMove.getName().equals("Charge")
                    || foeMove.getName().equals("Tornado")) {
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove) / 2);
            }
            if (foeMove.getName().equals("Mock")) {
                guy.setCurrentDef(guy.getCurrentDef() - calcDamage(jerk, guy, foeMove));
            }
            if (foeMove.getName().equals("Shield Up")) {
                jerk.setCurrentDef(jerk.getCurrentDef() * 1.2);
            }
            if (foeMove.getName().equals("Agility")) {
                jerk.setCurrentSpe(jerk.getCurrentSpe() + calcDamage(jerk, jerk, foeMove));
            }
            if (foeMove.getName().equals("Wing Attack")
                    || foeMove.getName().equals("Slash and Tackle")) {
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove) / 2);
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove) / 2);
            }
            if (foeMove.getName().equals("Slack Off")) {
                jerk.setHp(jerk.getHp() + 5);
            }
            if (foeMove.getName().equals("Nasty Plot")) {
                jerk.setCurrentAtk(jerk.getCurrentAtk() + calcDamage(jerk, jerk, foeMove));
                jerk.setCurrentAtk(jerk.getCurrentAtk() + calcDamage(jerk, jerk, foeMove));
            }
            if (foeMove.getName().equals("Drain")) {
                guy.setCurrentHp(guy.getCurrentHp() - calcDamage(jerk, guy, foeMove) / 2);
                jerk.setHp(jerk.getHp() + calcDamage(jerk, guy, foeMove) / 2 * 0.75);
            }
            if (foeMove.getName().equals("Mist")) {
                defaultStats(guy, jerk);
            }
            if (foeMove.getName().equals("Soul Harvest")) {
                jerk.setHp(jerk.getHp() + 15);
                jerk.setCurrentAtk(jerk.getCurrentAtk() + calcDamage(jerk, jerk, foeMove));
            }

            jerk.setHp(jerk.getHp() - calcDamage(guy, jerk, new Move("Reflect", 10, 6)));
        }

        checkHp(jerk);
    }

    public static void conclude(Player guy, Foe jerk)
    {
        if (guy.getCurrentHp() < 1) {
            gameOver = true;
        }
        else {
            System.out.println("You win the Battle!!!");
            int random = (int) (Math.random() * 49);
            if (jerk.getName().equals("Gnome")) {
                guy.lvUp(15 * jerk.getLv());
            }
            if (jerk.getName().equals("Thief")) {
                guy.lvUp(20 * jerk.getLv());
            }
            if (jerk.getName().equals("Apprentice Knight")) {
                guy.lvUp(30 * jerk.getLv());
            }
            if (jerk.getName().equals("Dragon")) {
                guy.lvUp(320);
                System.out.println("Congrats!! You receive [Scale Shield   + 10 Def]");
                System.out.println(new Shield(10, "Scale Shield   + 10 Def", "|`-._/\\_.-`|\n"
                        + "  |    ||    |\n"
                        + "  |___o()o___|\n"
                        + "  |__((<>))__|\n"
                        + "  \\   o\\/o   /\n"
                        + "   \\   ||   /\n"
                        + "    \\  ||  /\n"
                        + "     '.||.'\n"
                        + "       ``"));
                System.out.println("And You receive [Flame Sword   + 10 Atk]");
                System.out.println(new Weapon(10, "Flame Sword   + 10 Atk", "             |>\n"
                        + "            //_____________________\n"
                        + "<((((((((((|_/_/____//________/____/\n"
                        + "            \\\\\n"
                        + "             |>"));
                guy.getGears().add(new Weapon(10, "Flame Sword   + 10 Atk", "             |>\n"
                        + "            //_____________________\n"
                        + "<((((((((((|_/_/____//________/____/\n"
                        + "            \\\\\n"
                        + "             |>"));
                guy.getGears().add(new Shield(10, "Scale Shield   + 10 Def", "|`-._/\\_.-`|\n"
                        + "  |    ||    |\n"
                        + "  |___o()o___|\n"
                        + "  |__((<>))__|\n"
                        + "  \\   o\\/o   /\n"
                        + "   \\   ||   /\n"
                        + "    \\  ||  /\n"
                        + "     '.||.'\n"
                        + "       ``"));
            }
            if (jerk.getName().equals("Gryphon")) {
                guy.lvUp(40 * jerk.getLv());
            }
            if (jerk.getName().equals("Legit Knight")) {
                guy.lvUp(45 * jerk.getLv());
            }
            if (jerk.getName().equals("Mage")) {
                guy.lvUp(50 * jerk.getLv());
            }
            if (jerk.getName().equals("Lord Cassius")) {
                gameBeaten = true;
            }
            if (!(jerk.getName().equals("Dragon"))) {
                if (random <= 3) {
                    System.out.println("Congrats!! You receive [Axe of Brutality   + 12 Atk  - 3 Spe]");
                    System.out.println(new Weapon(12, "Axe of Brutality   + 12 Atk  - 3 Spe", ",:\\      /:.\n"
                            + " //  \\_()_/  \\\\\n"
                            + "||   |    |   ||\n"
                            + "||   |    |   ||\n"
                            + "||   |____|   ||\n"
                            + " \\\\  / || \\  //\n"
                            + "  `:/  ||  \\;'\n"
                            + "       ||\n"
                            + "       ||\n"
                            + "       XX\n"
                            + "       XX\n"
                            + "       XX\n"
                            + "       XX\n"
                            + "       OO\n"
                            + "       `'"));
                    guy.getGears().add(new Weapon(12, "Axe of Brutality   + 12 Atk  - 3 Spe", ",:\\      /:.\n"
                            + " //  \\_()_/  \\\\\n"
                            + "||   |    |   ||\n"
                            + "||   |    |   ||\n"
                            + "||   |____|   ||\n"
                            + " \\\\  / || \\  //\n"
                            + "  `:/  ||  \\;'\n"
                            + "       ||\n"
                            + "       ||\n"
                            + "       XX\n"
                            + "       XX\n"
                            + "       XX\n"
                            + "       XX\n"
                            + "       OO\n"
                            + "       `'"));
                }
                else if (random <= 7) {
                    System.out.println("Congrats!! You receive [Elite Shield   + 8 Def  + 2 Atk]");
                    System.out.println(new Shield(8, "Elite Shield   + 8 Def  + 2 Atk", "|\\                     /)\n"
                            + " /\\_\\\\__               (_//\n"
                            + "|   `>\\-`     _._       //`)\n"
                            + " \\ /` \\\\  _.-`:::`-._  //\n"
                            + "  `    \\|`    :::    `|/\n"
                            + "        |     :::     |\n"
                            + "        |.....:::.....|\n"
                            + "        |:::::::::::::|\n"
                            + "        |     :::     |\n"
                            + "        \\     :::     /\n"
                            + "         \\    :::    /\n"
                            + "          `-. ::: .-'\n"
                            + "           //`:::`\\\\\n"
                            + "          //   '   \\\\\n"
                            + "         |/         \\\\"));
                    guy.getGears().add(new Shield(8, "Elite Shield   + 8 Def  + 2 Atk", "|\\                     /)\n"
                            + " /\\_\\\\__               (_//\n"
                            + "|   `>\\-`     _._       //`)\n"
                            + " \\ /` \\\\  _.-`:::`-._  //\n"
                            + "  `    \\|`    :::    `|/\n"
                            + "        |     :::     |\n"
                            + "        |.....:::.....|\n"
                            + "        |:::::::::::::|\n"
                            + "        |     :::     |\n"
                            + "        \\     :::     /\n"
                            + "         \\    :::    /\n"
                            + "          `-. ::: .-'\n"
                            + "           //`:::`\\\\\n"
                            + "          //   '   \\\\\n"
                            + "         |/         \\\\"));
                }
            }
        }

        jerk.setHp(foeMaxHp);
        defaultStats(guy, jerk);
        foundEnemy = false;
    }

    public static void defaultStats(Player guy, Foe jerk)
    {
        guy.setCurrentAtk(guy.getAtk());
        guy.setCurrentDef(guy.getDef());
        guy.setCurrentSpe(guy.getSpe());
        guy.setCurrentMp(guy.getMp());

        jerk.setCurrentAtk(jerk.getAtk());
        jerk.setCurrentDef(jerk.getDef());
        jerk.setCurrentSpe(jerk.getSpe());
    }

    public static void gameBeaten()
    {
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Congratulations!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("");
        System.out.println("You have beaten the Final Boss LORD CASSIUS");
        System.out.println("Link, Eugen, and Big PAPA are very impressed by your patience and effoet");
        System.out.println("█▀▀▄░░░░░░░░░░░▄▀▀█\n"
                + "░█░░░▀▄░▄▄▄▄▄░▄▀░░░█\n"
                + "░░▀▄░░░▀░░░░░▀░░░▄▀\n"
                + "░░░░▌░▄▄░░░▄▄░▐▀▀\n"
                + "░░░▐░░█▄░░░▄█░░▌▄▄▀▀▀▀█ \n"
                + "░░░▌▄▄▀▀░▄░▀▀▄▄▐░░░░░░█\n"
                + "▄▀▀▐▀▀░▄▄▄▄▄░▀▀▌▄▄▄░░░█\n"
                + "█░░░▀▄░█░░░█░▄▀░░░░█▀▀▀\n"
                + "░▀▄░░▀░░▀▀▀░░▀░░░▄█▀\n"
                + "░░░█░░░░░░░░░░░▄▀▄░▀▄\n"
                + "░░░█░░░░░░░░░▄▀█░░█░░█\n"
                + "░░░█░░░░░░░░░░░█▄█░░▄▀\n"
                + "░░░█░░░░░░░░░░░████▀\n"
                + "░░░▀▄▄▀▀▄▄▀▀▄▄▄█▀");
        System.out.println("Keep up the good work in your life!");
        System.out.println("");
        System.out.println("***************************************************");
    }

    public static void gameOver()
    {
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println(".ed\"\"\"\" \"\"\"$$$$be.\n"
                + "                   -\"           ^\"\"**$$$e.\n"
                + "                 .\"                   '$$$c\n"
                + "                /                      \"4$$b\n"
                + "               d  3                      $$$$\n"
                + "               $  *                   .$$$$$$\n"
                + "              .$  ^c           $$$$$e$$$$$$$$.\n"
                + "              d$L  4.         4$$$$$$$$$$$$$$b\n"
                + "              $$$$b ^ceeeee.  4$$ECL.F*$$$$$$$\n"
                + "  e$\"\"=.      $$$$P d$$$$F $ $$$$$$$$$- $$$$$$\n"
                + " z$$b. ^c     3$$$F \"$$$$b   $\"$$$$$$$  $$$$*\"      .=\"\"$c\n"
                + "4$$$$L        $$P\"  \"$$b   .$ $$$$$...e$$        .=  e$$$.\n"
                + "^*$$$$$c  %..   *c    ..    $$ 3$$$$$$$$$$eF     zP  d$$$$$\n"
                + "  \"**$$$ec   \"   %ce\"\"    $$$  $$$$$$$$$$*    .r\" =$$$$P\"\"\n"
                + "        \"*$b.  \"c  *$e.    *** d$$$$$\"L$$    .d\"  e$$***\"\n"
                + "          ^*$$c ^$c $$$      4J$$$$$% $$$ .e*\".eeP\"\n"
                + "             \"$$$$$$\"'$=e....$*$$**$cz$$\" \"..d$*\"\n"
                + "               \"*$$$  *=%4.$ L L$ P3$$$F $$$P\"\n"
                + "                  \"$   \"%*ebJLzb$e$$$$$b $P\"\n"
                + "                    %..      4$$$$$$$$$$ \"\n"
                + "                     $$$e   z$$$$$$$$$$%\n"
                + "                      \"*$c  \"$$$$$$$P\"\n"
                + "                       .\"\"\"*$$$$$$$$bc\n"
                + "                    .-\"    .$***$$$\"\"\"*e.\n"
                + "                 .-\"    .e$\"     \"*$c  ^*b.\n"
                + "          .=*\"\"\"\"    .e$*\"          \"*bc  \"*$e..\n"
                + "        .$\"        .z*\"               ^*$e.   \"*****e.\n"
                + "        $$ee$c   .d\"                     \"*$.        3.\n"
                + "        ^*$E\")$..$\"                         *   .ee==d%\n"
                + "           $.d$$$*                           *  J$$$e*\n"
                + "            \"\"\"\"\"                              \"$$$\"");
        System.out.println("Too bad that you died");
        System.out.println("Run the program and give it a try once more!");
        System.out.println("You can do it!!");
        System.out.println("Try it again!!!");
        System.out.println("");
        System.out.println("***************************************************");
    }
}
