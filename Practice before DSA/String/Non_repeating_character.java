import java.util.Scanner;

public class Non_repeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char ch;
        for (int i = 0; i < str.length(); i++) {
            boolean f = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    f = true;
                }
            }
            if (!f) {
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}
