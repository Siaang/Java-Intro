// This code uses JOptionPane
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Switch {
    public static void main(String[] args) {
        JTextArea Select = new JTextArea(6, 9);
        String choice;
        int n1;

        JDialog.setDefaultLookAndFeelDecorated(true);
        JOptionPane.showMessageDialog(null, "Please choose from the following selection to be shown after this message ", "Choices, choices", JOptionPane.INFORMATION_MESSAGE);

        Select.setEditable(false);
        Select.append("Press the options that applies to you \n");
        Select.append("1 - I want fries \n");
        Select.append("2 - I want burger and fries \n");
        Select.append("3 - I want burger, fries, and a drink \n");
        Select.append("4 - I want an ice cream \n");
        JOptionPane.showMessageDialog(null, Select, "Choose wisely", JOptionPane.WARNING_MESSAGE);
        choice = JOptionPane.showInputDialog(null, "Please input the number corresponding to your choice", "Choices,choices", JOptionPane.INFORMATION_MESSAGE);
        n1 = Integer.parseInt(choice);

        switch (n1) {
            case 1 :
                JOptionPane.showMessageDialog(null, "That will cost you $3", "Payment", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2 :
                JOptionPane.showMessageDialog(null, "That will cost you $5", "Payment", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3 :
                JOptionPane.showMessageDialog(null, "That will cost you $7", "Payment", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4 :
                JOptionPane.showMessageDialog(null, "That will cost $2", "Payment", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}



