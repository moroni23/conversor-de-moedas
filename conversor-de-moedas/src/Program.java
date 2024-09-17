import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = scanner.nextInt();

            if (option >= 1 && option <= 6) {
                double amount = 0;
                boolean validInput = false;

                while (!validInput) {
                    try {
                        System.out.print("Digite o valor a ser convertido: ");
                        amount = scanner.nextDouble();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido. Por favor, digite um número.");
                        scanner.next(); // Limpa o scanner
                    }
                }

                CurrencyConverter converter = CurrencyConverterFactory.getConverter(option);
                converter.convert(amount);
            } else if (option != 7) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 7);

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    private static void printMenu() {
        String border = "*".repeat(60);
        System.out.println(border);
        System.out.println("Escolha a opção que deseja converter:");
        System.out.println();
        System.out.println("1 - Real Brasileiro para Dólar");
        System.out.println("2 - Dólar para Real Brasileiro");
        System.out.println("3 - Euro para Real Brasileiro");
        System.out.println("4 - Real Brasileiro para Euro");
        System.out.println("5 - Libra Esterlina para Real Brasileiro");
        System.out.println("6 - Real Brasileiro para Libra Esterlina");
        System.out.println("7 - Sair");
        System.out.println(border);
        System.out.print("Digite a opção desejada: ");
    }
}