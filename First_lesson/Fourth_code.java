import java.util.Scanner;

public class Fourth_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        float num1 = sc.nextFloat();
        System.out.println("Enter the width of rectangle:");
        float num2 = sc.nextFloat();
        System.out.println("The perimeter of rectangle:"+ 2*(num1+num2));
    }
}
