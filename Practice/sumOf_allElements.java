import java.util.Scanner;

public class sumOf_allElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = num[i]+sum;
        }
        System.out.println(sum);
    }
}