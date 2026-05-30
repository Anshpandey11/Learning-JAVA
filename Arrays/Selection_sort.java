import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
