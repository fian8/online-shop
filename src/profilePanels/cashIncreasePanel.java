package profilePanels;

import base.button;
import base.themeTwoPanel;

import javax.swing.*;
import java.awt.*;

public class cashIncreasePanel extends themeTwoPanel {

    public JLabel increaseTheCashLabel;
    public JTextField increaseTheCashField;
    public button increaseTheCashButton;
    public cashIncreasePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("افزایش موجودی");
        titleLabel.setBounds(365, 70, 350, 60);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(200, 80, 100, 30);

        // "increase the cash" label
        increaseTheCashLabel = new JLabel("مبلغ");
        increaseTheCashLabel.setBounds(490, 180, 200, 30);
        mainPanel.add(increaseTheCashLabel);

        // "increase the cash" field
        increaseTheCashField = new JTextField();
        increaseTheCashField.setBounds(270, 180, 200, 30);
        mainPanel.add(increaseTheCashField);

        // "increase the cash" button
        increaseTheCashButton = new button("افزودن موجودی", Color.white, mainPanel);
        increaseTheCashButton.getButton().setBounds(330, 230, 120, 30);

    }
}
