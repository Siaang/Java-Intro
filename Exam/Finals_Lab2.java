import java.util.Scanner;

public class Finals_Lab2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("How many?");
        int input = scn.nextInt();
        int i = input;

        do {
            int length = i;
            do {
                System.out.print(length);
                length--;
            } while (length>=1);
            System.out.println("");
            i--;
        } while (i>=1);
    }
}
