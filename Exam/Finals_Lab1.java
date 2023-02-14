import java.util.Scanner;

public class Finals_Lab1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number here");
        int input = scn.nextInt();

        for (int length=input;length>0;length--) {
            for (int width=1;width<=length;width++) {
                System.out.print(width);
            }
            System.out.println();
        }
    }
}

