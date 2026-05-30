import java.util.Scanner;

public class Subarray_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += num[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
