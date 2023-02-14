// This code uses JOptionPane
 import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class IfElse {
    public static void main(String[] args) {
        String inputUSN, dfltUSN = "sia", inputPSWD,dfltPSW = "12345";

        JDialog.setDefaultLookAndFeelDecorated(true);
        inputUSN = JOptionPane.showInputDialog(null, "Please input your name", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        if (!inputUSN.equals(dfltUSN)) {
            JOptionPane.showMessageDialog(null,"Incorrect Username", "Try a different one", JOptionPane.WARNING_MESSAGE); }

        else {
            inputPSWD = JOptionPane.showInputDialog(null, "Enter password pls", "Password", JOptionPane.INFORMATION_MESSAGE);
            if (!inputPSWD.equals(dfltPSW)) {
                JOptionPane.showMessageDialog(null, "Incorrect Password", "Try a different one", JOptionPane.WARNING_MESSAGE); }

            else {
                JOptionPane.showMessageDialog(null, "Hello", "Nice to see you again", JOptionPane.INFORMATION_MESSAGE); }
        }
    }
}

