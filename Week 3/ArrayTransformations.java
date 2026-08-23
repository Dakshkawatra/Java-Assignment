import java.util.Arrays;

public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        int left = 0, right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++)
            result[i] = values[values.length - 1 - i];

        return result;
    }

    static int removeValue(int[] values, int target) {
        int j = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[j] = values[i];
                j++;
            }
        }

        return j;
    }

    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        reverseInPlace(a);
        System.out.println("Reverse: " + Arrays.toString(a));

        int[] b = {1, 2, 3, 4};
        System.out.println("Copy: "
                + Arrays.toString(reversedCopy(b)));

        int[] c = {1, 2, 3, 2, 4, 2};
        int length = removeValue(c, 2);

        System.out.print("After remove: ");
        for (int i = 0; i < length; i++)
            System.out.print(c[i] + " ");

        int[] d = {1, 2, 3, 4};
        System.out.println("\nRunning sum: "
                + Arrays.toString(runningSum(d)));
    }
} 