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
public class Dragon extends Foe
{

    public Dragon(int lv)
    {
        super(lv, "Dragon", "_        _\n"
                + "                         _.-'/   _.:'`/\n"
                + "                      ,'`   ( ,:;.-'`(\n"
                + "                    .'      .:'`      \\\n"
                + "                   /       //    _.-';)\n"
                + "                 _/      _//_.-;:-'``/\n"
                + "          //|    \\      \\  .-'`      \\                                 ,\n"
                + "         || /_,-,_|      | `\"\"--..__  \\                  .-'```'-.     )\\\n"
                + "    _.--'_  '-;_/_)_     |(``\"\"'---.;\"/-,.-.  _         /  .---.  \\  .'  \\\n"
                + "   /6    ^`     ':_/     | \"-._    .-'../__ )' ',.-. _ |  /     \\  ;/_  _/\n"
                + "  (`-----`--'.    \\_)    ;|`\"-.;-./        `\"\"--;.__) ',-.      (| |  ||\n"
                + " __)         {\\   |_/\\   \\\\    _.'                  `\"-;_ )'-,_(`/ ;_.'/\n"
                + "  /         {=|   |)  \\.-\"\\\\  /                          `'-.;_:'  /_.'\n"
                + "            {=|    \\_.'    )) '        /                          /\n"
                + "            {=|     ,                 |      ,                _.-'\n"
                + "             {=;     `\"\"--.            \\    '.       __,.---'`\n"
                + "              {=\\          `\\           '._   '._.-\"`\n"
                + "        _,.--\"`;{\\ '-.._    /        __,..-'-._ '.\n"
                + "       (((/==)/ _`;.--'\"` .'--\"\"\"\"```  .--\"```    )\n"
                + "        ```  ' (((/====```            ((((/======'\n"
                + "                ```                    ```");
        setHp(40);
        setAtk(40);
        setDef(30);
        setSpe(30);
        getMoves().add(new Move("Flame Thrower", 20, 0));
        getMoves().add(new Move("Slack Off", 20, 0));
        getMoves().add(new Move("Earthquake", 15, 0));
    }

    public String speak()
    {
        return "I will burn you to ASHES!!!!!";
    }
}
