package profilePanels;

import javax.swing.*;

public class sellerProfilePanel extends profilePanel {
    public sellerProfilePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل کاربری فروشنده");
        titleLabel.setBounds(480, 40, 120, 30);
        
    }
}
