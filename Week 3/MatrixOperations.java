import java.util.Arrays;

public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                result[i] += matrix[i][j];

        return result;
    }

    static int[] columnSums(int[][] matrix) {
        if (matrix.length == 0) return new int[0];

        int[] result = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                result[j] += matrix[i][j];

        return result;
    }

    static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length)
            throw new IllegalArgumentException("Different dimensions");

        for (int i = 0; i < first.length; i++)
            if (first[i].length != second[i].length)
                throw new IllegalArgumentException("Different dimensions");

        int[][] result = new int[first.length][];

        for (int i = 0; i < first.length; i++) {
            result[i] = new int[first[i].length];

            for (int j = 0; j < first[i].length; j++)
                result[i][j] = first[i][j] + second[i][j];
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) return new int[0][0];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {

        if (first.length == 0 || second.length == 0)
            throw new IllegalArgumentException("Empty matrix");

        if (first[0].length != second.length)
            throw new IllegalArgumentException("Cannot multiply");

        int[][] result =
                new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++)
            for (int j = 0; j < second[0].length; j++)
                for (int k = 0; k < second.length; k++)
                    result[i][j] += first[i][k] * second[k][j];

        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Row sums: "
                + Arrays.toString(rowSums(a)));

        System.out.println("Column sums: "
                + Arrays.toString(columnSums(a)));

        System.out.println("Transpose:");
        printMatrix(transpose(a));

        int[][] b = {
            {1, 2},
            {3, 4}
        };

        int[][] c = {
            {5, 6},
            {7, 8}
        };

        System.out.println("Addition:");
        printMatrix(add(b, c));

        System.out.println("Multiplication:");
        printMatrix(multiply(a, new int[][] {
            {1, 2},
            {3, 4},
            {5, 6}
        }));
    }
}