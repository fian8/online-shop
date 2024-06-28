import javax.swing.*;
import java.awt.*;

public class cashIncreasePanel extends secondaryPanel{

    public JLabel increaseTheCashLabel;
    public JTextField increaseTheCashField;
    public button increaseTheCashButton;
    public cashIncreasePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(new GridLayout(5, 1));

        // text label (edit)
        titleLabel.setText("افزایش موجودی");
        titleLabel.setBounds(485, 40, 120, 30);

        // back button
        backButton = new button("برگشت", Color.white, allPanel);
        backButton.getButton().setBounds(150, 40, 100, 30);

        // increase the cash label
        increaseTheCashLabel = new JLabel("مبلغ افزایش موجودی");
//        increaseTheCashLabel.setBounds();

        // increase the cash field
        increaseTheCashField = new JTextField();
//        increaseTheCashField.setBounds();

        // increase the cash button
        increaseTheCashButton = new button("افزودن موجودی", Color.white, mainPanel);
//        increaseTheCashButton.getButton().setBounds();

    }
}
