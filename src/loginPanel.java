import javax.swing.*;
import java.awt.*;

public class loginPanel extends secondaryPanel {
    JLabel userNameLabel, passwordLabel, userTypeLabel;
    JTextField userNameField, passwordField;
    JRadioButton userRadioButton, sellerRadioButton;
    button loginButton, signupButton;
    public loginPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل ورود");
        titleLabel.setBounds(495, 40, 90, 30);

        // back button
        backButton.goTo(allPanel, null, frame);

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

        // user type
        userTypeLabel = new JLabel("نوع کاربر");
        userTypeLabel.setBounds(455, 270, 100, 30);
        mainPanel.add(userTypeLabel);
        userRadioButton = new JRadioButton("کاربر عادی");
        userRadioButton.setBounds(325, 270, 100, 30);
        mainPanel.add(userRadioButton);
        sellerRadioButton = new JRadioButton("مدیر فروشگاه");
        sellerRadioButton.setBounds(225, 270, 100, 30);
        mainPanel.add(sellerRadioButton);

        // login-signup buttons
        loginButton = new button("ورود کاربر", Color.white, mainPanel);
        loginButton.goTo(allPanel, null, frame);
        loginButton.getButton().setBounds(225, 330, 100, 30);
        signupButton = new button("ثبت‌نام کاربر جدید", Color.white, mainPanel);
        signupButton.goTo(allPanel, null, frame);
        signupButton.getButton().setBounds(355, 330, 150, 30);

    }
}
