package productDetailsPanels;

import Data.Product;
import base.button;

import javax.swing.*;
import java.awt.*;

import static Data.Product.products;

public class editProductPanel extends productDetailsPanel {
    public button editTheProductButton;
    public editProductPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("ویرایش محصول");
        titleLabel.setBounds(455, 40, 170, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // add product button
        editTheProductButton = new button("ویرایش محصول", Color.white, mainPanel);
        editTheProductButton.getButton().setBounds(300, 390, 150, 30);

        // create product
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

    }
}
