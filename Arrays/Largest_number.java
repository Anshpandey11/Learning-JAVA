import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i]) {
                largest = n[i];
            }
        }
        System.out.println(largest);

    }
}
