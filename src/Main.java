import Data.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main implements ActionListener {
    Validation validator = new Validation();
    public static JFrame frame;

    // OBJECTS:
    public loginPanel loginPanel;
    public signupPanel signupPanel;
    public profilePanel profilePanel;
    public editProfilePanel editProfilePanel;
    public costumerProfilePanel costumerProfilePanel;
    public sellerProfilePanel sellerProfilePanel;
    public cashIncreasePanel cashIncreasePanel;
    public productsPanel productsPanel;
    public costumerProductsPanel costumerProductsPanel;
    public sellerProductsPanel sellerProductsPanel;
    public cartPanel cartPanel;
    public addProductPanel addProductPanel;
    public stockPanel stockPanel;
    public costumersListPanel costumersListPanel;
    public editProductPanel editProductPanel;

    // DESIGN:
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public  Font font = new Font("Geeza Pro",  Font.PLAIN, 15);
    public Main(){
        frame = new JFrame("online-shop");
        frame.setSize(1080, 720);
        frame.setLayout(null);

        // ----- login panel -----
        loginPanel = new loginPanel(frame);
        loginPanel.loginButton.getButton().addActionListener(this);
        loginPanel.signupButton.getButton().addActionListener(this);

        // ----- signup panel -----
        signupPanel = new signupPanel(frame);
        signupPanel.loginButton.getButton().addActionListener(this);
        signupPanel.signupButton.getButton().addActionListener(this);
        
        // ----- profile panel -----
        profilePanel = new profilePanel(frame);
        profilePanel.editProfileButton.getButton().addActionListener(this);
        profilePanel.exitButton.getButton().addActionListener(this);

        // ----- edit profile panel -----
        editProfilePanel = new editProfilePanel(frame);
        editProfilePanel.editTheProfileButton.getButton().addActionListener(this);
        editProfilePanel.backButton.getButton().addActionListener(this);

        // ----- costumer profile panel -----
        costumerProfilePanel = new costumerProfilePanel(frame);
        costumerProfilePanel.productsPanelButton.getButton().addActionListener(this);
        costumerProfilePanel.cashIncreaseButton.getButton().addActionListener(this);

        // ----- seller profile panel -----
        sellerProfilePanel = new sellerProfilePanel(frame);
        sellerProfilePanel.productsPanelButton.getButton().addActionListener(this);

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
        costumerProductsPanel = new costumerProductsPanel(frame);
        costumerProductsPanel.profileButton.getButton().addActionListener(this);
        costumerProductsPanel.cartButton.getButton().addActionListener(this);

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

        // ----- costumers list panel -----
        costumersListPanel = new costumersListPanel(frame);
        costumersListPanel.backButton.getButton().addActionListener(this);

        // ----- add product panel -----
        addProductPanel = new addProductPanel(frame);
        addProductPanel.addTheProductButton.getButton().addActionListener(this);
        addProductPanel.backButton.getButton().addActionListener(this);

        // ----- stock panel -----
        stockPanel = new stockPanel(frame);
        stockPanel.backButton.getButton().addActionListener(this);

        // ----- edit product panel -----
        editProductPanel = new editProductPanel(frame);
        editProductPanel.editTheProductButton.getButton().addActionListener(this);
        editProductPanel.backButton.getButton().addActionListener(this);





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        loginPanel.loginButton.goTo(loginPanel.allPanel, loginPanel.allPanel, frame);
    }

    public static void main(String[] args) {

        Main main = new Main();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        // ----- login & signup buttons process -----
        if (e.getSource() == loginPanel.loginButton.getButton()){

            //Validating
            String userName = loginPanel.userNameField.getText();
            int password = validator.Hash(loginPanel.passwordField.getText());
            if (validator.exist(userName)) {
                if (password == validator.getUser(userName).getHashPass()) {
                    if (loginPanel.costumerRadioButton.isSelected() && validator.getUser(userName).getType() == 2)
                         loginPanel.loginButton.goTo(loginPanel.allPanel, costumerProfilePanel.allPanel, frame);
                    else if (loginPanel.sellerRadioButton.isSelected() && validator.getUser(userName).getType() == 1)
                         loginPanel.loginButton.goTo(loginPanel.allPanel, sellerProfilePanel.allPanel, frame);
                    else {
                        JOptionPane.showMessageDialog(null, "نوع کاربر را انتخاب کنید!");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "رمز اشتباه است!");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "نام کاربری اشتباه است!");
            }

        } else if (e.getSource() == loginPanel.signupButton.getButton()) {
            loginPanel.signupButton.goTo(loginPanel.allPanel, signupPanel.allPanel, frame);
        }
        else if (e.getSource() == signupPanel.signupButton.getButton()) {
            String name = signupPanel.nameField.getText();
            String phoneNumber = signupPanel.phoneNumField.getText();
            String userName = signupPanel.userNameField.getText();
            String password = signupPanel.passwordField.getText();
            int hash = validator.Hash(password);
            Seller seller;
            Customer customer;
            if (validator.nameValidation(name)) {
                if (!validator.exist(userName)) {
                    if (validator.checkUserName(userName)) {
                        if (validator.validPhoneNumber(phoneNumber)) {
                            if (validator.checkPassword(password)) {
                                if (signupPanel.sellerRadioButton.isSelected()) {
                                    seller = new Seller(name, userName, hash, phoneNumber);
                                    JOptionPane.showMessageDialog(null, "فروشنده با موفقیت ثبت نام شد! \n وارد شوید.");
                                    signupPanel.signupButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
                                } else if (signupPanel.costumerRadioButton.isSelected()) {
                                    customer = new Customer(name, userName, hash, phoneNumber);
                                    JOptionPane.showMessageDialog(null, "کاربر عادی با موفقیت ثبت نام شد! \n وارد شوید.");
                                    signupPanel.signupButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
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
            signupPanel.loginButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
        }

        // ----- profile panel -----
        else if (e.getSource() == profilePanel.editProfileButton.getButton()) {
            profilePanel.editProfileButton.goTo(profilePanel.allPanel, editProfilePanel.allPanel, frame);
        } else if (e.getSource() == profilePanel.exitButton.getButton()) {
            // todo (KIANA):
            //  1. exit
        }

        // ----- edit profile panel -----
        else if (e.getSource() == editProfilePanel.editTheProfileButton.getButton()) {
            // todo (KIANA):
            //  1. edit the profile
        } else if (e.getSource() == editProfilePanel.backButton.getButton()) {
            // todo (KIANA):
            //  2. if costumer:
            editProfilePanel.backButton.goTo(editProfilePanel.allPanel, costumerProfilePanel.allPanel, frame);
            // todo (KIANA):
            //  3. if seller:
            editProfilePanel.backButton.goTo(editProfilePanel.allPanel, sellerProfilePanel.allPanel, frame);
        }

        // ----- costumer profile panel -----
        else if (e.getSource() == costumerProfilePanel.productsPanelButton.getButton()) {
            costumerProfilePanel.productsPanelButton.goTo(costumerProfilePanel.allPanel, costumerProductsPanel.allPanels, frame);
        } else if (e.getSource() == costumerProfilePanel.cashIncreaseButton.getButton()) {
            costumerProfilePanel.cashIncreaseButton.goTo(costumerProfilePanel.allPanel, cashIncreasePanel.allPanel, frame);
        }

        // ----- cash increase panel -----
        else if (e.getSource() == cashIncreasePanel.increaseTheCashButton.getButton()) {
            // todo (KIANA):
            //  1. increase the cash
        } else if (e.getSource() == cashIncreasePanel.backButton.getButton()) {
            cashIncreasePanel.backButton.goTo(cashIncreasePanel.allPanel, costumerProfilePanel.allPanel, frame);
        }

        // ----- seller profile panel -----
        else if (e.getSource() == sellerProfilePanel.productsPanelButton.getButton()) {
            sellerProfilePanel.productsPanelButton.goTo(sellerProfilePanel.allPanel, sellerProductsPanel.allPanels, frame);
        }
        
        // ----- products panel -----
        else if (e.getSource() == productsPanel.searchButton.getButton()) {
            // todo (KIANA):
            //  1. search
        } else if (e.getSource() == productsPanel.sortByMostExpensive) {
            // todo (KIANA):
            //  1. sort by most expensive
        } else if (e.getSource() == productsPanel.sortByCheapest) {
            // todo (KIANA):
            //  1. sort by cheapest
        } else if (e.getSource() == productsPanel.sortByMostPopular) {
            // todo (KIANA):
            //  1. sort by most popular
        }

        // ----- costumer products panel -----
        else if (e.getSource() == costumerProductsPanel.profileButton.getButton()) {
            costumerProductsPanel.profileButton.goTo(costumerProductsPanel.allPanels, costumerProfilePanel.allPanel, frame);
        } else if (e.getSource() == costumerProductsPanel.cartButton) {
            costumerProductsPanel.cartButton.goTo(costumerProductsPanel.allPanels, cartPanel.allPanel, frame);
        }

        // ----- cart panel -----
        else if (e.getSource() == cartPanel.finializeButton.getButton()) {
            // todo (KIANA):
            //  1. finalize
        } else if (e.getSource() == cartPanel.backButton.getButton()) {
            cartPanel.backButton.goTo(cartPanel.allPanel, costumerProductsPanel.allPanels, frame);
        }

        // ----- seller products panel -----
        else if (e.getSource() == sellerProductsPanel.profileButton.getButton()) {
            sellerProductsPanel.profileButton.goTo(sellerProductsPanel.allPanels, sellerProfilePanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.addProductButton) {
            sellerProductsPanel.addProductButton.goTo(sellerProductsPanel.allPanels, addProductPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.stockButton) {
            sellerProductsPanel.stockButton.goTo(sellerProductsPanel.allPanels, stockPanel.allPanel, frame);
        } else if (e.getSource() == sellerProductsPanel.costumersListButton) {
            sellerProductsPanel.costumersListButton.goTo(sellerProductsPanel.allPanels, costumersListPanel.allPanel, frame);
        }
        
        // ----- costumers list panel -----
        else if (e.getSource() == costumersListPanel.backButton.getButton()) {
            costumersListPanel.backButton.goTo(costumersListPanel.allPanel, sellerProductsPanel.allPanels, frame);
        }

        // ----- add product panel -----
        else if (e.getSource() == addProductPanel.addTheProductButton.getButton()) {
            // todo (KIANA):
            //  1. add the product
        } else if (e.getSource() == addProductPanel.backButton.getButton()) {
            addProductPanel.backButton.goTo(addProductPanel.allPanel, sellerProductsPanel.allPanels, frame);
        }

        // ----- stock panel -----
        else if (e.getSource() == stockPanel.backButton) {
            stockPanel.backButton.goTo(stockPanel.allPanel, sellerProductsPanel.allPanels, frame);
        }

        // ----- edit product panel -----
        else if (e.getSource() == editProductPanel.editTheProductButton.getButton()) {
            // todo (KIANA):
            //  1. edit the product
        } else if (e.getSource() == editProductPanel.backButton.getButton()) {
            editProductPanel.backButton.goTo(editProductPanel.allPanel, sellerProductsPanel.allPanels, frame);
        }


    }

    // todo (FATEME):
    //  1. frame: scrollable
    //  2. frame: fixed size or responsive.
}