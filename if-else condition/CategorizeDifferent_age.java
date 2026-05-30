import java.util.Scanner;

public class CategorizeDifferent_age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (13 > num) {
            System.out.println("Child");
        } else if (20 > num && num >= 13) {
            System.out.println("Teen");
        } else if (60 > num && num >= 20) {
            System.out.println("Adult");
        } else if (num >= 60) {
            System.out.println("Senior");
        }
    }
}