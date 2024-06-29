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
        titleLabel.setBounds(370, 70, 340, 60);

        // add product button
        addTheProductButton = new button("افزودن محصول", Color.white, mainPanel);
        addTheProductButton.getButton().setBounds(315, 360, 150, 30);

    }
}
