package profilePanels;

import base.button;

import javax.swing.*;
import java.awt.*;

public class sellerProfilePanel extends profilePanel {
    public sellerProfilePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل فروشنده");
        titleLabel.setBounds(405, 70, 270, 60);

        // name (edit)
        nameLabel1.setBounds(453, 120, 100, 30);
        nameLabel2.setBounds(225, 120, 200, 30);

        // phone number (edit)
        phoneNumLabel1.setBounds(453, 180, 100, 30);
        phoneNumLabel2.setBounds(225, 180, 200, 30);

        // username (edit)
        userNameLabel1.setBounds(453, 240, 100, 30);
        userNameLabel2.setBounds(225, 240, 200, 30);

        // "user type" label (edit)
        userTypeLabel1.setBounds(453, 300, 100, 30);
        userTypeLabel2.setBounds(225, 300, 200, 30);

        // "edit profile" button (edit)
        editProfileButton.getButton().setBounds(620, 490, 100, 30);

        // "products panel" button (edit)
        productsPanelButton.getButton().setBounds(490, 490, 100, 30);

        // exit button (edit)
        exitButton.getButton().setBounds(360, 490, 100, 30);


        // back & black panels (border) (edit)
        backPanel.setBounds(190, 100, 410, 250);
        blackPanel.setBounds(189, 99, 412, 252);
        
    }
}
