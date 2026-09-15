import java.util.Scanner;

public class Find_missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int r = n + 1;
        int sum = 0;
        int sumr = r * (r + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        int diff = sumr - sum;
        System.out.println(diff);

    }
}
