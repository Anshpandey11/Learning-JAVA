import java.util.Scanner;

public class Count_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else if (num[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("The odd number is " + " " + odd + " " + "and the even number is" + " " + even);
    }
}
