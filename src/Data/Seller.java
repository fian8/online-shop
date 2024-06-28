package Data;
import java.util.ArrayList;

public class Seller extends User{
    static ArrayList<Product> products = new ArrayList<>();
    Seller(String name, String lastName, String dateOfBirth, String userName, int hashPass, String phoneNumber) {
        super(name, lastName, dateOfBirth, userName, hashPass, phoneNumber);
        super.addUser(this);
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void inventoryWithdrawal (int amount) {
        if (amount <= super.getWallet()) {
            super.setWallet(super.getWallet() - amount);
        }
    }
    //todo
    //  1. handle edit
    //  2. Show the appropriate message
}
