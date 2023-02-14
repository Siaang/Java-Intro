import java.util.Scanner;

public class Reformina_MidtermExamA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int div, mul, sub, amount, DP; // Amount stands for the amount purchased by the customer, DP stands for the Discounted Price

        System.out.println("Enter amount of purchase: ");
        amount = scn.nextInt();
        DP = ((amount/10)*2-amount)*-1;
        System.out.println("The discounted price for your purchase is " + DP);

    }
}
