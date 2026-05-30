import java.util.Scanner;

public class Number_isPrimeOr_not {

    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
}
