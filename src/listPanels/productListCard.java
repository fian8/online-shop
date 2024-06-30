package listPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;

public class productListCard {
    public JLabel nameLabel, priceLabel;
    public JPanel cardPanel = new JPanel();

    public productListCard(Product product) {

        cardPanel.setLayout(new GridLayout(1, 3, 300, 0));
        cardPanel.setBackground(Color.lightGray);

        nameLabel = new JLabel(product.getName(), SwingConstants.CENTER);
        priceLabel = new JLabel(String.valueOf(product.getPrice()), SwingConstants.CENTER);

        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);

    }
}
