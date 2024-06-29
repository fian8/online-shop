package base;

import javax.swing.*;
import java.awt.*;

public class themeTwoPanel {
    public JLabel titleLabel;
    public JPanel allPanel, mainPanel;
    public button backButton;
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public themeTwoPanel(JFrame frame) {

        // all panels
        allPanel = new JPanel();
        allPanel.setBounds(0, 0, 1080, 720);
        allPanel.setLayout(null);

        // main panel
        mainPanel = new JPanel();
        mainPanel.setBounds(150, 100, 780, 500);
        mainPanel.setBackground(Color.gray);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        allPanel.add(titleLabel);

        allPanel.add(mainPanel);

        frame.add(allPanel);

    }
}
