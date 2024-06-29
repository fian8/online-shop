package productDetailsPanels;

import Data.Product;
import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;

public class productDetailsPanel extends themeTwoPanel {
    public Product product;
    public JLabel nameLabel, priceLabel, stockLabel, imageLabel;
    public JTextField nameField, priceField, stockField;
    public button chooseImage;
    public productDetailsPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);

        // name
        nameLabel = new JLabel("نام محصول");
        nameLabel.setBounds(455, 120, 100, 30);
        mainPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.getCaret().setBlinkRate(0);
        nameField.setBounds(225, 120, 200, 30);
        mainPanel.add(nameField);

        // price
        priceLabel = new JLabel("قیمت محصول");
        priceLabel.setBounds(455, 180, 100, 30);
        mainPanel.add(priceLabel);
        priceField = new JTextField();
        priceField.getCaret().setBlinkRate(0);
        priceField.setBounds(225, 180, 200, 30);
        mainPanel.add(priceField);

        // stock
        stockLabel = new JLabel("موجودی محصول");
        stockLabel.setBounds(455, 240, 100, 30);
        mainPanel.add(stockLabel);
        stockField = new JTextField();
        stockField.getCaret().setBlinkRate(0);
        stockField.setBounds(225, 240, 200, 30);
        mainPanel.add(stockField);

        // image
        imageLabel = new JLabel("تصویر محصول");
        imageLabel.setBounds(455, 300, 100, 30);
        mainPanel.add(imageLabel);
        chooseImage = new button("انتخاب تصویر", Color.white, mainPanel);
        chooseImage.getButton().setBounds(225, 300, 200, 30);

    }
}
