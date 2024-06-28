package Data;
import java.util.ArrayList;

public class Customer extends User{
    private ArrayList<Product> card = new ArrayList<>();
    Customer(String name, String lastName, String dateOfBirth, String userName, int hashPass, String phoneNumber) {
        super(name, lastName, dateOfBirth, userName, hashPass, phoneNumber);
        super.addUser(this);
    }
    public void addToCard(Product product) {
        if (product.getStock() > 0) {
            card.add(product);
            product.setStock(product.getStock() - 1);
        }
        else {
            System.out.println("you can't add this");
        }
    }
    public void removeFromCard(Product product) {
        if (card.contains(product))
            card.remove(product);
        else
            System.out.println("you don't have this");
    }
    public ArrayList<Product> getCard() {
        return card;
    }
    //todo
    //  1. handle errors (graphic)
    //  2. handle edit
    //  3. Show the appropriate message
}
