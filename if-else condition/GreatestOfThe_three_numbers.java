import java.util.Scanner;

public class GreatestOfThe_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number");
        int num1  = sc.nextInt();
        System.out.println("Write the second number");
        int num2 = sc.nextInt();
        System.out.println("Write the third number");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("First number is the greatest");
        }else if (num2>num1 && num2>num3) {
            System.out.println("Second number is the greatest");
        }else if (num3>num1 && num3>num2){
            System.out.println("Third number is the greatest");
        }else {
            System.out.println("All number are same");
        }
    }
}
