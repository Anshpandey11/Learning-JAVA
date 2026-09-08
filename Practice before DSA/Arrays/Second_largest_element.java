import java.util.Scanner;

public class Second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > l) {
                sl = l;
                l = a[i];
            }
        }
        System.out.println(sl);
    }
}
