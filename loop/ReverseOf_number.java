import java.util.Scanner;

public class ReverseOf_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int n = sc.nextInt();
        int digit=0;
        while (0<n) {
            digit= n%10;
            System.out.print(digit+"");
            n=n/10;

        }
        System.out.println();
    }
}
