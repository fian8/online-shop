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

        // list cards panel
        mainPanel.setLayout(null);

        // back base.button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // name
        nameLabel = new JLabel("نام محصول");
        nameLabel.setBounds(455, 150, 100, 30);
        mainPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(225, 150, 200, 30);
        mainPanel.add(nameField);

        // price
        priceLabel = new JLabel("قیمت محصول");
        priceLabel.setBounds(455, 210, 100, 30);
        mainPanel.add(priceLabel);
        priceField = new JTextField();
        priceField.setBounds(225, 210, 200, 30);
        mainPanel.add(priceField);

        // stock
        stockLabel = new JLabel("موجودی محصول");
        stockLabel.setBounds(455, 270, 100, 30);
        mainPanel.add(stockLabel);
        stockField = new JTextField();
        stockField.setBounds(225, 270, 200, 30);
        mainPanel.add(stockField);

        // image
        imageLabel = new JLabel("تصویر محصول");
        imageLabel.setBounds(455, 330, 100, 30);
        mainPanel.add(imageLabel);
        chooseImage = new button("انتخاب تصویر", Color.white, mainPanel);
        chooseImage.getButton().setBounds(225, 330, 200, 30);

    }
}
