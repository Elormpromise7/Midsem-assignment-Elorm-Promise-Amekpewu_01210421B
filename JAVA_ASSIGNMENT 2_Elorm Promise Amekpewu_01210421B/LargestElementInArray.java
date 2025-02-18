import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[]args){
        Scanner scInt = new Scanner(System.in);
        Scanner scSting = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);

        // Input the size of the arrays
        System.out.print("Enter the number of elements in the array: ");
        int n = scInt.nextInt();

        // Create an array of size n
        int[] array = new int[n];

        // Input elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scInt.nextInt();
        }

        // Find the largest element
        int largest = array[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner


    }
}

