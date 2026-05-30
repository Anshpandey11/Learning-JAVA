import java.util.Scanner;

public class PrintAll_primesIn_aRange {
    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2; i<=n; i++){
            if (isprime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        primeRange(n);
    }
}
