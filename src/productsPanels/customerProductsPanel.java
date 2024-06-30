package productsPanels;

import Data.Product;
import base.button;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class customerProductsPanel extends productsPanel{
    public button cartButton;
    public Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    private ArrayList<costumerProductCard> pageProducts = new ArrayList<>();

    public customerProductsPanel(JFrame frame) {

        super(frame);

        // ----- extras on navigation bar -----

        // profile button
        profileButton.getButton().setBounds(560, 45, 100, 30);

        // cart button
        cartButton = new button("سبد خرید", primaryColor, navBar);
        cartButton.getButton().setBounds(440, 45, 100, 30);

    }
    public void addProductsCardPanel(ArrayList<Product> AL) {
        last = AL;
        pageProducts.clear();
        allPanels.remove(productsCardsPanel);
        allPanels.remove(currentPage);
        allPanels.repaint();
        allPanels.revalidate();
        productsCardsPanel.removeAll();
        currentPage.setText(String.valueOf(page));
        currentPage.setBounds(540, 630, 40, 40);
        for (int i = (page - 1) * 6; i < Math.min(page * 6, AL.size()); i++) {
            costumerProductCard productCard = new costumerProductCard(AL.get(i));
            productsCardsPanel.add(productCard.cardPanel);
            pageProducts.add(productCard);
        }
        productsCardsPanel.repaint();
        productsCardsPanel.revalidate();
        allPanels.add(currentPage);
        allPanels.add(productsCardsPanel);
        allPanels.revalidate();
        allPanels.repaint();
    }
    public ArrayList<costumerProductCard> getCards() {
        return pageProducts;
    }
}
