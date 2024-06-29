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
        titleLabel.setBounds(370, 70, 340, 60);

        // add product button
        editTheProductButton = new button("ویرایش محصول", Color.white, mainPanel);
        editTheProductButton.getButton().setBounds(315, 360, 150, 30);


    }
}
