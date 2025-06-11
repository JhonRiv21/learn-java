import java.util.Scanner;

public class ParOrImpair {
    public static void parOrImpair(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verify you number\n");

        System.out.println("Insert a number");
        int number = scanner.nextInt();
        String message = number % 2 == 0 ? "Your number is par" : "Your number is impair";

        if (number % 3 == 0 && number % 4 == 0) {
            message += " and divisible for 3 and 4";
        } else if (number % 3 == 0) {
            message += " and divisible for 3";
        } else if (number % 4 == 0) {
            message += " and divisible for 4";
        }

        System.out.println(message);
    }
}
