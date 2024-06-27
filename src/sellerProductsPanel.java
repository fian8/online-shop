import javax.swing.*;
import java.awt.*;

public class sellerProductsPanel extends productsPanel {

    button addProductButton, stockButton, usersListButton;
    JLabel salesAmountTextLabel, salesAmountNumLabel;
    public sellerProductsPanel(JFrame frame) {

        super(frame);

        // ----- extras on navigation bar -----

        // profile button
        profileButton.getButton().setBounds(250, 15, 100, 30);
        profileButton.getButton().setOpaque(true);

        // edit products button
        addProductButton = new button("افزودن محصول", Color.white, navBar);
        addProductButton.goTo(allPanels, null, frame);
        addProductButton.getButton().setBounds(360, 15, 120, 30);

        // stock button
        stockButton = new button("موجودی انبار", Color.white, navBar);
        stockButton.goTo(allPanels, null, frame);
        stockButton.getButton().setBounds(490, 15, 100, 30);

        // users list button
        usersListButton = new button("لیست کاربران", Color.white, navBar);
        usersListButton.goTo(allPanels, null, frame);
        usersListButton.getButton().setBounds(600, 15, 100, 30);

        // search field (edit)
        searchField.setBounds(715, 15, 200, 30);

        // ----- extras on sort bar -----

        // sales amount Label
        salesAmountTextLabel = new JLabel(":میزان فروش");
        salesAmountTextLabel.setBounds(60, 5, 100 ,30);
        sortBar.add(salesAmountTextLabel);
        salesAmountNumLabel = new JLabel("0");
        salesAmountNumLabel.setBounds(170, 5, 100 ,30);
        sortBar.add(salesAmountNumLabel);
    }
}
