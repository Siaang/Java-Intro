import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        String inputUSN, inputPSW;
        Scanner userInput = new Scanner(System.in);

        //Default username and password.
        String defaultUSN = "sia";
        String defaultPSW = "12345678";

        System.out.println("Enter username here plss");
        inputUSN = userInput.nextLine();
        while (!inputUSN.equals(defaultUSN)) {
            System.out.println("Try again");
            inputUSN = userInput.nextLine();
        }
        System.out.println("Congratulations");

        System.out.println("Enter password here plss");
        inputPSW = userInput.nextLine();
        while (!inputPSW.equals(defaultPSW)) {
            System.out.println("Try again");
            inputPSW = userInput.nextLine();
        }
        System.out.println("Welcome");
    }
}