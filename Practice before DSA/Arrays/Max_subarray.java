import java.util.Scanner;

public class Max_subarray {

    public static void max(int a[], int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }
            }

        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max(a, n);
    }
}
