import java.util.Scanner;

public class Prime_orNot {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isp(n));
    }
}
