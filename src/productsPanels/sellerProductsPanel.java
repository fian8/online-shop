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

        // title label (edit)
        titleLabel.setBounds(780, 57, 240, 100);

        // profile button
        profileButton.getButton().setBounds(640, 45, 100, 30);

        // "add product" button
        addProductButton = new button("افزودن محصول", Color.white, navBar);
        addProductButton.getButton().setBounds(510, 45, 120, 30);

        // stock button
        stockButton = new button("موجودی انبار", Color.white, navBar);
        stockButton.getButton().setBounds(400, 45, 100, 30);

        // "users list" button
        costumersListButton = new button("لیست کاربران", Color.white, navBar);
        costumersListButton.getButton().setBounds(290, 45, 100, 30);

        // search field (edit)
        searchField.setBounds(135, 45, 140, 30);

        // search button
        searchButton.getButton().setBounds(60, 45, 70, 30);


        // ----- extras on sort bar -----

        // sales amount Label
        salesAmountTextLabel = new JLabel("میزان فروش", SwingConstants.CENTER);
        salesAmountTextLabel.setBounds(830, 10, 100 ,30);
        sortBar.add(salesAmountTextLabel);
        salesAmountNumLabel = new JLabel("0", SwingConstants.CENTER);
        salesAmountNumLabel.setBounds(760, 10, 100 ,30);
        sortBar.add(salesAmountNumLabel);
    }
}
