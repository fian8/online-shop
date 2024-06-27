import javax.swing.*;
import java.awt.*;

public class listPanel {
    JLabel titleLabel;
    JPanel allPanel, listCardsPanel;
    button backButton;
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public listPanel(JFrame frame) {

        // all panels
        allPanel = new JPanel();
        allPanel.setBounds(0, 0, 1080, 720);
        allPanel.setLayout(null);

        // list cards panel
        listCardsPanel = new JPanel();
        listCardsPanel.setBounds(150, 100, 780, 500);
        listCardsPanel.setBackground(Color.blue);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        allPanel.add(titleLabel);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        allPanel.add(listCardsPanel);

        frame.add(allPanel);

    }
}
