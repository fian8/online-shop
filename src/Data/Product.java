package Data;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Product extends Component {
    private String name;
    private int price, stock, rate;
    public JLabel imageLabel = new JLabel();
    public ImageIcon imageIcon;
    public String filePath = "/home/...";
    public File file;
    public JFileChooser fileChooser = new JFileChooser(filePath);
    public static ArrayList<Product> products = new ArrayList<>();

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        rate = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }
    public static void addProduct(Product product) {
        products.add(product);
    }

    public void chooseFileImage(){
        fileChooser.setAcceptAllFileFilterUsed(false);
        int option = fileChooser.showOpenDialog(Product.this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
        }
    }
    public void addImage() {
        imageIcon = new ImageIcon(new ImageIcon(String.valueOf(file)).getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT));
        imageLabel.setIcon(imageIcon);
        imageLabel.setLayout(new BorderLayout());
    }
}
