package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame{
    private JButton withdrawButton;
    private JButton depositButton;
    private JTextField textField1;
    private JTextPane textPane1;
    private JPanel formPanel;
    private JLabel NameLabel;
    private ImageIcon userIcon;


    public  mainForm()
    {
        this.setTitle("projectBank");
        this.add(formPanel);
        setVisible(true);
        this.setSize(new Dimension(500,500));
       depositButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("hello juice wrld");
           }
       });
       withdrawButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("hello xxx tentacion");
           }
       });
  userIcon=new ImageIcon("iconfrm.png");
  NameLabel.setIcon(userIcon);

    }

}
