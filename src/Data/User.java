package Data;
import java.util.ArrayList;

public class User {
    static int sourceID = 1000000;
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String userName;
    private int hashPass;
    private String phoneNumber;
    private int wallet;
    private int id;
    private int type;
    private static ArrayList<User> users = new ArrayList<>();
    public User (String name, String lastName, String dateOfBirth, String userName, int hashPass, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.hashPass = hashPass;
        this.phoneNumber = phoneNumber;
        id = sourceID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHashPass() {
        return hashPass;
    }

    public void setHashPass(int hashPass) {
        this.hashPass = hashPass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // customer should Only buy product to decrease wallet
    // seller can Only decrease wallet
    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void addUser(User user) {
        users.add(user);
    }
    public static ArrayList<User> getUsers(){
        return users;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
