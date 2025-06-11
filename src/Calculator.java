import java.util.Scanner;

public class Calculator {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first number:");
        int num1 = scanner.nextInt();

        System.out.println("Insert second number:");
        int num2 = scanner.nextInt();

        System.out.println("Result is: " + (num1 + num2));
    }
}