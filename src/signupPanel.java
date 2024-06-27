import javax.swing.*;
import java.awt.*;

public class signupPanel extends secondaryPanel {

    JLabel nameLabel, phoneNumLabel, userNameLabel, passwordLabel, userTypeLabel;
    JTextField nameField, phoneNumField, userNameField, passwordField;
    JRadioButton userRadioButton, sellerRadioButton;
    button loginButton, signupButton;
    public signupPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل ورود");
        titleLabel.setBounds(495, 40, 90, 30);

        // back button
        backButton.goTo(allPanel, null, frame);

        // name
        nameLabel = new JLabel("نام و نام خانوادگی");
        nameLabel.setBounds(455, 90, 100, 30);
        mainPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(225, 90, 200, 30);
        mainPanel.add(nameField);

        // phone number
        phoneNumLabel = new JLabel("شماره تلفن");
        phoneNumLabel.setBounds(455, 150, 100, 30);
        mainPanel.add(phoneNumLabel);
        phoneNumField = new JTextField();
        phoneNumField.setBounds(225, 150, 200, 30);
        mainPanel.add(phoneNumField);

        // user name
        userNameLabel = new JLabel("نام کاربری");
        userNameLabel.setBounds(455, 210, 100, 30);
        mainPanel.add(userNameLabel);
        userNameField = new JTextField();
        userNameField.setBounds(225, 210, 200, 30);
        mainPanel.add(userNameField);

        // password
        passwordLabel = new JLabel("رمز");
        passwordLabel.setBounds(455, 270, 100, 30);
        mainPanel.add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setBounds(225, 270, 200, 30);
        mainPanel.add(passwordField);

        // user type
        userTypeLabel = new JLabel("نوع کاربر");
        userTypeLabel.setBounds(455, 330, 100, 30);
        mainPanel.add(userTypeLabel);
        userRadioButton = new JRadioButton("کاربر عادی");
        userRadioButton.setBounds(325, 330, 100, 30);
        mainPanel.add(userRadioButton);
        sellerRadioButton = new JRadioButton("مدیر فروشگاه");
        sellerRadioButton.setBounds(225, 330, 100, 30);
        mainPanel.add(sellerRadioButton);

        // login-signup buttons
        loginButton = new button("ورود کاربر", Color.white, mainPanel);
        loginButton.goTo(allPanel, null, frame);
        loginButton.getButton().setBounds(225, 390, 100, 30);
        signupButton = new button("ثبت نام کاربر جدید", Color.white, mainPanel);
        signupButton.goTo(allPanel, null, frame);
        signupButton.getButton().setBounds(355, 390, 150, 30);

    }
}
