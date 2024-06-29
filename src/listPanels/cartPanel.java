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
    public cartPanel(JFrame frame) {

        super(frame);

        // main panel (edit)
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("سبد خرید");
        titleLabel.setBounds(395, 70, 250, 60);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);

        // finalize base.button
        finializeButton  = new button("نهایی کن", Color.white, allPanel);
        finializeButton.getButton().setBounds(490, 530, 100, 30);
        allPanel.add(mainPanel);

    }
}
