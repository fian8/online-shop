package Data;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Product extends Component {
    private String name;
    private int code;
    private int price;
    private int stock;
    private int score;
    private int purchaseFrequency;
    private Seller seller;
    JLabel pictureLabel = new JLabel();
    String filePath = "\\Users\\kiana\\OneDrive\\Desktop\\Photos";
    File file;
    JFileChooser fileChooser = new JFileChooser(filePath);

    static ArrayList<Product> products = new ArrayList<>();
    Product(String name, int code, int price, int stock, Seller seller) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.seller = seller;
        score = 0;
        purchaseFrequency = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPurchaseFrequency() {
        return purchaseFrequency;
    }

    public void setPurchaseFrequency(int purchaseFrequency) {
        this.purchaseFrequency = purchaseFrequency;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
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
    public void addPicture() {
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(String.valueOf(file)).getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT));
        pictureLabel.setIcon(imageIcon);
        pictureLabel.setLayout(new BorderLayout());
    }
    //todo
    //1. Add image field(graphic)
}
