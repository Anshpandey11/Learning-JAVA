import java.util.Scanner;

public class AllNumber_enteredByUser_exceptMultiplesOf_ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {

            if (num % 10 == 0) {
                continue;
            }
            System.out.println();
        } while (true);

    }
}