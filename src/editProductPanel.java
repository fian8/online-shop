import javax.swing.*;
import java.awt.*;

public class editProductPanel extends productDetailsPanel {
    public button editTheProductButton;
    public editProductPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("ویرایش محصول");
        titleLabel.setBounds(450, 40, 180, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // edit product button
        editTheProductButton = new button("ویرایش محصول", Color.white, mainPanel);
//        editTheProductButton.getButton().setBounds();

    }
}
