import javax.swing.*;
import java.awt.*;

public class loginPanel extends secondaryPanel {
    public JLabel userNameLabel, passwordLabel, userTypeLabel;
    public JTextField userNameField, passwordField;
    public button loginButton, signupButton;
    public loginPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل ورود");
        titleLabel.setBounds(495, 40, 90, 30);


        // user name
        userNameLabel = new JLabel("نام کاربری");
        userNameLabel.setBounds(455, 150, 100, 30);
        mainPanel.add(userNameLabel);
        userNameField = new JTextField();
        userNameField.setBounds(225, 150, 200, 30);
        mainPanel.add(userNameField);

        // password
        passwordLabel = new JLabel("رمز");
        passwordLabel.setBounds(455, 210, 100, 30);
        mainPanel.add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setBounds(225, 210, 200, 30);
        mainPanel.add(passwordField);

        // login-signup buttons
        loginButton = new button("ورود کاربر", Color.white, mainPanel);
        loginButton.getButton().setBounds(225, 330, 100, 30);
        signupButton = new button("ثبت نام کاربر جدید", Color.white, mainPanel);
        signupButton.getButton().setBounds(355, 330, 150, 30);

    }
}
