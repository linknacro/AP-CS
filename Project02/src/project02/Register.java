// ************************************************
// Author: Link Lin
// Date: 18 January 2018
// Name of Assignment: Project02
// Teacher: Mr. Chissoe
// Class: AP Computer Science
// 
// This program reads in the number of each item that the customer wants to
// purchase and asks the customer whether he is a contractor and whether 
// he is tax-exempt. After reading in all of the information, the program 
// calculates the cost items including taxes and discounts. Finally, the program
// outputs the bill in a certain format which tells the customer the total cost
// of each group of the items, the subtotal which does not include taxes and 
// discounts, and the total cost which includes taxes and discounts. In my 
// project, I used all methods to do the calculation and output the information,
// which means that I do not have any information in the text area except for 
// methods. Since I have a lot of methods, I grouped them as calculation methods
// and output methods to make them clear. 
// ***********************************************
package project02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Register extends JFrame implements ActionListener {

    // Formats prices so that they only show proper precision
    DecimalFormat twoDigits = new DecimalFormat("0.00");

    // Booleans go here
    private boolean isContractor;
    private boolean isTaxExempt;

    // Integers go here
    private int numSheetRock;
    private int numTwoByFours;
    private int numDrywallScrews;

    // Doubles go here
    private double total;
    private double sheetRockTotal;
    private double twoByFoursTotal;
    private double drywallScrewsTotal;
    private double subtotal;
    // End of instance variables
    
    // Start of static variables
    // Here are the constants
    private static final double DISCOUNT = 0.1;
    private static final double SALESTAX = 0.06;
    private static final double SHEET_ROCK_PRICE = 9.00;
    private static final double TWO_BY_FOURS_PRICE = 2.50;
    private static final double DRYWALL_SCREWS_PRICE = 2.50;
    
    
    // This variable indicates the 'number' for each register.
    private static int numRegister = 1;

    private static double totalIncome = 0;
    // End of static variables
    

    // The getter methods start from here
    // This method computes sheet rocks charge
    // All of the getter methods are private because they are not called outside
    // of the class
    private double getSheetRockTotal() {
        if (isContractor) {
            sheetRockTotal = numSheetRock * SHEET_ROCK_PRICE;
        } else {
            if (numSheetRock < 50) {
                sheetRockTotal = numSheetRock * SHEET_ROCK_PRICE;
            } else {
                sheetRockTotal = ((numSheetRock - (numSheetRock % 50))
                        * SHEET_ROCK_PRICE * 0.95)
                        + ((numSheetRock % 50) * SHEET_ROCK_PRICE);
            }
        }
        return sheetRockTotal;
    }

    // This method computes 2x4s charge
    private double getTwoByFoursTotal() {
        if (isContractor) {
            twoByFoursTotal = numTwoByFours * TWO_BY_FOURS_PRICE;
        } else {
            int numTwoByFours2 = numTwoByFours;
            for (int i = 1; i <= numTwoByFours; i++) {
                if (i % 13 == 0) {
                    numTwoByFours2--;
                }
            }
            twoByFoursTotal = numTwoByFours2 * TWO_BY_FOURS_PRICE;
        }
        return twoByFoursTotal;
    }

    // This method computes drywall screws charge
    private double getDrywallScrewsTotal() {
        if (isContractor) {
            drywallScrewsTotal = numDrywallScrews * DRYWALL_SCREWS_PRICE;
        } else {
            int numDrywallScrews2 = numDrywallScrews;
            for (int i = 1; i <= numDrywallScrews; i++) {
                if (i % 5 == 0) {
                    numDrywallScrews2--;
                }
            }
            drywallScrewsTotal = numDrywallScrews2 * DRYWALL_SCREWS_PRICE;
        }
        return drywallScrewsTotal;
    }

    // This method computes the subtotal
    private double getSubtotal() {
        subtotal = getSheetRockTotal() + getTwoByFoursTotal()
                + getDrywallScrewsTotal();
        return subtotal;
    }

    // This method computes the discount for contractors
    private double getTenPercentDiscount() {
        return getSubtotal() * DISCOUNT;
    }

    // This method computes total tax in all instances
    private double getTotalTax() {
        if (isContractor) {
            if (isTaxExempt){
                return 0;
            }
            else {
                return (getSubtotal() - getTenPercentDiscount()) * SALESTAX;
            }
        }
        else {
            return getSubtotal() * SALESTAX;
        }
    }

    // This method computes the total bill
    private double getTotal() {
        if (isContractor) {
            total = getSubtotal() - getTenPercentDiscount() + getTotalTax();
        } else {
            total = getSubtotal() + getTotalTax();
        }
        return total;
    }

    // This method computes the total income
    public double getTotalIncome() {
        totalIncome += total;
        return totalIncome;
    }
    // End of getter methods
    
    // Ouput methods start here
    // This method outputs the information for sheet rocks
    public String printSheetRockSummary() {
        return "\n\n" + "Sheet Rock:\n" + "Quantity: " + numSheetRock + "\n"
                + "Price: $" + twoDigits.format(getSheetRockTotal());
    }

    // This method outputs the information for 2x4s
    public String printTwoByFoursSummary() {
        return "\n\n" + "2 x 4s:\n" + "Quantity: " + numTwoByFours + "\n"
                + "Price: $" + twoDigits.format(getTwoByFoursTotal());
    }

    // This method outputs the information for drywall screws
    public String printDrywallScrewsSummary() {
        return "\n\n" + "Drywall Screws (lb):\n" + "Quantity: "
                + numDrywallScrews
                + "\n"
                + "Price: $" + twoDigits.format(getDrywallScrewsTotal());
    }

    // This method outputs the subtotal section of the bill
    public String printSubtotal() {
        if (isContractor) {
            return "\n\n" + "------------------------------------------\n"
                    + "SUBTOTAL:                  " + "$"
                    + twoDigits.format(getSubtotal())
                    + "\n10% Discount:             " + "$"
                    + twoDigits.format(getTenPercentDiscount()) + "\nTax:                                "
                    + "$" + twoDigits.format(getTotalTax())
                    + "\n------------------------------------------";
        } else {
            return "\n\n" + "------------------------------------------\n"
                    + "SUBTOTAL:                  " + "$"
                    + twoDigits.format(getSubtotal()) + "\nTax:                                "
                    + "$" + twoDigits.format(getTotalTax())
                    + "\n------------------------------------------";
        }
    }

    // This method outputs the information of total cost 
    public String printTotal() {
        return "\nTOTAL:                          "
                + "$" + twoDigits.format(getTotal());
    }

    // This method outputs the information of total income
    public String printTotalIncome() {
        return "$" + twoDigits.format(getTotalIncome());
    }
    // End of output methods
    // End of methods
    // **** The following code is for the GUI, do not change this code ******
    private static int guiPos = 200;
    private JLabel srLabel = new JLabel("Number of Sheet Rock");
    private JTextField srText = new JTextField("", 10);

    private JLabel tbfLabel = new JLabel("Number of 2 x 4s");
    private JTextField tbfText = new JTextField("", 10);

    private JLabel dwsLabel = new JLabel("Number of drywall screws (lb)");
    private JTextField dwsText = new JTextField("", 10);

    private JLabel conLabel = new JLabel("Are you a contractor <y or n>");
    private JTextField conText = new JTextField("", 10);

    private JLabel teLabel = new JLabel("Are you tax-exempt?  <y or n>");
    private JTextField teText = new JTextField("", 10);

    private JButton btnCompute = new JButton("Compute Bill");

    // private JLabel tb = new JLabel("   Bill for this register ");
    private JTextArea totalBill = new JTextArea(10, 15);

    private JLabel ai = new JLabel("Income from all registers");
    private JTextField allIncome = new JTextField("", 10);
    // ********** End of GUI code, do not edit section above *****************

    public Register() {

        // Notice that the registers don't have unique names
        // Change the code so each register has the appropriate number 
        String registerName = "Register #" + numRegister;

        setTitle(registerName);
        setLocation(guiPos, 200);
        setSize(200, 750);
        this.guiPos = guiPos + guiPos + 20;

        Container c = getContentPane();
        c.setBackground(Color.white);
        c.setForeground(Color.black);
        c.setLayout(new FlowLayout());
        c.add(srLabel);
        c.add(srText);
        c.add(tbfLabel);
        c.add(tbfText);
        c.add(dwsLabel);
        c.add(dwsText);
        c.add(conLabel);
        c.add(conText);
        c.add(teLabel);
        c.add(teText);

        c.add(btnCompute);

        c.add(totalBill);
        totalBill.setEditable(false);

        c.add(ai);
        c.add(allIncome);
        allIncome.setEditable(false);

        btnCompute.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {

        // This step assigns the values to instance variables
        numSheetRock = Integer.parseInt(srText.getText());
        numTwoByFours = Integer.parseInt(tbfText.getText());
        numDrywallScrews = Integer.parseInt(dwsText.getText());
        isContractor = ("y").equals(conText.getText());
        isTaxExempt = ("y").equals(teText.getText());
        
        // Using methods to output methods to output the bill
        totalBill.setText("***Customer's Bill***" + printSheetRockSummary()
                + printTwoByFoursSummary()
                + printDrywallScrewsSummary()
                + printSubtotal() + printTotal());
        allIncome.setText(printTotalIncome());

    }
}
