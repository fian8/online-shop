package listPanels;

import Data.Product;

import javax.swing.*;

public class customerProductListCard extends productListCard {
    public JLabel numLabel;
    public customerProductListCard(Product product) {

        super(product);

        numLabel = new JLabel(String.valueOf(product.getStock()), SwingConstants.CENTER);
        super.addToCardPanel(numLabel);
    }
}
