import java.util.Scanner;

public class Fuzzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int i = sc.nextInt();
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (i % 3 == 0) {
            System.out.println("fizz");
        } else if (i % 5 == 0) {
            System.out.println("buzz");
        }
    }
}
