import javax.swing.*;
import java.awt.*;

public class productsPanel {
    public JLabel title, sortLabel;
    public JPanel allPanels, navBar, sortBar, productsCardsPanel;
    public JTextField searchField;
    public button searchButton, sortByMostExpensive, sortByCheapest, sortByMostPopular;
    public  Font titleFont = new Font("Geeza Pro",  Font.PLAIN, 30);
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
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
        title = new JLabel("Online Shop");
        title.setBounds(60, 17, 200, 30);
        title.setFont(titleFont);
        navBar.add(title);

        // search field
        searchField = new JTextField();
        searchField.setBounds(615, 15, 300, 30);
        navBar.add(searchField);

        // search button
        searchButton = new button("جست‌و‌جو", primaryColor, navBar);
        // todo:
        //  1. add action listener
        //  2. search class in action listener
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
        // todo:
        //  1. add action listener
        //  2. sort class in action listener
        sortByMostExpensive.getButton().setBounds(800, 5, 100, 30);

        // sort by cheapest
        sortByCheapest = new button("ارزان‌ترین", primaryColor, sortBar);
        // todo:
        //  1. add action listener
        //  2. sort class in action listener
        sortByCheapest.getButton().setBounds(695, 5, 100, 30);

        // sort by most popular
        sortByMostPopular = new button("پرطرفدار‌ترین", primaryColor, sortBar);
        // todo:
        //  1. add action listener
        //  2. sort class in action listener
        sortByMostPopular.getButton().setBounds(590, 5, 100, 30);

        // ----- products Cards panel -----
        productsCardsPanel = new JPanel();
        productsCardsPanel.setLayout(new GridLayout(2, 3));
        productsCardsPanel.setBounds(0, 100, 1080, 620);
        productsCardsPanel.setBackground(Color.blue);
        // todo:
        //  1. connect to database & create product cards
        //  2. add "pages" feature


        allPanels.add(navBar);
        allPanels.add(sortBar);
        allPanels.add(productsCardsPanel);

        frame.add(allPanels);
    }
}
