import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
