package RegisterPage;

import javax.swing.*;
import java.awt.*;

public class RegisterPage extends JFrame{
    private JTextField userText;
    private JPanel panel1;
    private JPasswordField password;
    private JButton registerButton;
    private JPasswordField password2;
    private JFrame frame;

    public RegisterPage(){
        frame=new JFrame("Register Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setResizable(false);


        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
