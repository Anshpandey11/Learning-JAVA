import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int curr=num[i];
            int prev = i-1;

            while (prev >=0 && num[prev] > curr) {
                num[prev+1] = num[prev];
                prev--;
            }
            num[prev+1] = curr;
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
