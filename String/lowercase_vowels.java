import java.util.Scanner;

public class lowercase_vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int lc =0;
        for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
            if('a'==str.charAt(i) ||'e'==str.charAt(i)||'i'==str.charAt(i)||'o'==str.charAt(i)||'u'==str.charAt(i)){
                count++;
            }else if(ch >= 'a'&& ch<='z'){
                lc++;
            }
        }
        System.out.println(count+" "+lc);
    }
}
