import java.util.Scanner;

public class Buy_andSell_stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int bp = Integer.MAX_VALUE;  // buy price
        int sp = 0;                  // sell price
        int p = 0;                   // max profit

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sp = num[i];             // treat current price as selling price

            if (bp > sp) {           // found a lower price, update buy price
                bp = sp;
            } else {
                int mp = sp - bp;    // profit if sold at sp
                p = Math.max(p, mp);
            }
        }

        System.out.println(p);
    }
}
