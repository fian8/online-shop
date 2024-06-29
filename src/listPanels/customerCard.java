package listPanels;

import Data.User;

import javax.swing.*;
import java.awt.*;

public class customerCard {
    JLabel nameLabel;
    public JPanel cardPanel = new JPanel();
    public customerCard(User user) {

        nameLabel = new JLabel(user.getNameLastName());
//        nameLabel.setBounds();

        cardPanel.add(nameLabel);

        cardPanel.setPreferredSize(new Dimension(780, 30));
    }
}

