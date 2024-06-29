package loginSignup;

import javax.swing.*;
import java.awt.*;
import base.*;

public class signupPanel extends themeTwoPanel {

    public JLabel nameLabel, phoneNumLabel, userNameLabel, passwordLabel, userTypeLabel;
    public JTextField nameField, phoneNumField, userNameField, passwordField;
    public JRadioButton costumerRadioButton, sellerRadioButton;
    public ButtonGroup userTypeButtonGroup;
    public button loginButton, signupButton;
    public signupPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل ثبت نام");
        titleLabel.setBounds(420, 70, 240, 60);

        // name
        nameLabel = new JLabel("نام و نام خانوادگی");
        nameLabel.setBounds(480, 90, 100, 30);
        mainPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setCaretColor(Color.WHITE);
        nameField.setBounds(260, 90, 200, 30);
        mainPanel.add(nameField);

        // phone number
        phoneNumLabel = new JLabel("شماره تلفن");
        phoneNumLabel.setBounds(480, 150, 100, 30);
        mainPanel.add(phoneNumLabel);
        phoneNumField = new JTextField();
        phoneNumField.setCaretColor(Color.WHITE);
        phoneNumField.setBounds(260, 150, 200, 30);
        mainPanel.add(phoneNumField);

        // user name
        userNameLabel = new JLabel("نام کاربری");
        userNameLabel.setBounds(480, 210, 100, 30);
        mainPanel.add(userNameLabel);
        userNameField = new JTextField();
        userNameField.setCaretColor(Color.WHITE);
        userNameField.setBounds(260, 210, 200, 30);
        mainPanel.add(userNameField);

        // password
        passwordLabel = new JLabel("رمز");
        passwordLabel.setBounds(480, 270, 100, 30);
        mainPanel.add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setBounds(260, 270, 200, 30);
        mainPanel.add(passwordField);

        // user type
        userTypeLabel = new JLabel("نوع کاربر");
        userTypeLabel.setBounds(480, 330, 100, 30);
        mainPanel.add(userTypeLabel);
        costumerRadioButton = new JRadioButton("کاربر عادی");
        costumerRadioButton.setFocusable(false);
        costumerRadioButton.setBounds(360, 330, 100, 30);
        mainPanel.add(costumerRadioButton);
        sellerRadioButton = new JRadioButton("مدیر فروشگاه");
        sellerRadioButton.setFocusable(false);
        sellerRadioButton.setBounds(260, 330, 100, 30);
        mainPanel.add(sellerRadioButton);
        userTypeButtonGroup = new ButtonGroup();
        userTypeButtonGroup.add(costumerRadioButton);
        userTypeButtonGroup.add(sellerRadioButton);

        // login-signup buttons
        loginButton = new button("ورود کاربر", Color.white, mainPanel);
        loginButton.getButton().setBounds(250, 390, 100, 30);
        signupButton = new button("ثبت نام کاربر جدید", Color.white, mainPanel);
        signupButton.getButton().setBounds(380, 390, 150, 30);

    }
}
