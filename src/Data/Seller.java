package Data;
import java.util.ArrayList;

public class Seller extends User{
    private static ArrayList<Seller> sellers = new ArrayList<>();
    public Seller(String nameLastName, String userName, Integer hashPass, String phoneNumber) {
        super(nameLastName, userName, hashPass, phoneNumber);
        super.addUser(this);
        super.setType(1);
        sellers.add(this);
    }
    public void addProduct(Product product) {
        Product.addProduct(product);
    }
    public ArrayList<Seller> getSellers() {
        return sellers;
    }
    public void inventoryWithdrawal (int amount) {
        if (amount <= super.getWallet()) {
            super.setWallet(super.getWallet() - amount);
        }
    }
}
