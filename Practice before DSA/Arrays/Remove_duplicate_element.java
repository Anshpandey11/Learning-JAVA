import java.util.Scanner;

public class Remove_duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int u[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            boolean f = false;
            for (int j = 0; j < c; j++) {
                if (a[i] == u[j]) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                u[c] = a[i];
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(u[i]+" ");
        }
    }
}
