import java.util.Scanner;

public class Count_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 0;
        for (int j = 0; j < str.length(); j++) {
            char s = str.charAt(j);
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                c++;
            }
        }
        System.out.println(c);
    }
}
