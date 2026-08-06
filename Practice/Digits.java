import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            System.out.println(ld);
            sum = sum + ld;
            count++;
            n = n / 10;
        }
        System.out.println(count);
        System.out.println("Sum:-" + sum);
    }
}