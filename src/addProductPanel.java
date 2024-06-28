import javax.swing.*;
import java.awt.*;

public class addProductPanel extends productDetailsPanel {
    public addProductPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("افزودن محصول");
        titleLabel.setBounds(455, 40, 170, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

    }
}
