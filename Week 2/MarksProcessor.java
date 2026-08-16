import java.util.Scanner;

public class MarksProcessor {

    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public static double calculateAverage(int sum, int count) {
        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }

    public static void printResults(int count, int sum, double average,
                                    int highest, int passes, int failures) {

        System.out.println("\n--- Results ---");
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark;
        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        do {
            System.out.print("Enter mark (-1 to stop): ");
            mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark. Enter a value from 0 to 100.");
                continue;
            }

            count++;
            sum += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark >= 50) {
                passes++;
            } else {
                failures++;
            }

        } while (mark != -1);

        double average = calculateAverage(sum, count);

        printResults(count, sum, average, highest, passes, failures);

        input.close();
    }
}
