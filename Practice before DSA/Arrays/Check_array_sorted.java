import java.util.Arrays;
import java.util.Scanner;

public class Check_array_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ar[] = a.clone();
        Arrays.sort(ar);
        if (Arrays.equals(a, ar)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
