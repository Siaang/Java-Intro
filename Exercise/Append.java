// This code uses JOptionPane
import javax.swing.*;

public class Append {
    public static void main(String[] args) {
        JTextArea Area = new JTextArea(3, 5);
        JScrollPane Scroll = new JScrollPane(Area);
        Area.setEditable(false);
        Area.append("Helloooo\n");
        Area.append("Welcome to McDonalds\n");
        Area.append("What would you like to order?");
        JOptionPane.showMessageDialog(null, Scroll, "Text Area", JOptionPane.INFORMATION_MESSAGE);

    }
}
