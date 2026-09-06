import java.util.Scanner;

public class Reverse_array {

    public static void re(int a[],int n){
        int f=0;
        int l=n-1;
        while (f<l) {
            int temp = a[l];
            a[l]=a[f];
            a[f]=temp;
            f++;
            l--;
        }
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        re(a, n);
       for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
       }
    }
}
