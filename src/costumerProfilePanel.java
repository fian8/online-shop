import javax.swing.*;
import java.awt.*;

public class costumerProfilePanel extends profilePanel {
    JPanel cashPanel;
    JLabel cashLabel1, cashLabel2;
    button cashIncreaseButton;

    public costumerProfilePanel(JFrame frame) {

        super(frame);

        // main panel
        mainPanel.setLayout(null);

        // text label (edit)
        titleLabel.setText("پنل کاربری کاربر عادی");
        titleLabel.setBounds(480, 40, 120, 30);

        // edit profile button (edit)
        editProfileButton.getButton().setBounds(620, 450, 100, 30);

        // products panel button (edit)
        productsPanelButton.getButton().setBounds(490, 450, 100, 30);

        // exit button (edit)
        exitButton.getButton().setBounds(360, 450, 100, 30);

        // cash panel
        cashPanel = new JPanel();
        cashPanel.setLayout(null);
        cashPanel.setBounds(375, 390, 340, 40);
        cashPanel.setBackground(Color.gray);

        // cash label
        cashLabel1 = new JLabel("موجودی", SwingConstants.CENTER);
        cashLabel1.setBounds(230, 5, 100, 30);
        cashPanel.add(cashLabel1);
        cashLabel2 = new JLabel("0", SwingConstants.CENTER);
        cashLabel2.setBounds(120, 5, 100, 30);
        cashPanel.add(cashLabel2);

        // cash increase
        cashIncreaseButton = new button("افزایش موجودی", Color.white, cashPanel);
        cashIncreaseButton.getButton().setBounds(10, 5, 100, 30);

        allPanel.add(cashPanel);
    }
}
