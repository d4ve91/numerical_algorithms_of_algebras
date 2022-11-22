
// Gaussian Elimination Method 
import java.io.IOException;

public class Gauss {

    public static void main(String[] args) throws IOException {

        // board size
        int n = 3;

        // matrix to solve
        double matrix[][] = { { 3, 1, 0 },
                { 1, 2, -1 },
                { 0, -1, 3 } };

        // result matrix
        double resultMatrix[][] = new double[matrix.length][matrix.length];
        
        // copy the matrix to be solved to the result matrix
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                resultMatrix[i][j] = matrix[i][j];

        // vector in results
        double result[] = { -3, 0, 0 };

        // copy vector
        double copyVector[] = new double[result.length];
        for (int i = 0; i < result.length; i++) {
            copyVector[i] = result[i];
        }

        // display the matrix to be solved
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(matrix[j][k] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        // Gaussian Elimination Method

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = 0; k < n; k++) {
                    matrix[j][k] = matrix[j][k] - (matrix[i][k] * (matrix[j][i] / matrix[i][i]));
                }

                copyVector[j] = result[j] - (result[i] * (matrix[j][i] / matrix[i][i]));

                for (int ii = 0; ii < resultMatrix.length; ii++) {
                    for (int jj = 0; jj < resultMatrix.length; jj++) {
                        matrix[ii][jj] = resultMatrix[ii][jj];
                    }
                    result[ii] = copyVector[ii];
                }
            }
        }

        // display of the result
        System.out.println("");
        System.out.println("");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(matrix[j][k] + "\t");
            }
            System.out.println("\t" + result[j]);
        }
    }
}