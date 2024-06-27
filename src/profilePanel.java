import javax.swing.*;
import java.awt.*;

public class profilePanel {
    JLabel titleLabel, nameLabel1, nameLabel2, phoneNumLabel1, phoneNumLabel2,
            userNameLabel1, userNameLabel2, userTypeLabel1, userTypeLabel2;
    JPanel allPanel, mainPanel;
    button backButton, editProfileButton, productsPanelButton, exitButton;
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public profilePanel(JFrame frame){

        // all panels
        allPanel = new JPanel();
        allPanel.setBounds(0, 0, 1080, 720);
        allPanel.setLayout(null);

        // main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(290, 100, 500, 280);
        mainPanel.setBackground(Color.cyan);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        allPanel.add(titleLabel);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(290, 40, 100, 30);

        // name
        nameLabel1 = new JLabel("نام و نام خانوادگی");
        nameLabel1.setBounds(300, 50, 100, 30);
        mainPanel.add(nameLabel1);
        nameLabel2 = new JLabel();
        nameLabel2.setBounds(225, 50, 200, 30);
        mainPanel.add(nameLabel2);

        // phone number
        phoneNumLabel1 = new JLabel("شماره تلفن");
        phoneNumLabel1.setBounds(300, 100, 100, 30);
        mainPanel.add(phoneNumLabel1);
        phoneNumLabel2 = new JLabel();
        phoneNumLabel2.setBounds(225, 100, 200, 30);
        mainPanel.add(phoneNumLabel2);

        // user name
        userNameLabel1 = new JLabel("نام کاربری");
        userNameLabel1.setBounds(300, 150, 100, 30);
        mainPanel.add(userNameLabel1);
        userNameLabel2 = new JLabel();
        userNameLabel2.setBounds(225, 150, 200, 30);
        mainPanel.add(userNameLabel2);

        // user type label
        userTypeLabel1 = new JLabel("نوع کاربر");
        userTypeLabel1.setBounds(300, 200, 100, 30);
        mainPanel.add(userTypeLabel1);
        userTypeLabel2 = new JLabel();
        userTypeLabel2.setBounds(225, 200, 200, 30);
        mainPanel.add(userTypeLabel2);

        // edit profile button
        editProfileButton = new button("ویرایش اطلاعات", Color.white, allPanel);
        editProfileButton.getButton().setBounds(620, 400, 100, 30);

        // products panel button
        productsPanelButton = new button("صفحه اصلی", Color.white, allPanel);
        productsPanelButton.getButton().setBounds(490, 400, 100, 30);

        // exit button
        exitButton = new button("خروج", Color.white, allPanel);
        exitButton.getButton().setBounds(360, 400, 100, 30);


        allPanel.add(mainPanel);

        frame.add(allPanel);
    }
}
