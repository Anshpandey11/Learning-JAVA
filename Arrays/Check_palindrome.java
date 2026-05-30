import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[2];
        int digit = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            int org = num[i];
            int temp = num[i];
            int rev = 0;
            while (temp > 0) {
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }
            if (org == rev) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}
