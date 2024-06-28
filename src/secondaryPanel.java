import javax.swing.*;
import java.awt.*;

public class secondaryPanel {
    JLabel titleLabel;
    public JPanel allPanel, mainPanel;
    public button backButton;
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public secondaryPanel(JFrame frame) {

        // all panels
        allPanel = new JPanel();
        allPanel.setBounds(0, 0, 1080, 720);
        allPanel.setLayout(null);

        // main panel
        mainPanel = new JPanel();
        mainPanel.setBounds(150, 100, 780, 500);
        mainPanel.setBackground(Color.blue);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        allPanel.add(titleLabel);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        allPanel.add(mainPanel);

        frame.add(allPanel);

    }
}
