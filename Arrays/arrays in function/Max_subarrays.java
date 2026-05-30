import java.util.Scanner;

public class Max_subarrays {
    public static void sub(int num[]) {
        int max = Integer.MIN_VALUE;
         int sum = 0;
        for (int i = 0; i < num.length; i++) {
           
            for (int j = i; j < num.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }
                System.out.println(sum);
                if (sum > max) {
                max = sum;
              }
            } 
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sub(num);
    }
}
