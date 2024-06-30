package productsPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class sellerProductCard extends productCard  implements MouseListener {
    public JButton editProductButton = new JButton("ویرایش محصول");
    public JButton removeProductButton = new JButton("حذف محصول");

    public sellerProductCard(Product product) {

        super(product);

        // mouseListener
        cardPanel.addMouseListener(this);
        mouseLPanel.setLayout(new GridLayout(2, 1, 0, 10));
        mouseLPanel.add(editProductButton);
        mouseLPanel.add(removeProductButton);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        nameLabel1.setText("clicked");

        if (e.getSource() == removeProductButton) {
            System.out.println("R");
        } else if (e.getSource() == editProductButton) {
            System.out.println("E");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        nameLabel1.setText("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        nameLabel1.setText("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        nameLabel1.setText("entered");
        mouseLPanel.setBackground(Color.blue);

        cardPanel.add(mouseLPanel);
        removeProductButton.addMouseListener(this);
        editProductButton.addMouseListener(this);

        if (e.getSource() == editProductButton) {
            mouseLPanel.setBackground(Color.red);
        }
        if (e.getSource() == removeProductButton) {
            mouseLPanel.setBackground(Color.green);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        nameLabel1.setText("exited");

        if (e.getSource() != cardPanel) {
            cardPanel.remove(mouseLPanel);
            removeProductButton.removeMouseListener(this);
            editProductButton.removeMouseListener(this);
        }

    }
}
