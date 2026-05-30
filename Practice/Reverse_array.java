import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int f=0;
        int l =n-1;
        while (f<l) {
            int temp = num[l];
            num[l] = num[f];
            num[f] = temp;
            f++;
            l--;
        }
        for(int i = 0; i<n;i++){
            System.out.println(num[i]+" ");
        }
    }
}
