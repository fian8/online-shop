import javax.swing.*;
import java.awt.*;

public class productListCard {
    private JLabel nameLabel, numLabel, imageLabel;
    public JPanel cardPanel;
    public productListCard(String name, int price, JLabel imageLabel) {

        nameLabel = new JLabel(name);
        numLabel = new JLabel(String.valueOf(price));
        // todo:
        //  1. add image label
        //  2. connect to database

        cardPanel.add(imageLabel);
        cardPanel.add(nameLabel);
        cardPanel.add(numLabel);

        cardPanel.setPreferredSize(new Dimension(780, 100));

    }
}
