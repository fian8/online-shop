package profilePanels;

import base.button;

import javax.swing.*;
import java.awt.*;

public class profilePanel {
    public JLabel titleLabel, nameLabel1, nameLabel2, phoneNumLabel1, phoneNumLabel2,
            userNameLabel1, userNameLabel2, userTypeLabel1, userTypeLabel2;
    public JPanel allPanel, mainPanel, backPanel, blackPanel;
    public button editProfileButton, productsPanelButton, exitButton;
    public  Color primaryColor = Color.decode("#FF841F"),
            secondaryColor = Color.decode("#C0E0E4"),
            thirdColor = Color.decode("#4A5A4B");
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 60);
    public profilePanel(JFrame frame){

        // all panels
        allPanel = new JPanel();
        allPanel.setBounds(0, 0, 1080, 720);
        allPanel.setLayout(null);

        // main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(150, 110, 780, 500);
        mainPanel.setBackground(secondaryColor);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        mainPanel.add(titleLabel);
        allPanel.add(titleLabel);

        // name
        nameLabel1 = new JLabel("نام و نام خانوادگی", SwingConstants.RIGHT);
        nameLabel1.setBounds(453, 100, 100, 30);
        mainPanel.add(nameLabel1);
        nameLabel2 = new JLabel();
        nameLabel2.setBounds(225, 100, 200, 30);
        mainPanel.add(nameLabel2);

        // phone number
        phoneNumLabel1 = new JLabel("شماره تلفن", SwingConstants.RIGHT);
        phoneNumLabel1.setBounds(453, 160, 100, 30);
        mainPanel.add(phoneNumLabel1);
        phoneNumLabel2 = new JLabel();
        phoneNumLabel2.setBounds(225, 160, 200, 30);
        mainPanel.add(phoneNumLabel2);

        // user name
        userNameLabel1 = new JLabel("نام کاربری", SwingConstants.RIGHT);
        userNameLabel1.setBounds(453, 220, 100, 30);
        mainPanel.add(userNameLabel1);
        userNameLabel2 = new JLabel();
        userNameLabel2.setBounds(225, 220, 200, 30);
        mainPanel.add(userNameLabel2);

        // "user type" label
        userTypeLabel1 = new JLabel("نوع کاربر", SwingConstants.RIGHT);
        userTypeLabel1.setBounds(453, 280, 100, 30);
        mainPanel.add(userTypeLabel1);
        userTypeLabel2 = new JLabel();
        userTypeLabel2.setBounds(225, 280, 200, 30);
        mainPanel.add(userTypeLabel2);

        // "edit profile" button
        editProfileButton = new button("ویرایش اطلاعات", Color.white, allPanel);

        // "products panel" button
        productsPanelButton = new button("صفحه اصلی", Color.white, allPanel);

        // exit button
        exitButton = new button("خروج", Color.white, allPanel);


        // back & black panels (border)
        backPanel = new JPanel();
        backPanel.setBounds(190, 80, 410, 250);
        backPanel.setBackground(secondaryColor);
        mainPanel.add(backPanel);
        blackPanel = new JPanel();
        blackPanel.setBounds(189, 79, 412, 252);
        blackPanel.setBackground(Color.black);
        mainPanel.add(blackPanel);


        allPanel.add(mainPanel);
    }
}
