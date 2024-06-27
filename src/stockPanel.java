import javax.swing.*;

public class stockPanel extends productsListPanel{
    public stockPanel(JFrame frame) {

        super(frame);

        // text label (edit)
        titleLabel.setText("موجودی انبار");
        titleLabel.setBounds(465, 40, 150, 30);

        // back button
        backButton.goTo(allPanels, null, frame);
    }
}
