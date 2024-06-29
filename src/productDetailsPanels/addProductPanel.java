package productDetailsPanels;

import Data.Product;
import Data.Validation;
import base.button;

import javax.swing.*;
import java.awt.*;

public class addProductPanel extends productDetailsPanel {
    public button addTheProductButton;
    public addProductPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("افزودن محصول");
        titleLabel.setBounds(455, 40, 170, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // add product button
        addTheProductButton = new button("افزودن محصول", Color.white, mainPanel);
        addTheProductButton.getButton().setBounds(300, 390, 150, 30);

        // create product
        Validation validator = new Validation();
        String name = nameField.getText();
        String price = priceField.getText();
        String stock = stockField.getText();
        int priceInt = 0, stockInt = 0;

        int i;
        for (i = 0; i < price.length(); i++) {
            if (price.charAt(i) < '0' || price.charAt(i) > '9') {
                JOptionPane.showMessageDialog(null, "مبلغ وارد شده معتبر نیست!");
                break;
            } else {
                priceInt += price.charAt(i);
            }
        }
        int j;
        for (j = 0; j < stock.length(); j++) {
            if (stock.charAt(j) < '0' || stock.charAt(j) > '9') {
                JOptionPane.showMessageDialog(null, "عدد وارد شده معتبر نیست!");
                break;
            } else {
                stockInt += stock.charAt(j);
            }
        }
        if (i == price.length() && j == stock.length() && validator.nameValidation(name)) {
            product = new Product(name, priceInt, stockInt);
        }

    }
}
