import java.util.Scanner;

public class SumOf_numbers {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ask how many numbers
        System.out.print("How many numbers? ");
        int n = scanner.nextInt();

        // Create array of that size
        int[] numbers = new int[n];

        // Take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        // Show result
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}

