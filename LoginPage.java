package LoginPage;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame{
    private JTextField userText;
    private JPanel panel1;
    private JPasswordField password;
    private JButton loginButton;
    private JFrame frame;

    public LoginPage() {
        frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 300));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack(); //all components are sized so they are visible
        frame.setLocationRelativeTo(null); //frames form at center of the screen
        frame.setVisible(true);
    }



}
