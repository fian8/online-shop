import Data.*;

import java.util.ArrayList;

public class Validation {
    Validation() {

    }
    public boolean nameValidation(String name) {
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))
                continue;
            else
                return false;
        }
        return true;
    }
    public boolean checkPassword(String password) {
        if (password.length() < 4 || password.length() > 8)
            return false;
        return true;
    }
    public boolean checkUserName(String userName) {
        for (int i = 0; i < userName.length(); i++) {
            if ((userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z') || (userName.charAt(i) >= 'A' && userName.charAt(i) <= 'Z')
            || (userName.charAt(i) >= '0' && userName.charAt(i) <= '9') || userName.charAt(i) == '_')
                continue;
            else
                return false;
        }
        return true;
    }
    public User getUser(String userName) {
        ArrayList<User> users = User.getUsers();
        for (int i = 0; i < users.size(); i++)
            if (users.get(i).getUserName().equals(userName))
                return users.get(i);
        return null;
    }
    public boolean exist(String userName) {
        ArrayList<User> users = User.getUsers();
        for (int i = 0; i < users.size(); i++)
            if (users.get(i).getUserName().equals(userName))
                return true;
        return false;
    }
    public int Hash(String password) {
        return password.hashCode();
    }
    public boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 11 && phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '9')
            return true;
        return false;
    }
}
