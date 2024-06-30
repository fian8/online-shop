package listPanels;

import Data.Product;
import Data.User;
import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static Data.Product.*;

public class cartPanel extends themeTwoPanel {
    public button finializeButton;
    private int total;
    public cartPanel(JFrame frame) {

        super(frame);

        // main panel (edit)
        mainPanel.setLayout(new GridLayout(10, 1));

        // text label (edit)
        titleLabel.setText("سبد خرید");
        titleLabel.setBounds(435, 70, 210, 60);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);

        // finalize base.button
        finializeButton  = new button("نهایی کن", Color.white, allPanel);
        finializeButton.getButton().setBounds(490, 530, 100, 30);
        allPanel.add(mainPanel);

    }
    public void showCard(User user) {
        total = 0;
        for (Product product: user.getCart()) {
            total += product.getPrice();
            if (user.getType() == 1) {
                sellerProductListCard productList = new sellerProductListCard(product);
                mainPanel.add(productList.cardPanel);
            }
            else {
                customerProductListCard productList = new customerProductListCard(product);
                mainPanel.add(productList.cardPanel);
            }
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
