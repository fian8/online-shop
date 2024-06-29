package profilePanels;

import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;

public class editProfilePanel extends themeTwoPanel {
    public JLabel nameLabel, phoneNumLabel, userNameLabel, passwordLabel;
    public JTextField nameField, phoneNumField, userNameField, passwordField;
    public button editTheProfileButton;
    public editProfilePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("ویرایش پروفایل");
        titleLabel.setBounds(375, 70, 332, 60);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);

        // name
        nameLabel = new JLabel("نام و نام خانوادگی");
        nameLabel.setBounds(455, 120, 100, 30);
        mainPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setCaretColor(Color.WHITE);
        nameField.setBounds(235, 120, 200, 30);
        mainPanel.add(nameField);

        // phone number
        phoneNumLabel = new JLabel("شماره تلفن");
        phoneNumLabel.setBounds(455, 180, 100, 30);
        mainPanel.add(phoneNumLabel);
        phoneNumField = new JTextField();
        phoneNumField.setCaretColor(Color.WHITE);
        phoneNumField.setBounds(235, 180, 200, 30);
        mainPanel.add(phoneNumField);

        // user name
        userNameLabel = new JLabel("نام کاربری");
        userNameLabel.setBounds(455, 240, 100, 30);
        mainPanel.add(userNameLabel);
        userNameField = new JTextField();
        userNameField.setCaretColor(Color.WHITE);
        userNameField.setBounds(235, 240, 200, 30);
        mainPanel.add(userNameField);

        // password
        passwordLabel = new JLabel("رمز");
        passwordLabel.setBounds(455, 300, 100, 30);
        mainPanel.add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setBounds(235, 300, 200, 30);
        mainPanel.add(passwordField);

        // "edit product" button
        editTheProfileButton = new button("ویرایش پروفایل", Color.white, mainPanel);
        editTheProfileButton.getButton().setBounds(330, 360, 120, 30);

    }
}
