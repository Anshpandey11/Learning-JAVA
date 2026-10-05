import java.util.Scanner;

public class Count_characters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);
            c++;
        }
        System.out.println(c);
    }
}