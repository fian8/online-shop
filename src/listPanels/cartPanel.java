package listPanels;

import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static Data.Product.products;

public class cartPanel extends themeTwoPanel {
    public button finializeButton;
    public int total;
    public ArrayList<productListCard> productListCards = new ArrayList<>();
    public cartPanel(JFrame frame) {

        super(frame);

        // main panel (edit)
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("سبد خرید");
        titleLabel.setBounds(485, 40, 120, 30);

        // back base.button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // ----- products list cards panel (main panel) -----
        mainPanel.setLayout(new GridLayout(10, 1));
        mainPanel.setBounds(0, 100, 1080, 620);
        mainPanel.setBackground(Color.gray);

        for (Data.Product product : products) {
            productListCards.add(new productListCard(product));
        }
        for (productListCard productListCard : productListCards) {
            mainPanel.add(productListCard.cardPanel);
        }

        // finalize base.button
        finializeButton  = new button("نهایی کن", Color.white, allPanel);
        finializeButton.getButton().setBounds(490, 630, 100, 30);

    }
}
