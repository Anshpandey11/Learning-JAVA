import java.util.Scanner;

public class Binomial_coefficient {
    public static int num(int n) {
        int nu = 1;
        for (int i = 1; i <= n; i++) {
            nu = nu * i;
        }
        return nu;
    }

    public static int rx(int r) {
        int ri = 1;
        for (int i = 1; i <= r; i++) {
            ri = ri * i;
        }
        return ri;
    }

    public static int numrx(int n, int r) {
        int nx = n - r;
        int b = 1;
        for (int i = 1; i <= nx; i++) {
            b = b * i;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int q = num(n);
        int w = rx(r);
        int e = numrx(n, r);
        int c = q / (w * e);
        System.out.print(c);
    }
}
