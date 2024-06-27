import javax.swing.*;
import java.awt.*;

public class cartPanel extends secondaryPanel {
    button finializeButton;
    public cartPanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("سبد خرید");
        titleLabel.setBounds(485, 40, 120, 30);

        // back button
        backButton.goTo(allPanel, null, frame);

        // finalize button
        finializeButton  = new button("نهایی کن", Color.white, allPanel);
        finializeButton.goTo(allPanel, null, frame);
        finializeButton.getButton().setBounds(490, 630, 100, 30);

    }
}
