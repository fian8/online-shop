package listPanels;

import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;

public class customersListPanel extends themeTwoPanel {
    public customersListPanel(JFrame frame) {

        super(frame);

        // list cards panel
        mainPanel.setLayout(new GridLayout(10, 1));

        // text label (edit)
        titleLabel.setText("لیست کاربران");
        titleLabel.setBounds(465, 40, 150, 30);

        // back base.button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

    }
}
