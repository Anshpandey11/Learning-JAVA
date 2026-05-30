import java.util.Scanner;

public class Transpose {
    public static void t(int matrix[][]){
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                    System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
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
         t(matrix);
    }
}
