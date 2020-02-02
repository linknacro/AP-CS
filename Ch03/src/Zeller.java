/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19502
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Zeller extends JFrame {

    private JTextField _dateTF = new JTextField(10);
    private JTextField _dayOfWeekTF = new JTextField(9);

    public Zeller() {
        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ConvertBtnListener());

        _dateTF.addActionListener(new ConvertBtnListener());
        _dayOfWeekTF.setEditable(false);

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        content.add(new JLabel("Please enter the date"));
        content.add(_dateTF);
        content.add(convertBtn);
        content.add(new JLabel("The day of the week"));
        content.add(_dayOfWeekTF);

        setContentPane(content);
        pack();
        setTitle("Zeller Algorithm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    class ConvertBtnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String dStr = _dateTF.getText();
            int d = Integer.parseInt(dStr.substring(3, 5));
            int m;
            int c, k;
            if (dStr.substring(0, 2).equals("01")) {
                m = 11;
                c = Integer.parseInt(dStr.substring(6, 8));
                k = Integer.parseInt(dStr.substring(8)) - 1;
            } else if (dStr.substring(0, 2).equals("02")) {
                m = 12;
                c = Integer.parseInt(dStr.substring(6, 8));
                k = Integer.parseInt(dStr.substring(8)) - 1;
            } else {
                m = Integer.parseInt(dStr.substring(0, 2)) - 2;
                c = Integer.parseInt(dStr.substring(6, 8));
                k = Integer.parseInt(dStr.substring(8));
            }
            m = (m * 26 - 2) / 10;
            int dayOfWeek = (k + k / 4 + c / 4 + c * 5 + d + m) % 7;
            if (dayOfWeek == 0) {
                _dayOfWeekTF.setText("Sunday");
            } else if (dayOfWeek == 1) {
                _dayOfWeekTF.setText("Monday");
            } else if (dayOfWeek == 2) {
                _dayOfWeekTF.setText("Tuesday");
            } else if (dayOfWeek == 3) {
                _dayOfWeekTF.setText("Wednesday");
            } else if (dayOfWeek == 4) {
                _dayOfWeekTF.setText("Thursday");
            } else if (dayOfWeek == 5) {
                _dayOfWeekTF.setText("Friday");
            } else {
                _dayOfWeekTF.setText("Saturday");
            }

        }
    }

    public static void main(String[] args) {
        Zeller window = new Zeller();
        window.setVisible(true);
    }
}
