import javax.swing.*;

public class sellerProfilePanel extends profilePanel {
    public sellerProfilePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل کاربری");
        titleLabel.setBounds(480, 40, 120, 30);

        // back button
        backButton.goTo(allPanel, null, frame);
        
    }
}
