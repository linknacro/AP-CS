// ************************************************
// Author: Link Lin
// Date: 5 November 2017
// Name of Assignment: Car Cost Calculator
// Teacher: Mr. Chissoe
// Class: AP Computer Science
// 
// This program reads in integers and doubles that 
// are related to the car and calculates the cost 
// of purchasing the car. It returns the results 
// in GUI form. Depending on different factors such
// as the age of the driver and the total miles the
// driver plans on driving, the results can be very
// different.
// ***********************************************
package project01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.text.*;

class CalculatorGUI extends JFrame {

    private static final int MONTH_TO_YEAR = 12;  // the number of months in a year
    private static final double DISCOUNT = 0.02;  // the amount of discount for insurance for certain conditions 
    
    // creating new text fields
    private JTextField _monthPayTF = new JTextField(10);
    private JTextField _fuelCostTF = new JTextField(10);
    private JTextField _mpgTF = new JTextField(10);
    private JTextField _ageTF = new JTextField(10);
    private JTextField _totalMiTF = new JTextField(10);
    private JTextField _yearPayTF = new JTextField(10);
    private JTextField _totalFCostTF = new JTextField(10);
    private JTextField _insuranceTF = new JTextField(10);
    private JTextField _maintainTF = new JTextField(10);
    private JTextField _totalCostTF = new JTextField(10);
    private JTextField _costPerMiTF = new JTextField(10);

    public CalculatorGUI() {
        // initializing a convert button
        JButton convertBtn = new JButton("Compute Costs");
        convertBtn.addActionListener(new ConvertBtnListener());

        _monthPayTF.addActionListener(new ConvertBtnListener());
        _fuelCostTF.addActionListener(new ConvertBtnListener());
        _mpgTF.addActionListener(new ConvertBtnListener());
        _ageTF.addActionListener(new ConvertBtnListener());
        _totalMiTF.addActionListener(new ConvertBtnListener());

        // set some of the text fields to uneditable
        _yearPayTF.setEditable(false);
        _totalFCostTF.setEditable(false);
        _insuranceTF.setEditable(false);
        _maintainTF.setEditable(false);
        _totalCostTF.setEditable(false);
        _costPerMiTF.setEditable(false);

        // create content panel and set layout
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        
        // add the components to the layout and arrange the outlook of the GUI
        content.add(new JLabel("Monthly Payment:"));
        content.add(_monthPayTF);
        content.add(new JLabel("Fuel Cost:"));
        content.add(_fuelCostTF);
        content.add(new JLabel("MPG:"));
        content.add(_mpgTF);
        content.add(new JLabel("Age:"));
        content.add(_ageTF);
        content.add(new JLabel("Total Miles:"));
        content.add(_totalMiTF);
        content.add(convertBtn);
        content.add(new JLabel("Yearly Payments:"));
        content.add(_yearPayTF);
        content.add(new JLabel("Total Fuel Cost:"));
        content.add(_totalFCostTF);
        content.add(new JLabel("Insurance Cost:"));
        content.add(_insuranceTF);
        content.add(new JLabel("Maintenance Cost:"));
        content.add(_maintainTF);
        content.add(new JLabel("Total Yearly Cost:"));
        content.add(_totalCostTF);
        content.add(new JLabel("Cost Per Mile:"));
        content.add(_costPerMiTF);

        setContentPane(content);
        pack();
        setTitle("Car Cost Calculator");
        setSize(150, 600);  // set the dimensions of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    class ConvertBtnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String monthPStr = _monthPayTF.getText();
            int monthP = Integer.parseInt(monthPStr);  // get an integer for monthly payment
            String fuelCStr = _fuelCostTF.getText();
            double fuelC = Double.parseDouble(fuelCStr);  // get a double for fuel cost
            String mPGStr = _mpgTF.getText();
            int mpg = Integer.parseInt(mPGStr);  // get an integer for miles per gallon
            String ageStr = _ageTF.getText();
            int age = Integer.parseInt(ageStr);  // get an integer for the age of the driver
            String totalMiStr = _totalMiTF.getText();
            int totalMi = Integer.parseInt(totalMiStr);  // ger an integer for total miles

            NumberFormat money = NumberFormat.getCurrencyInstance();
            int yearP = monthP * MONTH_TO_YEAR;  // calculate the yearly payment by multiplying the number of months and the monthly payment
            _yearPayTF.setText("$" + yearP);  

            double gallons = (double) totalMi / mpg;  // find the number of gallons needed
            double totalFC = Math.round(gallons * fuelC);  // find total fuel cost and round it to the nearest dollar
            DecimalFormat twoDigits = new DecimalFormat("0.00");  
            _totalFCostTF.setText(money.format(totalFC));  // displaying the result 

            double insurance;  // the amount of insurance
            if (age < 21) {
                insurance = 1500;  // the age of the driver is greater than 21
                if (totalMi < 7000) {
                    insurance *= (1 - DISCOUNT);  // insurance with discount
                } else {
                    insurance = 1500;  // insurance without discount
                }
                _insuranceTF.setText("$" + (int) insurance);
            } else {
                insurance = 1000;  // the age of the driver is less than 21
                if (totalMi < 7000) {
                    insurance *= (1 - DISCOUNT);  // insurance with discount
                } else {
                    insurance = 1000;  // insurance without discount  
                }
                _insuranceTF.setText("$" + (int) insurance);
            }

            int maintain;  // the cost of maintenance
            // the number of total miles decides the amount of maintenance
            if (totalMi >= 0 && totalMi <= 5000) {
                maintain = 300;  
            } else if (totalMi > 5000 && totalMi <= 10000) {
                maintain = 500;
            } else {
                maintain = 950;
            }
            _maintainTF.setText("$" + maintain);

            double totalC = yearP + totalFC + insurance + maintain;  // calculate the total cost by adding up all of the costs
            _totalCostTF.setText("$" + twoDigits.format(totalC));  // since all numbers are rounded, there is no need to round the total cost

            double costPerMile = totalC / totalMi;  // calculate cost per mile 
            _costPerMiTF.setText("$" + twoDigits.format(costPerMile));
        }
    }
    
    // main method
    public static void main(String[] args) {
        CalculatorGUI window = new CalculatorGUI();
        window.setVisible(true);
    }
}
