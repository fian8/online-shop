package listPanels;

import Data.Customer;
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
        titleLabel.setBounds(390, 70, 300, 60);

        // back base.button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);
        for (Customer customer: Customer.getCustomers())
            mainPanel.add(new customerCard(customer).cardPanel);

    }
}
