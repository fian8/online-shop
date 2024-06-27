import javax.swing.*;
import java.awt.*;

public class Main {
    public static JFrame frame;
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public  Font font = new Font("Geeza Pro",  Font.PLAIN, 15);

    public static void main(String[] args) {
        frame = new JFrame("online-shop");
        frame.setSize(1080, 720);
        frame.setLayout(null);

        productsPanel productsPanel = new sellerProductsPanel(frame);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    // todo:
    //  1. frame: scrollable
    //  2. frame: fixed size or responsive.
}