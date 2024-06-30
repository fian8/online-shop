package productsPanels;

import Data.Product;
import base.button;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
        addProductButton = new button("افزودن محصول", primaryColor, navBar);
        addProductButton.getButton().setBounds(510, 45, 120, 30);

        // stock button
        stockButton = new button("موجودی انبار", primaryColor, navBar);
        stockButton.getButton().setBounds(400, 45, 100, 30);

        // "users list" button
        costumersListButton = new button("لیست کاربران", primaryColor, navBar);
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
    public void addProductsCardPanel(ArrayList<Product> AL) {
        last = AL;
        allPanels.remove(productsCardsPanel);
        allPanels.remove(currentPage);
        allPanels.repaint();
        allPanels.revalidate();
        productsCardsPanel.removeAll();
        currentPage.setText(String.valueOf(page));
        currentPage.setBounds(540, 630, 40, 40);
        for (int i = (page - 1) * 6; i < Math.min(page * 6, AL.size()); i++) {
            sellerProductCard productCard = new sellerProductCard(AL.get(i));
            productsCardsPanel.add(productCard.cardPanel);
        }
        productsCardsPanel.repaint();
        productsCardsPanel.revalidate();
        allPanels.add(currentPage);
        allPanels.add(productsCardsPanel);
        allPanels.revalidate();
        allPanels.repaint();
    }
}
