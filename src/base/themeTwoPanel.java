package base;

import javax.swing.*;
import java.awt.*;

public class themeTwoPanel {
    public JLabel titleLabel;
    public JPanel allPanel, mainPanel;
    public button backButton;
    public  Color primaryColor = Color.decode("#FF841F"),
            secondaryColor = Color.decode("#C0E0E4"),
            thirdColor = Color.decode("#4A5A4B");

    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 60);
    public themeTwoPanel(JFrame frame) {

        // all panels
        allPanel = new JPanel();
        allPanel.setBounds(0, 0, 1080, 720);
        allPanel.setLayout(null);

        // main panel
        mainPanel = new JPanel();
        mainPanel.setBounds(150, 110, 780, 500);
        mainPanel.setBackground(secondaryColor);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        mainPanel.add(titleLabel);
        allPanel.add(titleLabel);

        allPanel.add(mainPanel);
        frame.add(allPanel);

    }
}
