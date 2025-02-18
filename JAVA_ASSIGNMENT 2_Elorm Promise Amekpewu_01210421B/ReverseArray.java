import java.util.Scanner;
public class ReverseArray {
            public static void main(String[] args) {
                Scanner console = new Scanner(System.in);

                // Input the size of the array
                System.out.print("Enter the number of elements in the array: ");
                int n = console.nextInt();

                // Create an array of size n
                int[] array = new int[n];

                // Input elements of the array
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    array[i] = console.nextInt();
                }

        // Reverse the array
        int start = 0;
        int end = n - 1;
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }

        // Output the reversed array
        System.out.println("The reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // For a new line

        // Close the scanner

    }
}

