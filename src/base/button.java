package base;

import javax.swing.*;
import java.awt.*;


public class button {
    private JButton theButton;
    public JFrame frame;
    public button(String text, Color color, JPanel panel) {
        theButton = new JButton(text);
        panel.add(theButton);
        theButton.setBackground(color);
        theButton.setFocusable(false);
    }
    public void goTo(JPanel goalPanel, JFrame frame) {
        frame.getContentPane(). removeAll();
        frame.add(goalPanel);
        frame.revalidate();
        frame.repaint();
    }
    public JButton getButton() {
        return this.theButton;
    }
    public void setButton(JButton theButton) {
        this.theButton = theButton;
    }

    // TODO
    //  1. set text color

}
