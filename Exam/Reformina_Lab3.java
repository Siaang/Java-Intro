import java.util.Scanner;
import javax.swing.*;


public class Reformina_Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1, n2, n3;
        int OP, MUP, STR; // OP(Original Price), MUP(Mark-up price), STR(Sales Tax Rate),SP(Selling Price),ST(Sales Tax),FP(Final Price)

        JDialog.setDefaultLookAndFeelDecorated(true);
        n1 = JOptionPane.showInputDialog(null, "Original Price: ");
        OP = Integer.parseInt(n1);
        n2 = JOptionPane.showInputDialog(null, "Mark up (%): ");
        MUP = Integer.parseInt(n2);
        n3 = JOptionPane.showInputDialog(null, "Sales Tax Rate (%): ");
        STR = Integer.parseInt(n3);

        int SP = (MUP*10)+OP;
        int ST = SP/STR;
        int FP = SP+ST;

        JTextArea Receipt = new JTextArea(6,10);
        Receipt.setEditable(false);
        Receipt.append("Orignal Price"          + ": $" + OP + "\n");
        Receipt.append("Mark-up (%)"          + ": " + MUP + "\n");
        Receipt.append("Sales Tax Rate (%)"          + ": " + STR + "\n");
        Receipt.append("================================" + "\n");
        Receipt.append("Orignal Price"          + ": $" + OP + "\n");
        Receipt.append("Mark-up (%)"          + ": " + MUP + "%" + "\n");
        Receipt.append("Selling Price"          + ": $" + SP + "\n");
        Receipt.append("Sales Tax Rate (%)"          + ": " + STR + "%" + "\n");
        Receipt.append("Sales Tax"          + ": $" + ST + "\n");
        Receipt.append("Final Price"          + ": $" + FP + "\n");
        JOptionPane.showMessageDialog(null, Receipt,"Item Price", JOptionPane.INFORMATION_MESSAGE);
    }
}
