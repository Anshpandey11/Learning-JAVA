import java.util.Scanner;

public class Rotate_K_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int r = 0; r < k; r++) {
            int l = a[n - 1];

            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = l;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
