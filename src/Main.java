import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public static JFrame frame;
    public loginPanel myLoginPanel;
    public signupPanel mySignupPanel;
    public  Color primaryColor = Color.decode("#FF841F"), secondaryColor = Color.gray;
    public  Font font = new Font("Geeza Pro",  Font.PLAIN, 15);
    public Main(){
        frame = new JFrame("online-shop");
        frame.setSize(1080, 720);
        frame.setLayout(null);

        myLoginPanel = new loginPanel(frame);
        mySignupPanel = new signupPanel(frame);
        myLoginPanel.signupButton.getButton().addActionListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Main main = new Main();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == myLoginPanel.loginButton.getButton()){
            // todo (KIANA):
            //  1. validation
            //  2. if userType == user
//            loginPanel.loginButton.goTo(loginPanel.allPanel, userProfilePanel.allPanel, frame);
            // todo (KIANA):
            //  3. if userType == seller
//            loginPanel.loginButton.goTo(loginPanel.allPanel, sellerProfilePanel.allPanel, frame);
        } else if (e.getSource() == myLoginPanel.signupButton.getButton()) {
            myLoginPanel.signupButton.goTo(myLoginPanel.allPanel, mySignupPanel.allPanel, frame);
        }
//        else if (e.getSource() == signupPanel.signupButton.getButton()) {
//            // todo (KIANA):
//            //  1. validation
//        } else if (e.getSource() == signupPanel.loginButton.getButton()) {
//            signupPanel.loginButton.goTo(signupPanel.allPanel, loginPanel.allPanel, frame);
//        }
    }

    // todo (FATEME):
    //  1. frame: scrollable
    //  2. frame: fixed size or responsive.
}