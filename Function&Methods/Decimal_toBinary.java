import java.util.Scanner;

public class Decimal_toBinary {

    public static void dectobin(int n){
        int pow=0;
        int bin=0;
        int my=n;

        while (n>0) {
            int rem= n%2;
            bin = bin +(rem *(int)Math.pow(10,pow));

            pow++;
            n=n/2;
        }
        System.out.println("Binary form of"+" "+ my + ":-"+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        dectobin(n);
    }
}
