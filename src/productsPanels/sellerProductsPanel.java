package productsPanels;

import base.button;

import javax.swing.*;
import java.awt.*;

public class sellerProductsPanel extends productsPanel {

    public button addProductButton;
    public button stockButton;
    public button costumersListButton;
    JLabel salesAmountTextLabel;
    public JLabel salesAmountNumLabel;
    public sellerProductsPanel(JFrame frame) {

        super(frame);

        // ----- extras on navigation bar -----

        // profile base.button
        profileButton.getButton().setBounds(250, 15, 100, 30);
        profileButton.getButton().setOpaque(true);

        // add products base.button
        addProductButton = new button("افزودن محصول", Color.white, navBar);
        addProductButton.getButton().setBounds(360, 15, 120, 30);

        // stock base.button
        stockButton = new button("موجودی انبار", Color.white, navBar);
        stockButton.getButton().setBounds(490, 15, 100, 30);

        // users list base.button
        costumersListButton = new button("لیست کاربران", Color.white, navBar);
        costumersListButton.getButton().setBounds(600, 15, 100, 30);

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
