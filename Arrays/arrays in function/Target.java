import java.util.Scanner;

public class Target {
    public static int t(int num[],int tar){
        for(int i=0;i<num.length;i++){
            if (tar == num[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int tar = sc.nextInt();
        System.out.println(t(num, tar));
    }
}
