import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginScreen extends JFrame implements ActionListener {
    JPanel loginPanel;
    JTextField userCodeTF;
    JButton submitButton;

    long[] userCodes = new long[]{12129};

    public LoginScreen() {
        loginPanel = new JPanel();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        loginPanel.setLayout(grid);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(35, 35, 35, 35));
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userCodeLbl = new JLabel("Enter user code:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(userCodeLbl, gbc);

        userCodeTF = new JTextField();
        gbc.gridy = 1;
        loginPanel.add(userCodeTF, gbc);

        submitButton = new JButton("Login");
        submitButton.addActionListener(this);
        gbc.gridy = 2;
        loginPanel.add(submitButton, gbc);
    }

    public JPanel getUI(){
        return loginPanel;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Login")) {
            for (long code : userCodes) {
                if(code == Long.parseLong(userCodeTF.getText())) {
                    Program.loadClassPanel();
                    System.out.println("User logged in successfully with code " + userCodeTF.getText());
                }
            }
        }
    }
}
