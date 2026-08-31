import java.util.Scanner;

public class Prime_range {

    public static boolean isp(int n) {
        boolean isp = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isp = false;
            }
        }
        return isp;
    }

    public static void p(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (isp(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p(n);
    }
}
