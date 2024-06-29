package listPanels;

import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;

import static Data.Product.products;

public class stockPanel extends themeTwoPanel {
    public stockPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("موجودی انبار");
        titleLabel.setBounds(465, 40, 150, 30);

        // back base.button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // ----- products list cards panel (main panel) -----
        mainPanel.setLayout(new GridLayout(10, 1));
        mainPanel.setBounds(0, 100, 1080, 620);
        mainPanel.setBackground(Color.gray);

        for (Data.Product product : products) {
            mainPanel.add(new productListCard(product).cardPanel);
        }

    }
}
