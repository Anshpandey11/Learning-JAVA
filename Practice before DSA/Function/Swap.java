import java.util.Scanner;

public class Swap {

    public static void s(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        s(a, b);
    }
}
