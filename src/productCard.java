import Data.Product;

import javax.swing.*;
import java.awt.*;

public class productCard {
    private JLabel nameLabel, priceLabel, imageLabel;
    public JPanel cardPanel;
    public productCard(Product product) {

        nameLabel = new JLabel(product.getName());
        priceLabel = new JLabel(String.valueOf(product.getPrice()));
        imageLabel = new JLabel();

        cardPanel.add(imageLabel);
        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);

        cardPanel.setPreferredSize(new Dimension(300, 220));

    }
}
