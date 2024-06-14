public class ArrayAnalysis {
    public static void main(String[] args) {
        // Define the array
        int[] numbers = {23, 1, 45, 78, 12, 56, 99, 34, 8};
        
        // Print the array
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // Find the largest number
        int largestNumber = numbers[0];
        int smallestNumber = numbers[0];
        
        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        
        // Print the largest and smallest numbers
        System.out.println("Largest number: " + largestNumber);
        System.out.println("Smallest number: " + smallestNumber);
    }
}

