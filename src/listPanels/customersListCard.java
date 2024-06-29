package listPanels;

import Data.User;

import javax.swing.*;
import java.awt.*;

public class customersListCard {
    JLabel nameLabel;
    public JPanel cardPanel;
    public customersListCard(User user) {

        nameLabel = new JLabel(user.getNameLastName());
//        nameLabel.setBounds();

        cardPanel.add(nameLabel);

        cardPanel.setPreferredSize(new Dimension(780, 30));
    }
}

