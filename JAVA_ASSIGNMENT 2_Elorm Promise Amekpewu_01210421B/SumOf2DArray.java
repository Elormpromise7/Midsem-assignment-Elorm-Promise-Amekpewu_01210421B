import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows in the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the 2D array: ");
        int cols = scanner.nextInt();

        // Create a 2D array
        int[][] array = new int[rows][cols];

        // Input elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }

        // Output the sum
        System.out.println("The sum of all elements in the 2D array is: " + sum);

        // Close the scanner
        scanner.close();
    }
}


