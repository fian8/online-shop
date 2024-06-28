package Data;
import java.util.ArrayList;

public class Customer extends User{
    private static ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Product> card = new ArrayList<>();
    public Customer(String nameLastName, String userName, Integer hashPass, String phoneNumber) {
        super(nameLastName, userName, hashPass, phoneNumber);
        super.addUser(this);
        super.setType(2);
        customers.add(this);
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
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
