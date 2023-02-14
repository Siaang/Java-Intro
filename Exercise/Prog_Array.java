import javax.swing.*;

public class Prog_Array {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Enter three Elements: ");
        int[] input = new int[3];
        input[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Value for Array[0]."));
        input[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Value for Array[1]."));
        input[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Value for Array[2]."));

        JTextArea area = new JTextArea();
        area.setEditable(false);

        for (int v=0; v<input.length;v++) {
            area.append(input[v]+ "\n");
        }
        JOptionPane.showMessageDialog(null,area,"Inputted Element", JOptionPane.INFORMATION_MESSAGE);
    }
}
