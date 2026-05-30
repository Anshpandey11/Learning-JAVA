import java.util.Scanner;

public class Find_productOf_aAnd_b {

    public static int multipleofab(int a, int b) {
        int mg = a * b;
        return mg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for A:-");
        int a = sc.nextInt();
        System.out.println("Enter the number for B:-");
        int b = sc.nextInt();
        int m = multipleofab(a, b);
        System.out.println("The Product of A and B is:-" + m);
    }
}
