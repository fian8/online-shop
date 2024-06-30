package listPanels;

import Data.Product;

import javax.swing.*;

public class sellerProductListCard extends productListCard {
    public JLabel stockLabel;
    public sellerProductListCard(Product product) {

        super(product);

        stockLabel = new JLabel(String.valueOf(product.getStock()), SwingConstants.CENTER);
        super.addToCardPanel(stockLabel);

    }
}
