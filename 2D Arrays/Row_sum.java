import java.util.Scanner;

public class Row_sum {
    public static void sumsecond(int matrix[][]){
        int sum = 0;
        
            for(int j=0;j<matrix[0].length;j++){
                sum = sum + matrix[1][j];        
            }
            System.out.println(sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the value of n");
        int n = sc.nextInt();
         System.out.println("write the value of m");
        int m = sc.nextInt();
         System.out.println("write the value of matrix");
        int matrix[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }  
        sumsecond(matrix);
    }
}
