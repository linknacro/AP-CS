/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author 19502
 */
public class Drink extends Item
{

    private final double S_CONSTANT = .8;
    private final double L_CONSTANT = 1.2;
    private final double B_PRICE = 2;
    private final double S_PRICE = 1;

    public Drink(String description, char size)
    {
        super(0, description, size);
        if (description.equals("soda")) {
            super.setPrice(S_PRICE);
        }
        if (description.equals("beer")) {
            super.setPrice(B_PRICE);
        }
        if (size == 's') {
            setPrice(getPrice() * S_CONSTANT);
        }
        if (size == 'l') {
            setPrice(getPrice() * L_CONSTANT);
        }
    }

    public String toString()
    {
        return getDescription() + "\nSize: " + getSize() + "\nPrice: $" + getPrice();
    }
}
