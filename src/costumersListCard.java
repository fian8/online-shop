import Data.Customer;
import Data.Product;
import Data.User;

import javax.swing.*;
import java.awt.*;

public class costumersListCard {
    JLabel nameLabel;
    JPanel cardPanel;
    public costumersListCard(User user) {

        nameLabel = new JLabel(user.getNameLastName());
//        nameLabel.setBounds();

        cardPanel.add(nameLabel);

        cardPanel.setPreferredSize(new Dimension(780, 30));
    }
}

