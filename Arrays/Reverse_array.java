import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int f = 0;
        int l = num.length - 1;
        while (f < l) {
            int temp = num[l];
            num[l] = num[f];
            num[f] = temp;
            f++;
            l--;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
