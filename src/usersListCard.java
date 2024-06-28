import javax.swing.*;
import java.awt.*;

public class usersListCard {
    JLabel nameLabel;
    JPanel cardPanel;
    public usersListCard(String name) {

        nameLabel = new JLabel(name);

        cardPanel.add(nameLabel);

        cardPanel.setPreferredSize(new Dimension(780, 30));
    }
}
