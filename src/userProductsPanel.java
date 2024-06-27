import javax.swing.*;
import java.awt.*;

public class userProductsPanel extends productsPanel{
    button profileButton, cartButton;
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public userProductsPanel(JFrame frame) {

        super(frame);

        // extras on navigation bar:

        // profile button
        profileButton = new button("پنل کاربری", primaryColor, navBar);
        profileButton.goTo(navBar, null, frame);
        profileButton.getButton().setBounds(315, 15, 100, 30);
        profileButton.getButton().setOpaque(true);

        // cart button
        cartButton = new button("سبد خرید", primaryColor, navBar);
        cartButton.goTo(navBar, null, frame);
        cartButton.getButton().setBounds(445, 15, 100, 30);

    }
}
