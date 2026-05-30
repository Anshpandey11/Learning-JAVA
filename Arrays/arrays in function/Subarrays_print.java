import java.util.Scanner;

public class Subarrays_print {
    public static void sub(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num [] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        sub(num);
}
}
