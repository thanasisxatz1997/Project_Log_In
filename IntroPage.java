package IntroPage;

import javax.swing.*;
import java.awt.*;

public class IntroPage extends JFrame{
    private JPanel panel1;
    private JButton openLogin;
    private JButton openRegister;
    private JFrame frame;

    public IntroPage(){

        frame=new JFrame("Intro Frame");
        frame.setTitle("Welcome Page");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(450, 474));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


}
