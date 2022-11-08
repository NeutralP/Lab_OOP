package Lab01;

public class AddMatrix {
    public static void main(String[] args) {
        int rowSize = 4, columnSize = 5;

        int[][] A = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 },
                { 5, 5, 5, 5 }};
        // Print the matrices A
        System.out.println("\nMatrix A:");
        printMatrix(A, rowSize, columnSize);

        int[][] B = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 },
                { 5, 5, 5, 5 }};
        // Print the matrices B
        System.out.println("\nMatrix B:");
        printMatrix(B, rowSize, columnSize);

        // Add the two matrices
        int[][] C = add(A, B, rowSize, columnSize);

        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, rowSize, columnSize);
    }

    // Function to print Matrix
    static void printMatrix(int[][] M, int rowSize, int colSize)
    {
        for (int i = 0; i < colSize; i++) {
            for (int j = 0; j < rowSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    // Function to add the two matrices
    // and store in matrix C
    static int[][] add(int[][] A, int[][] B, int rowSize, int colSize)
    {
        int i, j;
        int[][] C = new int[colSize][rowSize];

        for (i = 0; i < colSize; i++)
            for (j = 0; j < rowSize; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }
}
