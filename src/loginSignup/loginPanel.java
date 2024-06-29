package loginSignup;

import javax.swing.*;
import java.awt.*;
import base.*;

public class loginPanel extends themeTwoPanel {
    public JLabel userNameLabel, passwordLabel;
    public JTextField userNameField, passwordField;
    public button loginButton, signupButton;
    public loginPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل ورود");
        titleLabel.setBounds(450, 70, 180, 60);

        // user name
        userNameLabel = new JLabel("نام کاربری");
        userNameLabel.setBounds(480, 150, 100, 30);
        mainPanel.add(userNameLabel);
        userNameField = new JTextField();
        userNameField.setCaretColor(Color.WHITE);
        userNameField.setBounds(260, 150, 200, 30);
        mainPanel.add(userNameField);

        // password
        passwordLabel = new JLabel("رمز");
        passwordLabel.setBounds(480, 210, 100, 30);
        mainPanel.add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setBounds(260, 210, 200, 30);
        mainPanel.add(passwordField);

        // login-signup buttons
        loginButton = new button("ورود کاربر", Color.white, mainPanel);
        loginButton.getButton().setBounds(250, 300, 100, 30);
        signupButton = new button("ثبت نام کاربر جدید", Color.white, mainPanel);
        signupButton.getButton().setBounds(380, 300, 150, 30);

    }
}
