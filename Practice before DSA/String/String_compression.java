import java.util.Scanner;

public class String_compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer c = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                c++;
                i++;
            }
            newstr += str.charAt(i);
            if (c > 1) {
                newstr += c.toString();
            }
        }
        System.out.println(newstr);
    }
}
