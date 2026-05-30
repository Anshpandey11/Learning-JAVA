import java.util.Scanner;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num1 = sc.nextInt();
        if (num1>0) {
            System.out.println("positive!");
        }else if (num1<0) {
            System.out.println("negative!");
        }else {
            System.out.println("Zero!");
        }
    }
}
