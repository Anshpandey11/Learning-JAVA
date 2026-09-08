import java.util.Scanner;

public class Count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int o = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println(e + " " + o);
    }
}
