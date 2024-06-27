import javax.swing.*;
import java.awt.*;

public class cartPanel extends productsListPanel {
    button finializeButton;
    public cartPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("سبد خرید");
        titleLabel.setBounds(485, 40, 120, 30);

        // back button
        backButton.goTo(allPanels, null, frame);

        // finalize button
        finializeButton  = new button("نهایی کن", Color.white, allPanels);
        finializeButton.goTo(allPanels, null, frame);
        finializeButton.getButton().setBounds(490, 630, 100, 30);

    }
}
