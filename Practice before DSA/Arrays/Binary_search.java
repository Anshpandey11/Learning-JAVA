import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

    public static int bs(int a[],int n,int t){
        Arrays.sort(a);
        int s=a[0];
        int e=n-1;
        while(s<=e){
            int mid = (s+e)/2;
            if (a[mid]==t) {
                return mid;
            }
            if (a[mid]<t) {
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(bs(a, n, t));
    }
}
