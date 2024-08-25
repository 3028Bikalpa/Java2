public class DotProduct {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {4, 5, 12},
            {7, 2, 1}
        };
        int[][] matrix2 = {
            {3, 6},
            {9, 12},
            {2, 4}
        };
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (cols1 != rows2) {
            System.out.println("Error: The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("First row of the result matrix:");
        for (int i = 0; i < cols2; i++) {
            System.out.print(result[0][i] + " ");
        }
        System.out.println("\nLast row of the result matrix:");
        for (int i = 0; i < cols2; i++) {
            System.out.print(result[rows1 - 1][i] + " ");
        }
    }
}