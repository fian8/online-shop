import javax.swing.*;
import java.awt.*;

public class productsListPanel {
    JLabel titleLabel;
    JPanel allPanels, productsListCardsPanel;
    button backButton;
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public productsListPanel(JFrame frame) {

        // all panels
        allPanels = new JPanel();
        allPanels.setBounds(0, 0, 1080, 720);
        allPanels.setLayout(null);

        // products list cards panel
        productsListCardsPanel = new JPanel();
        productsListCardsPanel.setBounds(150, 100, 780, 500);
        productsListCardsPanel.setLayout(new GridLayout(5, 1));
        productsListCardsPanel.setBackground(Color.blue);

        // title label
        titleLabel = new JLabel();
        titleLabel.setFont(titleFont);
        allPanels.add(titleLabel);

        // back button
        backButton = new button("برگشت", Color.white, allPanels);
        backButton.getButton().setBounds(150, 40, 100, 30);

        allPanels.add(productsListCardsPanel);

        frame.add(allPanels);

    }
}
