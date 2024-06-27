import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button implements ActionListener {
    public JButton theButton;
    public JFrame frame;
    public JPanel currentPanel;
    public JPanel goalPanel;
    public button(String text, Color color, JPanel panel) {
        theButton = new JButton(text);
        panel.add(theButton);
        theButton.setBackground(color);
        theButton.setFocusable(false);
    }
    public void goTo(JPanel currentPanel, JPanel goalPanel, JFrame frame) {
        this.currentPanel = currentPanel;
        this.goalPanel = goalPanel;
        this.frame = frame;
        theButton.addActionListener(this);
    }
    public JButton getButton() {
        return this.theButton;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.remove(currentPanel);
        frame.add(goalPanel);
        frame.revalidate();
        frame.repaint();
    }
    // TODO
    //  1. set text color
}
