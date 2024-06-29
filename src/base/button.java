package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button {
    public JButton theButton;
    public JFrame frame;
    public button(String text, Color color, JPanel panel) {
        theButton = new JButton(text);
        panel.add(theButton);
        theButton.setBackground(color);
        theButton.setFocusable(false);
    }
    public void goTo(JPanel currentPanel, JPanel goalPanel, JFrame frame) {
        frame.getContentPane(). removeAll();
        frame.add(goalPanel);
        frame.revalidate();
        frame.repaint();
    }
    public JButton getButton() {
        return this.theButton;
    }
    // TODO
    //  1. set text color
}
