import javax.swing.*;

public class Program {
    static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        loadNewPanel(new LoginScreen().getUI());
    }

    public static void loadClassPanel() {
        loadNewPanel(new ClassScreen().getUI());
    }

    public static void loadNewPanel(JPanel panel) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
