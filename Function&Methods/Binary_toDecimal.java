import java.util.Scanner;

public class Binary_toDecimal {

    public static void bintodea(int n) {
        int pow = 0;
        int decnum = 0;
        int my = n;
        while (n > 0) {
            int lastd = n % 10;
            decnum = decnum + (lastd * (int) Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of" +" "+ my + ":-" + decnum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        bintodea(num);
    }
}
