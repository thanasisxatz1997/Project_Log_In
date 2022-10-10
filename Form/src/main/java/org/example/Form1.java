package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JFrame frame;
    private JPanel panel;
    private JButton buttonDeposit;
    private JButton buttonWithdraw;
    private JTextField textField;

    Form1()
    {
        buttonDeposit=new JButton("DEPOSIT");
        buttonDeposit.setBounds(200,200,70,70);
        buttonWithdraw=new JButton("WITHDRAW");
        buttonWithdraw.setBounds(100,100,70,70);
        frame=new JFrame("My frame");
        frame.add(buttonDeposit);
        frame.add(buttonWithdraw);
        panel=new JPanel();
        frame.setLayout(null);
        frame.setSize(new Dimension(500,500));
        buttonDeposit.setSize(new Dimension(100,100));
        //frame.add(panel);
        //panel.add(buttonDeposit);
        //panel.add(buttonWithdraw);
        frame.setVisible(true);
        buttonWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
