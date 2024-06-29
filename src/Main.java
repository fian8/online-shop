import Comparator.*;
import Data.*;
import listPanels.*;
import loginSignup.loginPanel;
import loginSignup.signupPanel;
import productDetailsPanels.addProductPanel;
import productDetailsPanels.editProductPanel;
import productsPanels.customerProductsPanel;
import productsPanels.productsPanel;
import productsPanels.sellerProductsPanel;
import profilePanels.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Main implements ActionListener {

    // --OBJECTS--:
    public static JFrame frame;
    private User user = null;
    public Validation validator = new Validation();
    public loginSignup.loginPanel loginPanel;
    public loginSignup.signupPanel signupPanel;
    public editProfilePanel editProfilePanel;
    public customerProfilePanel customerProfilePanel;
    public sellerProfilePanel sellerProfilePanel;
    public profilePanels.cashIncreasePanel cashIncreasePanel;
    public productsPanels.productsPanel productsPanel;
    public productsPanels.customerProductsPanel customerProductsPanel;
    public productsPanels.sellerProductsPanel sellerProductsPanel;
    public listPanels.cartPanel cartPanel;
    public productDetailsPanels.addProductPanel addProductPanel;
    public listPanels.stockPanel stockPanel;
    public listPanels.customersListPanel customersListPanel;
    public productDetailsPanels.editProductPanel editProductPanel;
    // ----

    // --DESIGN--:
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public  Font font = new Font("Geeza Pro",  Font.PLAIN, 15);
    // ----

    public Main(){
        frame = new JFrame("online-shop");
        frame.setSize(1080, 720);
        frame.setLayout(null);
        frame.setResizable(false);



        // --INITIALIZING--:

        // ----- login panel -----
        loginPanel = new loginPanel(frame);
        loginPanel.loginButton.getButton().addActionListener(this);
        loginPanel.signupButton.getButton().addActionListener(this);

        // ----- signup panel -----
        signupPanel = new signupPanel(frame);
        signupPanel.loginButton.getButton().addActionListener(this);
        signupPanel.signupButton.getButton().addActionListener(this);

        // ----- costumer profile panel -----
        customerProfilePanel = new customerProfilePanel(frame);
        customerProfilePanel.editProfileButton.getButton().addActionListener(this);
        customerProfilePanel.exitButton.getButton().addActionListener(this);
        customerProfilePanel.productsPanelButton.getButton().addActionListener(this);
        customerProfilePanel.cashIncreaseButton.getButton().addActionListener(this);

        // ----- seller profile panel -----
        sellerProfilePanel = new sellerProfilePanel(frame);
        sellerProfilePanel.editProfileButton.getButton().addActionListener(this);
        sellerProfilePanel.exitButton.getButton().addActionListener(this);
        sellerProfilePanel.productsPanelButton.getButton().addActionListener(this);

        // ----- edit profile panel -----
        editProfilePanel = new editProfilePanel(frame);
        editProfilePanel.editTheProfileButton.getButton().addActionListener(this);
        editProfilePanel.backButton.getButton().addActionListener(this);

        // ----- cash increase panel -----
        cashIncreasePanel = new cashIncreasePanel(frame);
        cashIncreasePanel.increaseTheCashButton.getButton().addActionListener(this);
        cashIncreasePanel.backButton.getButton().addActionListener(this);

        // ----- products panel -----
        productsPanel = new productsPanel(frame);
        productsPanel.searchButton.getButton().addActionListener(this);
        productsPanel.sortByMostExpensive.getButton().addActionListener(this);
        productsPanel.sortByCheapest.getButton().addActionListener(this);
        productsPanel.sortByMostPopular.getButton().addActionListener(this);

        // ----- costumer products panel -----
        customerProductsPanel = new customerProductsPanel(frame);
        customerProductsPanel.profileButton.getButton().addActionListener(this);
        customerProductsPanel.cartButton.getButton().addActionListener(this);

        // ----- cart panel -----
        cartPanel = new cartPanel(frame);
        cartPanel.finializeButton.getButton().addActionListener(this);
        cartPanel.backButton.getButton().addActionListener(this);

        // ----- seller products panel -----
        sellerProductsPanel = new sellerProductsPanel(frame);
        sellerProductsPanel.profileButton.getButton().addActionListener(this);
        sellerProductsPanel.addProductButton.getButton().addActionListener(this);
        sellerProductsPanel.stockButton.getButton().addActionListener(this);
        sellerProductsPanel.costumersListButton.getButton().addActionListener(this);

        // ----- add product panel -----
        addProductPanel = new addProductPanel(frame);
        addProductPanel.addTheProductButton.getButton().addActionListener(this);
        addProductPanel.backButton.getButton().addActionListener(this);

        // ----- stock panel -----
        stockPanel = new stockPanel(frame);
        stockPanel.backButton.getButton().addActionListener(this);

        // ----- costumers list panel -----
        customersListPanel = new customersListPanel(frame);
        customersListPanel.backButton.getButton().addActionListener(this);

        // ----- edit product panel -----
        editProductPanel = new editProductPanel(frame);
        editProductPanel.editTheProductButton.getButton().addActionListener(this);
        editProductPanel.backButton.getButton().addActionListener(this);


        // ----



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        loginPanel.loginButton.goTo(loginPanel.allPanel, loginPanel.allPanel, frame);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
    public void clearFields(){
        loginPanel.userNameField.setText("");
        loginPanel.passwordField.setText("");
        signupPanel.nameField.setText("");
        signupPanel.passwordField.setText("");
        signupPanel.phoneNumField.setText("");
        signupPanel.userNameField.setText("");
        signupPanel.userTypeButtonGroup.clearSelection();
        editProfilePanel.nameField.setText("");
        editProfilePanel.passwordField.setText("");
        editProfilePanel.phoneNumField.setText("");
        editProfilePanel.userNameField.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        // ----- login & signup panels -----
        if (e.getSource() == signupPanel.signupButton.getButton()){
            String nameLastName = signupPanel.nameField.getText();
            String phoneNumber = signupPanel.phoneNumField.getText();
            String userName = signupPanel.userNameField.getText();
            String password = signupPanel.passwordField.getText();
            int hash = validator.Hash(password);
            if (validator.nameValidation(nameLastName)) {
                if (!validator.exist(userName)) {
                    if (validator.checkUserName(userName)) {
                        if (validator.validPhoneNumber(phoneNumber)) {
                            if (validator.checkPassword(password)) {
                                if (signupPanel.sellerRadioButton.isSelected()) {
                                    user = new Seller(nameLastName, userName, hash, phoneNumber);
                                    JOptionPane.showMessageDialog(null, "فروشنده با موفقیت ثبت نام شد! \n وارد شوید.");
                                    signupPanel.signupButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
                                    clearFields();
                                } else if (signupPanel.costumerRadioButton.isSelected()) {
                                    user = new Customer(nameLastName, userName, hash, phoneNumber);
                                    JOptionPane.showMessageDialog(null, "کاربر عادی با موفقیت ثبت نام شد! \n وارد شوید.");
                                    signupPanel.signupButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
                                    clearFields();
                                } else {
                                    JOptionPane.showMessageDialog(null, "نوع کاربر را انتخاب کنید!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "رمز معتبر نیست!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "شماره تلفن معتبر نیست معتبر نیست!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "نام کاربری معتبر نیست!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "نام کاربری تکراری است!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "نام و نام خانوادگی معتبر نیست!");
            }
        }
        else if (e.getSource() == signupPanel.loginButton.getButton()) {
            signupPanel.loginButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
            clearFields();
        }
        else if (e.getSource() == loginPanel.signupButton.getButton()) {
            loginPanel.signupButton.goTo(loginPanel.allPanel, signupPanel.allPanel, frame);
            clearFields();
        }
        else if (e.getSource() == loginPanel.loginButton.getButton()) {
            String userName = loginPanel.userNameField.getText();
            int password = validator.Hash(loginPanel.passwordField.getText());
            if (validator.exist(userName)) {
                if (password == validator.getUser(userName).getHashPass()) {
                    user = validator.getUser(userName);
                    if (user.getType() == 2) {
                        customerProfilePanel.cashLabel2.setText(String.valueOf(user.getWallet()));
                        customerProfilePanel.nameLabel2.setText(user.getNameLastName());
                        customerProfilePanel.phoneNumLabel2.setText(user.getPhoneNumber());
                        customerProfilePanel.userNameLabel2.setText(user.getUserName());
                        customerProfilePanel.userTypeLabel2.setText(user.getTypeString());
                        loginPanel.loginButton.goTo(loginPanel.allPanel, customerProfilePanel.allPanel, frame);
                        clearFields();
                    }
                    else {
                        sellerProfilePanel.nameLabel2.setText(user.getNameLastName());
                        sellerProfilePanel.phoneNumLabel2.setText(user.getPhoneNumber());
                        sellerProfilePanel.userNameLabel2.setText(user.getUserName());
                        sellerProfilePanel.userTypeLabel2.setText(user.getTypeString());
                        loginPanel.loginButton.goTo(loginPanel.allPanel, sellerProfilePanel.allPanel, frame);
                        clearFields();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "رمز اشتباه است!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "نام کاربری وجود ندارد!");
            }
        }

        // ----- costumer profile panel -----
        else if (e.getSource() == customerProfilePanel.exitButton.getButton()) {
            customerProfilePanel.exitButton.goTo(customerProfilePanel.allPanel, loginPanel.allPanel, frame);
            clearFields();
        } else if (e.getSource() == customerProfilePanel.editProfileButton.getButton()) {
            customerProfilePanel.editProfileButton.goTo(customerProfilePanel.allPanel, editProfilePanel.allPanel, frame);
        }

        // ----- cash increase panel -----
        else if (e.getSource() == cashIncreasePanel.increaseTheCashButton.getButton()) {
            String value = cashIncreasePanel.increaseTheCashField.getText();
            int i;
            for (i = 0; i < value.length(); i++) {
                if (value.charAt(i) < '0' || value.charAt(i) > '9') {
                    JOptionPane.showMessageDialog(null, "مبلغ وارد شده معتبر نیست!");
                    break;
                }
            }
            if (i == value.length()) {
                user.setWallet(user.getWallet() + Integer.parseInt(value));
                customerProfilePanel.cashLabel2.setText(String.valueOf(user.getWallet()));
                JOptionPane.showMessageDialog(null, "موجودی با موفقیت افزایش یافت!");
                cashIncreasePanel.increaseTheCashButton.goTo(cashIncreasePanel.allPanel, customerProfilePanel.allPanel, frame);
                clearFields();
            }
        } else if (e.getSource() == cashIncreasePanel.backButton.getButton()) {
            cashIncreasePanel.backButton.goTo(cashIncreasePanel.allPanel, customerProfilePanel.allPanel, frame);
            clearFields();
        }

        // ----- seller profile panel -----
        else if (e.getSource() == sellerProfilePanel.exitButton.getButton()) {
            sellerProfilePanel.exitButton.goTo(sellerProfilePanel.allPanel, loginPanel.allPanel, frame);
            clearFields();
        } else if (e.getSource() == sellerProfilePanel.editProfileButton.getButton()) {
            sellerProfilePanel.editProfileButton.goTo(sellerProfilePanel.allPanel, editProfilePanel.allPanel, frame);
        } else if (e.getSource() == sellerProfilePanel.productsPanelButton.getButton()) {
            sellerProfilePanel.productsPanelButton.goTo(sellerProfilePanel.allPanel, sellerProductsPanel.allPanels, frame);
        }

        // ----- edit profile panel -----
        else if (e.getSource() == editProfilePanel.editTheProfileButton.getButton()) {
            String name = editProfilePanel.nameField.getText();
            String phoneNumber = editProfilePanel.phoneNumField.getText();
            String userName = editProfilePanel.userNameField.getText();
            String password = editProfilePanel.passwordField.getText();
            if (!name.isEmpty()) {
                if (validator.nameValidation(name)) {
                    user.setNameLastName(name);
                } else {
                    JOptionPane.showMessageDialog(null, "نام و نام خانوادگی معتبر نیست!");
                }
            }
            if (!phoneNumber.isEmpty()) {
                if (validator.validPhoneNumber(phoneNumber)) {
                    user.setPhoneNumber(phoneNumber);
                } else {
                    JOptionPane.showMessageDialog(null, "شماره تلفن معتبر نیست!");
                }
            }
            if (!userName.isEmpty()) {
                if (validator.checkUserName(userName)) {
                    user.setUserName(userName);
                } else {
                    JOptionPane.showMessageDialog(null, "نام کاربری معتبر نیست!");
                }
            }
            if (!password.isEmpty()) {
                if (validator.checkPassword(password)) {
                    user.setHashPass(validator.Hash(password));
                } else {
                    JOptionPane.showMessageDialog(null, "رمز معتبر نیست!");
                }
            }
            if (user.getType() == 2) {
                customerProfilePanel.cashLabel2.setText(String.valueOf(user.getWallet()));
                customerProfilePanel.nameLabel2.setText(user.getNameLastName());
                customerProfilePanel.phoneNumLabel2.setText(user.getPhoneNumber());
                customerProfilePanel.userNameLabel2.setText(user.getUserName());
                customerProfilePanel.userTypeLabel2.setText(user.getTypeString());
                JOptionPane.showMessageDialog(null, "تغییرات با موفقیت اعمال شد!");
                editProfilePanel.editTheProfileButton.goTo(editProfilePanel.allPanel, customerProfilePanel.allPanel, frame);
            } else {
                sellerProfilePanel.nameLabel2.setText(user.getNameLastName());
                sellerProfilePanel.phoneNumLabel2.setText(user.getPhoneNumber());
                sellerProfilePanel.userNameLabel2.setText(user.getUserName());
                sellerProfilePanel.userTypeLabel2.setText(user.getTypeString());
                JOptionPane.showMessageDialog(null, "تغییرات با موفقیت اعمال شد!");
                loginPanel.loginButton.goTo(loginPanel.allPanel, sellerProfilePanel.allPanel, frame);
            }
            clearFields();
        } else if (e.getSource() == editProfilePanel.backButton.getButton()) {
            if (user.getType() == 2)
                 editProfilePanel.backButton.goTo(editProfilePanel.allPanel, customerProfilePanel.allPanel, frame);
            else
                 editProfilePanel.backButton.goTo(editProfilePanel.allPanel, sellerProfilePanel.allPanel, frame);
        }
        
        // ----- products panel -----
        else if (e.getSource() == productsPanel.searchButton.getButton()) {
            String key = productsPanel.searchField.getText();
            ArrayList<Product> source = Product.getProducts();
            ArrayList<Product> result = new ArrayList<>();
            for (int i = 0; i < source.size(); i++)
                if (source.get(i).getName().contains(key))
                    result.add(source.get(i));
            // todo: add results products to main page
        } else if (e.getSource() == productsPanel.sortByMostExpensive) {
            ArrayList<Product> expensive = Product.getProducts();
            Collections.sort(expensive, new MostExpensiveComparator());
            // todo(Fatemeh): add array list to main page
        } else if (e.getSource() == productsPanel.sortByCheapest) {
            ArrayList<Product> cheap = Product.getProducts();
            Collections.sort(cheap, new CheapestComparator());
            // todo(Fatemeh): add array list to main page
        } else if (e.getSource() == productsPanel.sortByMostPopular) {
            ArrayList<Product> popular = Product.getProducts();
            Collections.sort(popular, new MostPopularComparator());
            // todo(Fatemeh): add array list to main page
        }
        // todo (KIANA):
        //  1. show products

        // ----- costumer products panel -----
        else if (e.getSource() == customerProductsPanel.profileButton.getButton()) {
            customerProductsPanel.profileButton.goTo(customerProductsPanel.allPanels, customerProfilePanel.allPanel, frame);
        } else if (e.getSource() == customerProductsPanel.cartButton) {
            customerProductsPanel.cartButton.goTo(customerProductsPanel.allPanels, cartPanel.allPanel, frame);
        }

        // ----- cart panel -----
        else if (e.getSource() == cartPanel.finializeButton.getButton()) {
            boolean inStock = true;
            for (listPanels.productListCard productListCard : cartPanel.productListCards) {
                if (productListCard.getProduct().getStock() < Integer.parseInt(String.valueOf(productListCard.numLabel))) {
                    inStock = false;
                }
            }
            if (user.getWallet() > cartPanel.total && inStock) {
                user.setWallet(user.getWallet() - cartPanel.total);
                sellsAmount += cartPanel.total;
                sellerProductsPanel.salesAmountNumLabel.setText(String.valueOf(sellsAmount));
                for (productListCard productListCard : cartPanel.productListCards) {
                    productListCard.getProduct().setStock(productListCard.getProduct().getStock() - Integer.parseInt(String.valueOf(productListCard.numLabel)));
                }
                customersListPanel.mainPanel.add(new customersListCard(user).cardPanel);
                JOptionPane.showMessageDialog(null, "خرید با موفقیت نهایی شد!");
                cartPanel.mainPanel.removeAll();
            }
        } else if (e.getSource() == cartPanel.backButton.getButton()) {
            cartPanel.backButton.goTo(cartPanel.allPanel, customerProductsPanel.allPanels, frame);
        }

        // ----- seller products panel -----
        else if (e.getSource() == sellerProductsPanel.profileButton.getButton()) {
            sellerProductsPanel.profileButton.goTo(sellerProductsPanel.allPanels, sellerProfilePanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.addProductButton) {
            sellerProductsPanel.addProductButton.goTo(sellerProductsPanel.allPanels, addProductPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.stockButton) {
            sellerProductsPanel.stockButton.goTo(sellerProductsPanel.allPanels, stockPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.costumersListButton) {
            sellerProductsPanel.costumersListButton.goTo(sellerProductsPanel.allPanels, customersListPanel.allPanel, frame);
        }
        
        // ----- costumers list panel -----
        else if (e.getSource() == customersListPanel.backButton.getButton()) {
            customersListPanel.backButton.goTo(customersListPanel.allPanel, sellerProductsPanel.allPanels, frame);
            ArrayList<Customer> customers = Customer.getCustomers();
            // todo (Fatemeh):
            //  1. add object from customers to main panel
        }

        // ----- stock panel -----
        else if (e.getSource() == stockPanel.backButton) {
            stockPanel.backButton.goTo(stockPanel.allPanel, sellerProductsPanel.allPanels, frame);
            // todo (KIANA):
            //  1. add products
        }

        // ----- add product panel -----
        else if (e.getSource() == addProductPanel.addTheProductButton.getButton()) {
            // todo (KIANA):
            //  1. add the product
        } else if (e.getSource() == addProductPanel.backButton.getButton()) {
            addProductPanel.backButton.goTo(addProductPanel.allPanel, sellerProductsPanel.allPanels, frame);
        }

        // ----- edit product panel -----
        else if (e.getSource() == editProductPanel.editTheProductButton.getButton()) {
            // todo (KIANA):
            //  1. edit the product
        } else if (e.getSource() == editProductPanel.backButton.getButton()) {
            editProductPanel.backButton.goTo(editProductPanel.allPanel, sellerProductsPanel.allPanels, frame);
        }


    }
}