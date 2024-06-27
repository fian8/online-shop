import javax.swing.*;
import java.awt.*;

public class usersListPanel extends listPanel {
    public usersListPanel(JFrame frame) {

        super(frame);

        // list cards panel
        listCardsPanel.setLayout(new GridLayout(10, 1));

        // text label (edit)
        titleLabel.setText("لیست کاربران");
        titleLabel.setBounds(465, 40, 150, 30);

        // back button
        backButton.goTo(allPanel, null, frame);

    }
}
