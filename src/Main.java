import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String input = "";

        terminal: while (!input.equalsIgnoreCase("salir")) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear NASA");
            System.out.println("3. Salir.");

            input = scanner.next();

            if (input.equals("1")) {
                calc.run();
            } else if (input.equals("2")) {
                String character = "";
                for (int i = 0; i <= 5; i++) {
                    character += "#";
                    System.out.println(character);
                }
                System.out.println("NASA hackeada exitosamente.");
            } else if (input.equals("3")) {
                System.out.println("Ha salido exitosamente");
                break terminal;
            }

        }
    }
}
