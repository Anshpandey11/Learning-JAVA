import java.util.Scanner;

public class Largest_number {
    public static int larnum(int num[]) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > l) {
                l = num[i];
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(larnum(num));
    }
}