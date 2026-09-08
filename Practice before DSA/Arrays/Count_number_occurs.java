import java.util.Scanner;

public class Count_number_occurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (t == a[i]) {
                c++;
            }
        }
        System.out.println(c);
    }
}

