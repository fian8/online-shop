package profilePanels;

import base.button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class customerProfilePanel extends profilePanel {
    public JPanel cashPanel, blackPanel;
    public JLabel cashLabel1, cashLabel2;
    public button cashIncreaseButton;

    public customerProfilePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل کاربر عادی");
        titleLabel.setBounds(375, 70, 330, 60);

        // "edit profile" button (edit)
        editProfileButton.getButton().setBounds(620, 530, 100, 30);

        // "products panel" button (edit)
        productsPanelButton.getButton().setBounds(490, 530, 100, 30);

        // exit button (edit)
        exitButton.getButton().setBounds(360, 530, 100, 30);

        // cash panel
        cashPanel = new JPanel();
        cashPanel.setLayout(null);
        cashPanel.setBounds(240, 355, 300, 40);
        cashPanel.setBackground(secondaryColor);
        blackPanel = new JPanel();
        blackPanel.setBounds(239, 354, 302, 42);
        blackPanel.setBackground(Color.black);

        // cash label
        cashLabel1 = new JLabel("موجودی", SwingConstants.CENTER);
        cashLabel1.setBounds(230, 5, 60, 30);
        cashPanel.add(cashLabel1);
        cashLabel2 = new JLabel("0", SwingConstants.CENTER);
        cashLabel2.setBounds(120, 5, 100, 30);
        cashPanel.add(cashLabel2);

        // cash increase
        cashIncreaseButton = new button("افزایش موجودی", Color.white, cashPanel);
        cashIncreaseButton.getButton().setBounds(10, 5, 100, 30);

        mainPanel.add(cashPanel);
        mainPanel.add(blackPanel);
    }
}
