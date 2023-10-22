package homework;
import java.util.Scanner;
public class Questions4 {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the first matrix: ");
	        int rowsA = scanner.nextInt();
	        System.out.print("Enter the number of columns for the first matrix: ");
	        int columnsA = scanner.nextInt();

	        System.out.print("Enter the number of rows for the second matrix: ");
	        int rowsB = scanner.nextInt();
	        System.out.print("Enter the number of columns for the second matrix: ");
	        int columnsB = scanner.nextInt();

	        if (columnsA != rowsB) {
	            System.out.println("Matrix multiplication is not possible.");
	            return;
	        }

	        int[][] matrixA = new int[rowsA][columnsA];
	        int[][] matrixB = new int[rowsB][columnsB];

	        System.out.println("Enter elements of the first matrix:");
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < columnsA; j++) {
	                matrixA[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Enter elements of the second matrix:");
	        for (int i = 0; i < rowsB; i++) {
	            for (int j = 0; j < columnsB; j++) {
	                matrixB[i][j] = scanner.nextInt();
	            }
	        }

	        int[][] resultMatrix = new int[rowsA][columnsB];

	        // Perform matrix multiplication
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < columnsB; j++) {
	                for (int k = 0; k < columnsA; k++) {
	                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
	                }
	            }
	        }

	        System.out.println("Resulting matrix after multiplication:");
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < columnsB; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


