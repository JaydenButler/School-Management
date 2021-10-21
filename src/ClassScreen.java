import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassScreen extends JFrame implements ActionListener {
    JPanel classPanel;
    JButton newButton;

    JTable dataTable;
    JScrollPane scrollPane;

    public ClassScreen() {
        classPanel = new JPanel();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        classPanel.setLayout(grid);
        classPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        gbc.fill = GridBagConstraints.HORIZONTAL;

        newButton = new JButton("+");
        gbc.gridx = 0;
        gbc.gridy = 0;
        classPanel.add(newButton, gbc);

        String[] column = {"ID", "FIRST NAME", "SECOND NAME", "AGE"};

        String[][] data = {{"100", "Jayden", "Butler", "18"},
                {"101", "Timothy", "Bond", "16"},
                {"102", "Ben", "O'Conner", "95"}};

        dataTable = new JTable(data, column);
        scrollPane = new JScrollPane(dataTable);

        gbc.gridy = 1;
        gbc.gridwidth = 4;

        classPanel.add(scrollPane, gbc);
    }

    public JPanel getUI(){
        return classPanel;
    }

    public void actionPerformed(ActionEvent e) {

    }
}
