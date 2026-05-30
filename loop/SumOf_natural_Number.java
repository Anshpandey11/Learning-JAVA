import java.util.Scanner;

public class SumOf_natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int num = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter<=num) {
           sum = sum+counter;
             counter++;
              
     }
       System.out.println(sum);
    }
}
