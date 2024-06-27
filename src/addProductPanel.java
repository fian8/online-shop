import javax.swing.*;

public class addProductPanel extends productDetailsPanel {
    public addProductPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("افزودن محصول");
        titleLabel.setBounds(455, 40, 170, 30);

        // back button
        backButton.goTo(allPanel, null, frame);

    }
}
