//This was a dumb little project i did, i dont remember why i even did this :")
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("enter first number:");
        int num1 = object.nextInt();

        System.out.println("enter second number:");
        int num2 = object.nextInt();

        System.out.println("enter third number:");
        int num3 = object.nextByte();

        System.out.println(num1 * num3);
        int Product = num1 * num3;
        System.out.println("Product: " + Product);
        int Quotient = Product / num2;
        System.out.println("Quotient: " + Quotient);

    }
}
