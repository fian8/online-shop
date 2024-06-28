import javax.swing.*;
import java.awt.*;

public class editProfilePanel extends secondaryPanel{
    public JLabel nameLabel, phoneNumLabel, userNameLabel, passwordLabel;
    public JTextField nameField, phoneNumField, userNameField, passwordField;
    public button editTheProfileButton;
    public editProfilePanel(JFrame frame) {

        super(frame);

        titleLabel.setText("ویرایش پروفایل");
        titleLabel.setBounds(450, 40, 180, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

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

        // edit product button
        editTheProfileButton = new button("ویرایش پروفایل", Color.white, mainPanel);
        editTheProfileButton.getButton().setBounds(355, 390, 150, 30);

    }
}
