package productsPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class costumerProductCard extends productCard implements MouseListener {
    public JButton addToCartButton = new JButton("اضافه به سبد خرید");
    public JButton rateButton = new JButton("امتیاز");
    public costumerProductCard(Product product) {

        super(product);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        nameLabel1.setText("clicked");

        if (e.getSource() == addToCartButton) {
            System.out.println("R");
        } else if (e.getSource() == rateButton) {
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
        addToCartButton.addMouseListener(this);
        rateButton.addMouseListener(this);

        if (e.getSource() == rateButton) {
            mouseLPanel.setBackground(Color.red);
        }
        if (e.getSource() == addToCartButton) {
            mouseLPanel.setBackground(Color.green);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        nameLabel1.setText("exited");

        if (e.getSource() != cardPanel) {
            cardPanel.remove(mouseLPanel);
            addToCartButton.removeMouseListener(this);
            rateButton.removeMouseListener(this);
        }

    }
}
