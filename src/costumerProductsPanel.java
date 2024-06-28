import javax.swing.*;
import java.awt.*;

public class costumerProductsPanel extends productsPanel{
    public button cartButton;
    public Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public costumerProductsPanel(JFrame frame) {

        super(frame);

        // ----- extras on navigation bar -----

        // profile button
        profileButton.getButton().setBounds(315, 15, 100, 30);
        profileButton.getButton().setOpaque(true);

        // cart button
        cartButton = new button("سبد خرید", primaryColor, navBar);
        cartButton.goTo(allPanels, null, frame);
        cartButton.getButton().setBounds(445, 15, 100, 30);

    }
}
