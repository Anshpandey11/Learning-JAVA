import java.util.Scanner;

public class Reverse_array {
    public static void rev(int num[]){
        int s = 0; 
        int e = num.length-1;

        while (s<=e) {
            int temp = num[e];
            num[e]=num[s];
            num[s]=temp;
            s++;
            e--;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num [] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        rev(num);
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
