import java.util.Scanner;

public class Difference_largest_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > l) {
                l = a[i];
            }
            if (a[i] < s) {
                s = a[i];
            }
        }
        int d = l - s;
        System.out.println(d);
    }
}
