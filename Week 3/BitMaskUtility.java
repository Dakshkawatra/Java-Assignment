 import java.util.Scanner;

public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    static int setBit(int number, int position) {
        return number | (1 << position);
    }

    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    static String toBinary32(int number) {
        return String.format("%32s", Integer.toBinaryString(number))
                .replace(' ', '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = scanner.nextInt();

        if (position < 0 || position > 31) {
            System.out.println("Invalid bit position.");
            scanner.close();
            return;
        }

        System.out.println("1. Check bit");
        System.out.println("2. Set bit");
        System.out.println("3. Clear bit");
        System.out.println("4. Toggle bit");
        System.out.print("Choose operation: ");
        int operation = scanner.nextInt();

        int result = number;

        System.out.println("\nBefore:");
        System.out.println("Decimal: " + number);
        System.out.println("Binary : " + toBinary32(number));

        switch (operation) {
            case 1:
                System.out.println("\nBit " + position + " is "
                        + (isBitSet(number, position) ? "SET" : "NOT SET"));
                break;

            case 2:
                result = setBit(number, position);
                break;

            case 3:
                result = clearBit(number, position);
                break;

            case 4:
                result = toggleBit(number, position);
                break;

            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        if (operation != 1) {
            System.out.println("\nAfter:");
            System.out.println("Decimal: " + result);
            System.out.println("Binary : " + toBinary32(result));
        }

        scanner.close();
    }
}

