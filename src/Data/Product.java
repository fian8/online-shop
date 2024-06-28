package Data;

import java.util.ArrayList;

public class Product {
    private String name;
    private int code;
    private int price;
    private int stock;
    private int score;
    private int purchaseFrequency;
    private Seller seller;
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
    //todo
    //1. Add image field(graphic)
}
