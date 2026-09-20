import java.util.Scanner;

public class Intersection_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int r[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            boolean f = false;
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    f = true;
                    break;
                }

            }
            if (f) {
                r[c] = a[i];
                c++;
            }

        }
        for (int i = 0; i < c; i++) {
            System.out.print(r[i] + " ");
        }
    }
}
