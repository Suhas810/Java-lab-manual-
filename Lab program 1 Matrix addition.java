import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the order of the matrix (N)
        System.out.print("Enter the order N of the matrices (NxN): ");
        int N = scanner.nextInt();

        // Step 2: Declare matrices
        int[][] matrixA = new int[N][N];
        int[][] matrixB = new int[N][N];
        int[][] sum = new int[N][N];

        // Step 3: Input matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Input matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Step 5: Calculate sum
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Step 6: Display result
        System.out.println("Sum of Matrix A and Matrix B:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
