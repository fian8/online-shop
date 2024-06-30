package listPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;

public class productListCard {
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JPanel cardPanel = new JPanel();

    public productListCard(Product product) {

        cardPanel.setLayout(new GridLayout(1, 3, 300, 0));
        cardPanel.setBackground(Color.lightGray);

        nameLabel = new JLabel(product.getName(), SwingConstants.CENTER);
        priceLabel = new JLabel(String.valueOf(product.getPrice()), SwingConstants.CENTER);

        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);
    }
    JLabel getNameLabel() {
        return nameLabel;
    }
    JLabel getPriceLabel() {
        return priceLabel;
    }
    JPanel getCardPanel() {
        return cardPanel;
    }
     void addToCardPanel(JLabel label) {
        cardPanel.add(label);
     }
}
