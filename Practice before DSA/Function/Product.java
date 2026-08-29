import java.util.Scanner;

public class Product {

    public static int p(int a, int b) {
        int pro = a * b;
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = p(a, b);
        System.out.println(prod);
    }
}
 