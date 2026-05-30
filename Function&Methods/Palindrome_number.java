import java.util.Scanner;

public class Palindrome_number {

    public static void pal(int n) {
        int digit=0;
        int p=n;
        int r= 0;
            while (p!=0){
                digit=p%10;
                p=p/10;
                r= r*10+digit;
            }
            if (n==r) {
                System.out.println("Number is palindrome");
            }else{
                System.out.println("number is not palindrome");
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        pal(n);
    }
}
