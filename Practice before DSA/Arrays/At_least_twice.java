import java.util.Scanner;

public class At_least_twice {

    public static void du(int a[], int n) {
        boolean f = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    f = true;
                    break;
                }
            }
        }
        System.out.println(f);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        du(a, n);
    }
}