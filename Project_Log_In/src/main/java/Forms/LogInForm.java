import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInForm extends JDialog {
    private JPanel LogInForm;
    private JTextField NameField;
    private JPasswordField PasswordField;
    private JButton NewAccountButton;
    private JButton logInButton;
    private JLabel LogInLabel;
    private JLabel NameLabel;
    private JLabel PasswordLabel;

    public LogInForm (JFrame parent) {
        super(parent);
        setTitle("Log In");
        setContentPane(LogInForm);
        setMinimumSize(new Dimension(450,427));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Email;
                String Password = String.valueOf(PasswordField.getPassword());
            }

        });
    }

    private User getAuthenticatedUser(String Email, String Password) {
        User user = null;
        return null;
    }

    public static void main(String[] args) {
        LogInForm myForm = new LogInForm(null);
    }
}
