import javax.swing.*;
import java.awt.*;

public class productCard {
    private JLabel nameLabel, priceLabel, imageLabel;
    public JPanel cardPanel;
    public productCard(String name, int price, JLabel imageLabel) {

        nameLabel = new JLabel(name);
        priceLabel = new JLabel(String.valueOf(price));
        // todo:
        //  1. add image label
        //  2. connect to database

        cardPanel.add(imageLabel);
        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);

    }
}
