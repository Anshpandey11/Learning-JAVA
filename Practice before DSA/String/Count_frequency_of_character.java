import java.util.Scanner;

public class Count_frequency_of_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int f = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                f++;
            }
        }
        System.out.println(f);
    }
}
