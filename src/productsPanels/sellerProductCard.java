package productsPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class sellerProductCard extends productCard {
    public JButton editProductButton = new JButton("ویرایش محصول");
    public JButton removeProductButton = new JButton("حذف محصول");

    public sellerProductCard(Product product) {

        super(product);

        mouseLPanel.setLayout(new GridLayout(2, 1, 0, 10));
        mouseLPanel.add(editProductButton);
        mouseLPanel.add(removeProductButton);

    }
}
