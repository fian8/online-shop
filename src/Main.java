import Comparator.CheapestComparator;
import Comparator.MostExpensiveComparator;
import Comparator.MostPopularComparator;
import Data.*;
import listPanels.*;
import loginSignup.loginPanel;
import loginSignup.signupPanel;
import productDetailsPanels.addProductPanel;
import productDetailsPanels.editProductPanel;
import productsPanels.customerProductsPanel;
import productsPanels.productsPanel;
import productsPanels.sellerProductsPanel;
import profilePanels.cashIncreasePanel;
import profilePanels.customerProfilePanel;
import profilePanels.editProfilePanel;
import profilePanels.sellerProfilePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends JFrame implements ActionListener {

    // --OBJECTS--:
    public static JFrame frame;
    private User user = null;
    private Product product = null;
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
    public Product[] p = new Product[10];


    // ----

    // --DESIGN--:
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public  Font font = new Font("Geeza Pro",  Font.PLAIN, 15);
    Customer admin1 = new Customer("admin", "admin1", validator.Hash("1234"), "09152391705");
    Seller admin2 = new Seller("admin", "admin2", validator.Hash("1234"), "09152391705");


    public Main(){
        frame = new JFrame("online-shop");
        frame.setSize(1080, 720);
        frame.setLayout(null);
        frame.setResizable(false);
        //todo: remove this and product arraylist
        for (int i = 0; i < 10; i++) {
            p[i] = new Product("BED" + i, i * 10000, i);
            p[i].addToProducts();
        }

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


        // ----- costumer products panel -----
        customerProductsPanel = new customerProductsPanel(frame);
        customerProductsPanel.profileButton.getButton().addActionListener(this);
        customerProductsPanel.cartButton.getButton().addActionListener(this);
        customerProductsPanel.searchButton.getButton().addActionListener(this);
        customerProductsPanel.sortByMostExpensive.getButton().addActionListener(this);
        customerProductsPanel.sortByCheapest.getButton().addActionListener(this);
        customerProductsPanel.sortByMostPopular.getButton().addActionListener(this);
        customerProductsPanel.nextPage.addActionListener(this);
        customerProductsPanel.previousPage.addActionListener(this);

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
        sellerProductsPanel.searchButton.getButton().addActionListener(this);
        sellerProductsPanel.sortByMostExpensive.getButton().addActionListener(this);
        sellerProductsPanel.sortByCheapest.getButton().addActionListener(this);
        sellerProductsPanel.sortByMostPopular.getButton().addActionListener(this);
        sellerProductsPanel.nextPage.addActionListener(this);
        sellerProductsPanel.previousPage.addActionListener(this);

        // ----- add product panel -----
        addProductPanel = new addProductPanel(frame);
        addProductPanel.addTheProductButton.getButton().addActionListener(this);
        addProductPanel.chooseImage.getButton().addActionListener(this);
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
        loginPanel.loginButton.goTo(loginPanel.allPanel, frame);
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
        cashIncreasePanel.increaseTheCashField.setText("");
        customerProductsPanel.searchField.setText("");
        sellerProductsPanel.searchField.setText("");
        addProductPanel.nameField.setText("");
        addProductPanel.priceField.setText("");
        addProductPanel.stockField.setText("");
        editProductPanel.nameField.setText("");
        editProductPanel.priceField.setText("");
        editProductPanel.stockField.setText("");
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
                                    signupPanel.signupButton.goTo(loginPanel.allPanel, frame);
                                    clearFields();
                                } else if (signupPanel.costumerRadioButton.isSelected()) {
                                    user = new Customer(nameLastName, userName, hash, phoneNumber);
                                    JOptionPane.showMessageDialog(null, "کاربر عادی با موفقیت ثبت نام شد! \n وارد شوید.");
                                    signupPanel.signupButton.goTo(loginPanel.allPanel, frame);
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
        } else if (e.getSource() == signupPanel.loginButton.getButton()) {
            signupPanel.loginButton.goTo(loginPanel.allPanel, frame);
            clearFields();
        } else if (e.getSource() == loginPanel.signupButton.getButton()) {
            loginPanel.signupButton.goTo(signupPanel.allPanel, frame);
            clearFields();
        } else if (e.getSource() == loginPanel.loginButton.getButton()) {
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
                        loginPanel.loginButton.goTo(customerProfilePanel.allPanel, frame);
                        clearFields();
                    }
                    else {
                        sellerProfilePanel.nameLabel2.setText(user.getNameLastName());
                        sellerProfilePanel.phoneNumLabel2.setText(user.getPhoneNumber());
                        sellerProfilePanel.userNameLabel2.setText(user.getUserName());
                        sellerProfilePanel.userTypeLabel2.setText(user.getTypeString());
                        loginPanel.loginButton.goTo(sellerProfilePanel.allPanel, frame);
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
            customerProfilePanel.exitButton.goTo(loginPanel.allPanel, frame);
        } else if (e.getSource() == customerProfilePanel.editProfileButton.getButton()) {
            customerProfilePanel.editProfileButton.goTo(editProfilePanel.allPanel, frame);
        } else if (e.getSource() == customerProfilePanel.productsPanelButton.getButton()) {
            customerProfilePanel.productsPanelButton.goTo(customerProductsPanel.allPanels, frame);
        } else if (e.getSource() == customerProfilePanel.cashIncreaseButton.getButton()) {
            customerProfilePanel.cashIncreaseButton.goTo(cashIncreasePanel.allPanel, frame);
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
                cashIncreasePanel.increaseTheCashButton.goTo(customerProfilePanel.allPanel, frame);
                clearFields();
            }
        }
        else if (e.getSource() == cashIncreasePanel.backButton.getButton()) {
            cashIncreasePanel.backButton.goTo(customerProfilePanel.allPanel, frame);
            clearFields();
        }

        // ----- seller profile panel -----
        else if (e.getSource() == sellerProfilePanel.exitButton.getButton()) {
            sellerProfilePanel.exitButton.goTo(loginPanel.allPanel, frame);
        } else if (e.getSource() == sellerProfilePanel.editProfileButton.getButton()) {
            editProfilePanel.nameField.setText(user.getNameLastName());
            editProfilePanel.phoneNumField.setText(user.getPhoneNumber());
            editProfilePanel.userNameField.setText(user.getUserName());
            sellerProfilePanel.editProfileButton.goTo(editProfilePanel.allPanel, frame);
        } else if (e.getSource() == sellerProfilePanel.productsPanelButton.getButton()) {
            sellerProfilePanel.productsPanelButton.goTo(sellerProductsPanel.allPanels, frame);
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
                editProfilePanel.editTheProfileButton.goTo(customerProfilePanel.allPanel, frame);
            } else {
                sellerProfilePanel.nameLabel2.setText(user.getNameLastName());
                sellerProfilePanel.phoneNumLabel2.setText(user.getPhoneNumber());
                sellerProfilePanel.userNameLabel2.setText(user.getUserName());
                sellerProfilePanel.userTypeLabel2.setText(user.getTypeString());
                JOptionPane.showMessageDialog(null, "تغییرات با موفقیت اعمال شد!");
                loginPanel.loginButton.goTo(sellerProfilePanel.allPanel, frame);
            }
            clearFields();
        }
        if (e.getSource() == editProfilePanel.backButton.getButton()) {
            if (user.getType() == 2)
                 editProfilePanel.backButton.goTo(customerProfilePanel.allPanel, frame);
            else
                 editProfilePanel.backButton.goTo(sellerProfilePanel.allPanel, frame);
        }

        // ----- costumer products panel -----
         else if (e.getSource() == customerProductsPanel.profileButton.getButton()) {
            customerProductsPanel.profileButton.goTo(customerProfilePanel.allPanel, frame);
        } else if (e.getSource() == customerProductsPanel.cartButton.getButton()) {
            customerProductsPanel.cartButton.goTo(cartPanel.allPanel, frame);
        } else if (e.getSource() == customerProductsPanel.searchButton.getButton()) {
            String key = customerProductsPanel.searchField.getText();
            ArrayList<Product> source = Product.getProducts();
            ArrayList<Product> result = new ArrayList<>();
            for (Product product : source)
                if (product.getName().contains(key))
                    result.add(product);
            customerProductsPanel.page = 1;
            customerProductsPanel.addProductsCardPanel(result);
            clearFields();
        } else if (e.getSource() == customerProductsPanel.sortByMostExpensive) {
            System.out.println("exp");
            ArrayList<Product> expensive = Product.getProducts();
            Collections.sort(expensive, new MostExpensiveComparator());
            customerProductsPanel.page = 1;
            customerProductsPanel.addProductsCardPanel(expensive);
        } else if (e.getSource() == customerProductsPanel.sortByCheapest) {
            System.out.println("chp");
            ArrayList<Product> cheap = Product.getProducts();
            Collections.sort(cheap, new CheapestComparator());
            customerProductsPanel.page = 1;
            customerProductsPanel.addProductsCardPanel(cheap);
        } else if (e.getSource() == customerProductsPanel.sortByMostPopular) {
            System.out.println("pop");
            ArrayList<Product> popular = Product.getProducts();
            Collections.sort(popular, new MostPopularComparator());
            customerProductsPanel.addProductsCardPanel(popular);
        } else if (e.getSource() == customerProductsPanel.previousPage) {
            if (customerProductsPanel.page - 1 <= 0) {
                //todo(Fatemeh): error
                return;
            }
            customerProductsPanel.page -= 1;
            customerProductsPanel.addProductsCardPanel(customerProductsPanel.last);
        } else if (e.getSource() == customerProductsPanel.nextPage) {
            if (customerProductsPanel.page + 1 > Product.getProducts().size()/6 + (Product.getProducts().size()%6>0?1: 0)) {
                 //todo(Fatemeh): error
                 return;
            }
            customerProductsPanel.page += 1;
            customerProductsPanel.addProductsCardPanel(customerProductsPanel.last);
        } else if (e.getSource() == sellerProductsPanel.previousPage) {
            if (sellerProductsPanel.page - 1 <= 0) {
                //todo(Fatemeh): error
                return;
            }
            sellerProductsPanel.page -= 1;
            sellerProductsPanel.addProductsCardPanel(sellerProductsPanel.last);
        } else if (e.getSource() == sellerProductsPanel.nextPage) {
            if (sellerProductsPanel.page + 1 > Product.getProducts().size()/6 + (Product.getProducts().size()%6>0?1: 0)) {
                //todo(Fatemeh): error
                return;
            }
            sellerProductsPanel.page += 1;
            sellerProductsPanel.addProductsCardPanel(sellerProductsPanel.last);
        }
        // ----- cart panel -----
         else if (e.getSource() == cartPanel.finializeButton.getButton()) {
             JOptionPane.showMessageDialog(null, "خرید با موفقیت نهایی شد!");
         }
         else if (e.getSource() == cartPanel.backButton.getButton()) {
             cartPanel.backButton.goTo(customerProductsPanel.allPanels, frame);
         }

        // ----- seller products panel -----
         else if (e.getSource() == sellerProductsPanel.profileButton.getButton()) {
             sellerProductsPanel.profileButton.goTo(sellerProfilePanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.addProductButton.getButton()) {
             sellerProductsPanel.addProductButton.goTo(addProductPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.stockButton.getButton()) {
             sellerProductsPanel.stockButton.goTo(stockPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.costumersListButton.getButton()) {
             sellerProductsPanel.costumersListButton.goTo(customersListPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.searchButton.getButton()) {
            String key = sellerProductsPanel.searchField.getText();
            ArrayList<Product> source = Product.getProducts();
            ArrayList<Product> result = new ArrayList<>();
            for (Product product : source)
                if (product.getName().contains(key))
                    result.add(product);
            sellerProductsPanel.page = 1;
            sellerProductsPanel.addProductsCardPanel(result);
            clearFields();
        } else if (e.getSource() == sellerProductsPanel.sortByMostExpensive) {
            ArrayList<Product> expensive = Product.getProducts();
            Collections.sort(expensive, new MostExpensiveComparator());
            sellerProductsPanel.page = 1;
            sellerProductsPanel.addProductsCardPanel(expensive);
        } else if (e.getSource() == sellerProductsPanel.sortByCheapest) {
            ArrayList<Product> cheap = Product.getProducts();
            Collections.sort(cheap, new CheapestComparator());
            sellerProductsPanel.page = 1;
            sellerProductsPanel.addProductsCardPanel(cheap);
        } else if (e.getSource() == sellerProductsPanel.sortByMostPopular) {
            ArrayList<Product> popular = Product.getProducts();
            Collections.sort(popular, new MostPopularComparator());
            sellerProductsPanel.addProductsCardPanel(popular);
        } else if (e.getSource() == sellerProductsPanel.previousPage) {
            sellerProductsPanel.page -= 1;
            sellerProductsPanel.currentPage.setText(String.valueOf(sellerProductsPanel.page));
            sellerProductsPanel.addProductsCardPanel(sellerProductsPanel.last);
        } else if (e.getSource() == sellerProductsPanel.nextPage) {
            sellerProductsPanel.page += 1;
            sellerProductsPanel.currentPage.setText(String.valueOf(sellerProductsPanel.page));
            sellerProductsPanel.addProductsCardPanel(sellerProductsPanel.last);
        }
        
        // ----- costumers list panel -----
         else if (e.getSource() == customersListPanel.backButton.getButton()) {
            customersListPanel.backButton.goTo(sellerProductsPanel.allPanels, frame);
            ArrayList<Customer> customers = Customer.getCustomers();
            // todo (Fatemeh):
            //  1. add object from customers to main panel
        }

        // ----- stock panel -----
        else if (e.getSource() == stockPanel.backButton.getButton()) {
            stockPanel.backButton.goTo(sellerProductsPanel.allPanels, frame);
            // todo (KIANA):
            //  1. add products
        }

        // ----- add product panel -----
        else if (e.getSource() == addProductPanel.chooseImage.getButton()) {
            // create product
            Validation validator = new Validation();
            String name = addProductPanel.nameField.getText();
            String price = addProductPanel.priceField.getText();
            String stock = addProductPanel.stockField.getText();
            int priceInt = 0, stockInt = 0;

            int i;
            for (i = 0; i < price.length(); i++) {
                if (price.charAt(i) < '0' || price.charAt(i) > '9') {
                    break;
                } else {
                    priceInt += price.charAt(i);
                }
            }
            int j;
            for (j = 0; j < stock.length(); j++) {
                if (stock.charAt(j) < '0' || stock.charAt(j) > '9') {
                    break;
                } else {
                    stockInt += stock.charAt(j);
                }
            }
            if (product == null) {
                if (!(price.isEmpty() || stock.isEmpty() || name.isEmpty())) {
                    if (i == price.length()) {
                        if (j == stock.length()) {
                            if (validator.nameValidation(name)) {
                                product = new Product(name, priceInt, stockInt);
                                product.chooseFileImage();
                                product.addImage();
                            } else {
                                JOptionPane.showMessageDialog(null, "نام محصول معتبر نیست!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "تعداد وارد شده معتبر نیست!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "قیمت وارد شده معتبر نیست!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "همه ی فیلد ها را پر کنید!");
                }
            } else {
                product.chooseFileImage();
                product.addImage();
            }
        } else if (e.getSource() == addProductPanel.addTheProductButton.getButton()) {
        if (product != null && product.getImageLabel().getIcon() != null) {
            Product.addProduct(product);
            if (Product.getProducts().contains(product)) {
                sellerProductsPanel.addProductsCardPanel(sellerProductsPanel.last);
                customerProductsPanel.addProductsCardPanel(customerProductsPanel.last);
                JOptionPane.showMessageDialog(null, "محصول با موفقیت افزوده شد!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "همه ی فیلد ها را پر کنید!\n تصویر انتخاب کنید!");
        }
        System.out.println(Product.getProducts());
        clearFields();
        } else if (e.getSource() == addProductPanel.backButton.getButton()) {
            addProductPanel.backButton.goTo(sellerProductsPanel.allPanels, frame);
            clearFields();
        }

        // ----- edit product panel -----
         else if (e.getSource() == editProductPanel.editTheProductButton.getButton()) {
            // todo (KIANA):
            //  1. edit the product
        }
         else if (e.getSource() == editProductPanel.backButton.getButton()) {
            editProductPanel.backButton.goTo(sellerProductsPanel.allPanels, frame);
        }

    }
}