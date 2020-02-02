/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

import java.util.ArrayList;

/**
 *
 * @author 19502
 */
public class Cookie extends Item
{

    private ArrayList cookieType = new ArrayList<Cookie>()
    {
        {
            add(new Cookie("Chcolate", 2));
            add(new Cookie("Rasberry", 3));
            add(new Cookie("Oreo", 2));
            add(new Cookie("Kimchi", 50));
            add(new Cookie("White chocolate", 1));
        }
    };

    public Cookie(String type, double price)
    {
        super(price, type, 'm');
    }

    public ArrayList getCookieType()
    {
        return cookieType;
    }

    public String toString()
    {
        return getDescription() + "      Price:   $" + getPrice();
    }
}
