import javax.swing.*;

public class editProductPanel extends productDetailsPanel {
    public editProductPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("ویرایش محصول");
        titleLabel.setBounds(450, 40, 180, 30);

        // back button
        backButton.goTo(allPanel, null, frame);

    }
}
