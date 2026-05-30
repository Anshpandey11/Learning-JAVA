import java.util.*;

public class Find_zero {
    public static void zero(int num[]) {
        Arrays.sort(num);

        for(int i = 0; i < num.length - 2; i++) {

            if(i > 0 && num[i] == num[i - 1]) continue;

            for(int j = i + 1; j < num.length - 1; j++) {

                if(j > i + 1 && num[j] == num[j - 1]) continue;

                for(int k = j + 1; k < num.length; k++) {

                    if(k > j + 1 && num[k] == num[k - 1]) continue;

                    if(num[i] + num[j] + num[k] == 0) {
                        System.out.println("[" + num[i] + "," + num[j] + "," + num[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        zero(num);
    }
}