package Data;
import java.util.ArrayList;

public class User {
    static int sourceID = 1000000;
    private String nameLastName;
    private String userName;
    private int hashPass;
    private String phoneNumber;
    private int wallet;
    private int id;
    private int type;
    private static ArrayList<User> users = new ArrayList<>();
    public User (String nameLastName, String userName, Integer hashPass, String phoneNumber) {
        this.nameLastName = nameLastName;
        this.userName = userName;
        this.hashPass = hashPass;
        this.phoneNumber = phoneNumber;
        id = sourceID++;
    }


    public String getNameLastName() {
        return this.nameLastName;
    }
    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getHashPass() {
        return this.hashPass;
    }

    public void setHashPass(Integer hashPass) {
        this.hashPass = hashPass;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // customer should Only buy product to decrease wallet
    // seller can Only decrease wallet
    public int getWallet() {
        return this.wallet;
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
        return this.type;
    }
    public String getTypeString() {
        String ans;
        if (this.getType() == 1) {
            ans = "فروشنده";
        } else {
            ans = "کاربر عادی";
        }
        return ans;
    }

    public void setType(int type) {
        this.type = type;
    }
}
