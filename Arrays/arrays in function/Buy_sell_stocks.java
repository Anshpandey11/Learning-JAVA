import java.util.Scanner;

public class Buy_sell_stocks {
    public static void buy(int num[]) {
        int buy = num[0];
        int maxp = 0;

        for(int i = 1; i < num.length; i++) {
            int sell = num[i];

            if(sell < buy) {
                buy = sell;
            } else {
                int profit = sell - buy;
                maxp = Math.max(maxp, profit);
            }
        }

        System.out.println(maxp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        buy(num);
    }
}
