import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean isPalindrome = true;

        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}