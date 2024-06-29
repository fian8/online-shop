package productsPanels;

import base.button;

import javax.swing.*;
import java.awt.*;

public class customerProductsPanel extends productsPanel{
    public button cartButton;
    public Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public customerProductsPanel(JFrame frame) {

        super(frame);

        // ----- extras on navigation bar -----

        // profile base.button
        profileButton.getButton().setBounds(315, 15, 100, 30);
        profileButton.getButton().setOpaque(true);

        // cart base.button
        cartButton = new button("سبد خرید", primaryColor, navBar);
        cartButton.getButton().setBounds(445, 15, 100, 30);

    }
}
