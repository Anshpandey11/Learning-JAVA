import java.util.Scanner;

public class Counting_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, num[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[num[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
