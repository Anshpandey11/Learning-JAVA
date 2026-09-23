import java.util.Scanner;

public class Shortest_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x = 0;
        int y = 0;
        double sum = 0;
        double p = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('N' == str.charAt(i)) {
                y = y + 1;
            } else if ('S' == str.charAt(i)) {
                y = y - 1;
            } else if ('W' == str.charAt(i)) {
                x = x - 1;
            } else if ('E' == str.charAt(i)) {
                x = x + 1;
            }
        }
        sum = (x * x) + (y * y);
        p = Math.sqrt(sum);
        System.out.println(p);
    }
}
