import java.util.Scanner;

public class Move_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[c] = a[i];
                c++;
            }
        }
        for (int i = c; i < n; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
