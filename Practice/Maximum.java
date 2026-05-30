import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=Integer.MIN_VALUE;
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
