import java.util.Scanner;

public class Oneto_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int counter = 1;
        while (counter <= num) {
            System.out.println(counter);
            counter++;
        }

    }

}
