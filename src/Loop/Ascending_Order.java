
//Q. Write a Java program to sort an array of integers in ascending order

package Loop;

public class Ascending_Order {

    public static void main(String[] args) {
        int[] numbers = {64, 56, 23, 12, 32};  // Define an array of integers
        
        System.out.println("Original Array:");
        printArray(numbers);
        
        // Correct method call with matching method name
        bubbleSort(numbers);
        
        System.out.println("Sorted array in ascending order:");
        printArray(numbers);
    }

    // Corrected method name (from bubblesort to bubbleSort)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr)
    {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
