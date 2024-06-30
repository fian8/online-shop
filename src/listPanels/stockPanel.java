package listPanels;

import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;

import static Data.Product.*;

public class stockPanel extends themeTwoPanel {
    public stockPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("موجودی انبار");
        titleLabel.setBounds(395, 70, 290, 60);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);

    }
}
