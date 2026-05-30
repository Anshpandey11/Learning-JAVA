import java.util.Scanner;

public class Subarray_sumKadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[8];
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
}
