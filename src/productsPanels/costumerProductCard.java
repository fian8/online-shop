package productsPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class costumerProductCard extends productCard {
    public JButton addToCartButton = new JButton("اضافه به سبد خرید");
    public JButton rateButton = new JButton("امتیاز");
    public costumerProductCard(Product product) {

        super(product);

        mouseLPanel.setLayout(new GridLayout(2, 1, 0, 10));
        mouseLPanel.add(addToCartButton);
        mouseLPanel.add(rateButton);
    }
}
