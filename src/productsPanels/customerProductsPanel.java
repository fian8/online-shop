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

        // profile button
        profileButton.getButton().setBounds(560, 45, 100, 30);

        // cart button
        cartButton = new button("سبد خرید", primaryColor, navBar);
        cartButton.getButton().setBounds(440, 45, 100, 30);

    }
}
