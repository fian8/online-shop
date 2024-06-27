import javax.swing.*;
import java.awt.*;
import java.io.File;

public class productDetailsPanel extends listPanel {
    JLabel nameLabel, priceLabel, imageLabel;
    JTextField nameField, priceField;
    button chooseImage;
    public productDetailsPanel(JFrame frame) {

        super(frame);

        // list cards panel
        listCardsPanel.setLayout(null);

        // back button
        backButton.goTo(allPanel, null, frame);

        // name
        nameLabel = new JLabel("نام محصول");
        nameLabel.setBounds(455, 150, 100, 30);
        listCardsPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(225, 150, 200, 30);
        listCardsPanel.add(nameField);

        // price
        priceLabel = new JLabel("قیمت محصول");
        priceLabel.setBounds(455, 210, 100, 30);
        listCardsPanel.add(priceLabel);
        priceField = new JTextField();
        priceField.setBounds(225, 210, 200, 30);
        listCardsPanel.add(priceField);

        // image
        imageLabel = new JLabel("تصویر محصول");
        imageLabel.setBounds(455, 270, 100, 30);
        listCardsPanel.add(imageLabel);
        chooseImage = new button("انتخاب تصویر", Color.white, listCardsPanel);
        chooseImage.getButton().setBounds(225, 270, 200, 30);

    }
}
