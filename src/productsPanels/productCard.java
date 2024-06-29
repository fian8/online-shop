package productsPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;

public class productCard {
    public JLabel nameLabel = new JLabel();
    public JLabel priceLabel = new JLabel();
    public JLabel imageLabel = new JLabel();
    public JPanel cardPanel = new JPanel();
    public productCard(Product product) {

        cardPanel.setLayout(null);
        cardPanel.setPreferredSize(new Dimension(300, 220));
        nameLabel = new JLabel(product.getName());
        nameLabel.setBounds(25, 140, 275, 40);
        priceLabel = new JLabel(String.valueOf(product.getPrice()));
        priceLabel.setBounds(25, 180, 275, 40);
        imageLabel = new JLabel(product.imageIcon);
        imageLabel.setBounds(25, 25, 275, 140);
        cardPanel.add(imageLabel);
        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);
    }
}
