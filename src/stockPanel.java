import javax.swing.*;
import java.awt.*;

public class stockPanel extends secondaryPanel {
    public stockPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("موجودی انبار");
        titleLabel.setBounds(465, 40, 150, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

    }
}
