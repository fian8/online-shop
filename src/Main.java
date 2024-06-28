import Data.User;

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
    public userProfilePanel userProfilePanel;
    public sellerProfilePanel sellerProfilePanel;

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

        // ----- user profile panel -----
        userProfilePanel = new userProfilePanel(frame);

        // ----- seller profile panel -----
        sellerProfilePanel = new sellerProfilePanel(frame);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Main main = new Main();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginPanel.loginButton.getButton()){
            // todo (KIANA):
            //  1. validation
            //  2. if userType == user
            loginPanel.loginButton.goTo(loginPanel.allPanel, userProfilePanel.allPanel, frame);
            // todo (KIANA):
            //  3. if userType == seller
            loginPanel.loginButton.goTo(loginPanel.allPanel, sellerProfilePanel.allPanel, frame);
        } else if (e.getSource() == loginPanel.signupButton.getButton()) {
            loginPanel.signupButton.goTo(loginPanel.allPanel, signupPanel.allPanel, frame);
        }
        else if (e.getSource() == signupPanel.signupButton.getButton()) {
            // todo (KIANA):
            //  1. validation
        } else if (e.getSource() == signupPanel.loginButton.getButton()) {
            signupPanel.loginButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
        }
    }

    // todo (FATEME):
    //  1. frame: scrollable
    //  2. frame: fixed size or responsive.
}