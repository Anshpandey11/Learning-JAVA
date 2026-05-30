import java.util.Scanner;

public class Subarray_sumPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int currsum = 0;
        int prefix[] = new int[num.length];
        int maxsum = Integer.MIN_VALUE;
        prefix[0] = num[0];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
