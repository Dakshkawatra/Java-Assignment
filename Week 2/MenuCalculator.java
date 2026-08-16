import java.util.Scanner;

public class MenuCalculator {

    public static void printMenu() {
        System.out.println("\n1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    public static double calculate(int choice, double a, double b) {
        switch (choice) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = input.nextDouble();

            System.out.print("Enter second number: ");
            double b = input.nextDouble();

            if (choice == 4 && b == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                double result = calculate(choice, a, b);
                System.out.println("Result: " + result);
            }

        } while (choice != 0);

        input.close();
    }
}