package productsPanels;

import Data.Product;
import base.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;


public class productCard{
    public Color primaryColor = Color.decode("#FF841F"),
            secondaryColor = Color.decode("#C0E0E4"),
            thirdColor = Color.decode("#4A5A4B");
    public JLabel nameLabel1, nameLabel2, priceLabel1, priceLabel2, imageLabel;

    public JPanel cardPanel = new JPanel();
    public JPanel textCardPanel = new JPanel();
    public JPanel mouseLPanel = new JPanel();

    public productCard(Product product) {

        cardPanel.setLayout(new GridLayout(1, 2, 10, 10));
        cardPanel.setBackground(Color.lightGray);

        imageLabel = new JLabel(product.imageIcon);
        textCardPanel.setLayout(new GridLayout(4, 1, 0, 5));

        nameLabel1 = new JLabel("نام محصول:", SwingConstants.CENTER);
        nameLabel2 = new JLabel(product.getName(), SwingConstants.CENTER);
        textCardPanel.add(nameLabel1);
        textCardPanel.add(nameLabel2);

        priceLabel1 = new JLabel("قیمت محصول:", SwingConstants.CENTER);
        priceLabel2 = new JLabel(String.valueOf(product.getPrice()), SwingConstants.CENTER);
        textCardPanel.add(priceLabel1);
        textCardPanel.add(priceLabel2);

        cardPanel.add(imageLabel);
        cardPanel.add(textCardPanel);


    }
}
