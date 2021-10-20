import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassScreen extends JFrame implements ActionListener {
    JPanel classPanel;

    public ClassScreen() {
        classPanel = new JPanel();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        classPanel.setLayout(grid);
        classPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        gbc.fill = GridBagConstraints.HORIZONTAL;

    }

    public JPanel getUI(){
        return classPanel;
    }

    public void actionPerformed(ActionEvent e) {

    }
}
