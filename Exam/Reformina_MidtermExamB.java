import java.util.Scanner;
import javax.swing.*;
import java.lang.Integer;

public class Reformina_MidtermExamB {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        JTextArea Area = new JTextArea(3,5);
        Area.setEditable(false);
        JDialog.setDefaultLookAndFeelDecorated(true);
        String n1;
        int P, DP;

        JOptionPane.showMessageDialog(null,"Our Department Store offers a 20% discount in all of our products","Welcome", JOptionPane.INFORMATION_MESSAGE);
        n1 = JOptionPane.showInputDialog(null,"Please enter the amount of your purchase","Purchase", JOptionPane.INFORMATION_MESSAGE);
        P = Integer.parseInt(n1);
        DP = ((P/10)*2-P)*-1;
        JOptionPane.showMessageDialog(null,"The discounted price of your purchase is: " + DP,"Payment", JOptionPane.INFORMATION_MESSAGE );
    }
}
