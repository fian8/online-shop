import javax.swing.*;
import java.awt.*;

public class editProfilePanel extends secondaryPanel{

    public button editTheProfileButton;
    public editProfilePanel(JFrame frame) {

        super(frame);

        titleLabel.setText("ویرایش پروفایل");
        titleLabel.setBounds(450, 40, 180, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // edit product button
        editTheProfileButton = new button("ویرایش پروفایل", Color.white, mainPanel);
//        editTheProfileButton.getButton().setBounds();

    }
}
