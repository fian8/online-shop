import javax.swing.*;
import java.awt.*;

public class cashIncreasePanel extends secondaryPanel{

    public JLabel increaseTheCashLabel;
    public JTextField increaseTheCashField;
    public button increaseTheCashButton;
    public cashIncreasePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("افزایش موجودی");
        titleLabel.setBounds(485, 40, 200, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // increase the cash label
        increaseTheCashLabel = new JLabel("مبلغ افزایش موجودی");
        increaseTheCashLabel.setBounds(425, 150, 200, 30);
        mainPanel.add(increaseTheCashLabel);

        // increase the cash field
        increaseTheCashField = new JTextField();
        increaseTheCashField.setBounds(255, 150, 200, 30);
        mainPanel.add(increaseTheCashField);

        // increase the cash button
        increaseTheCashButton = new button("افزودن موجودی", Color.white, mainPanel);
        increaseTheCashButton.getButton().setBounds(300, 200, 150, 30);

    }
}
