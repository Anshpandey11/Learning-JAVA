import java.util.Scanner;

public class Appears_only_once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int r = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }
            if (c == 1) {
                r = a[i];
            }
        }
        System.out.println(r);
    }
}
