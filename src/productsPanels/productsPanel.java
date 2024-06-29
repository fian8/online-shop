package productsPanels;

import base.button;

import Data.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

import static Data.Product.products;

public class productsPanel {
    public JLabel titleLabel, sortLabel, currentPage;
    public JPanel allPanels, navBar, sortBar, productsCardsPanel;
    public JTextField searchField;
    public button profileButton, searchButton, sortByMostExpensive, sortByCheapest, sortByMostPopular;
    public JButton previousPage, nextPage;
    public Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public ArrayList<Product> last = products;
    public int page = 1;
    public productsPanel(JFrame frame) {

        // all panels
        allPanels = new JPanel();
        allPanels.setBounds(0, 0, 1080, 720);
        allPanels.setLayout(null);

        // ----- navigation bar panel -----
        navBar = new JPanel();
        navBar.setLayout(null);
        navBar.setBounds(0, 0, 1080, 60);
        navBar.setBackground(Color.decode("#FF841F"));

        // title label
        titleLabel = new JLabel("Online Shop");
        titleLabel.setBounds(60, 17, 200, 30);
        titleLabel.setFont(titleFont);
        navBar.add(titleLabel);

        // profile base.button
        profileButton = new button("پنل کاربری", primaryColor, navBar);

        // search field
        searchField = new JTextField();
        searchField.setBounds(615, 15, 300, 30);
        navBar.add(searchField);

        // search base.button
        searchButton = new button("جست‌و‌جو", primaryColor, navBar);
        searchButton.getButton().setBounds(920, 15, 100, 30);

        // ----- sort Bar panel -----
        sortBar = new JPanel();
        sortBar.setLayout(null);
        sortBar.setBounds(0, 60, 1080, 40);
        sortBar.setBackground(Color.pink);

        // sort label
        sortLabel = new JLabel("مرتب سازی بر اساس");
        sortLabel.setBounds(915, 5, 105, 30);
        sortBar.add(sortLabel);

        // sort by most expensive
        sortByMostExpensive = new button("گران‌ترین", primaryColor, sortBar);
        sortByMostExpensive.getButton().setBounds(800, 5, 100, 30);

        // sort by cheapest
        sortByCheapest = new button("ارزان‌ترین", primaryColor, sortBar);
        sortByCheapest.getButton().setBounds(695, 5, 100, 30);

        // sort by most popular
        sortByMostPopular = new button("پرطرفدار‌ترین", primaryColor, sortBar);
        sortByMostPopular.getButton().setBounds(590, 5, 100, 30);

        // ----- products Cards panel -----

        productsCardsPanel = new JPanel();
        productsCardsPanel.setLayout(new GridLayout(2, 3, 10, 10));
        productsCardsPanel.setBounds(0, 100, 1080, 620);

        productsCardsPanel.setBackground(Color.gray);

         // page label
        previousPage = new JButton("⇨");
        currentPage = new JLabel("1");
        nextPage = new JButton("⇦");
        nextPage.setFocusable(false);
        currentPage.setFocusable(false);
        previousPage.setBounds(580, 630, 40, 40);
        currentPage.setBounds(520, 630, 40, 40);
        nextPage.setBounds(460, 630, 40, 40);
        previousPage.setBackground(Color.decode("#FF841F"));
        currentPage.setBackground(Color.decode("#FF841F"));
        nextPage.setBackground(Color.decode("#FF841F"));
        allPanels.add(previousPage);
        allPanels.add(currentPage);
        allPanels.add(nextPage);
        for (int i = 0; i < Math.min(6, last.size()); i++)
            productsCardsPanel.add(new productCard(last.get(i)).cardPanel);
        allPanels.add(navBar);
        allPanels.add(sortBar);
        allPanels.add(productsCardsPanel);
        frame.add(allPanels);

    }
    public void addProductsCardPanel(ArrayList<Product> AL, JFrame frame) {
        last = AL;
        frame.remove(allPanels);
        allPanels.remove(productsCardsPanel);
        allPanels.remove(currentPage);
        currentPage.setText(Integer.toString(page));
        productsCardsPanel.removeAll();
        for (int i = (page - 1) * 6; i < Math.min(page * 6, AL.size()); i++)
            productsCardsPanel.add(new productCard(AL.get(i)).cardPanel);
        allPanels.add(productsCardsPanel);
        allPanels.add(currentPage);
        frame.add(allPanels);
        frame.revalidate();
        frame.repaint();

    }
}
