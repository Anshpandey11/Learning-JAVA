import java.util.Scanner;

public class Find_duplicate_elements {
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
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    u[c] = a[i];
                    c++;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(u[i] + " ");
        }
    }
}
