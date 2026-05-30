import java.util.Scanner;

public class FactorialOf_number {

    public static int factorialN(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the factorial:-");
        int n = sc.nextInt();
        int fact = factorialN(n);
        System.out.println("The Factorial of" + " " + n + " " + "number is:-" + fact);
    }
}
