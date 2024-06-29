import Data.Product;

import javax.swing.*;
import java.awt.*;

public class productCard {
    public JLabel nameLabel, priceLabel, imageLabel;
    public JPanel cardPanel;
    public productCard(Product product) {

        nameLabel = new JLabel(product.getName());
//        nameLabel.setBounds();
        priceLabel = new JLabel(String.valueOf(product.getPrice()));
//        priceLabel.setBounds();
        imageLabel = new JLabel(product.imageIcon);
//        imageLabel.setBounds();

        cardPanel.add(imageLabel);
        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);

        cardPanel.setPreferredSize(new Dimension(300, 220));

    }
}
