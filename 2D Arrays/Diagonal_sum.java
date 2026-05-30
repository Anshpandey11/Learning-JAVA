import java.util.Scanner;

public class Diagonal_sum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += matrix[i][i];
            if(i != n-1-i){
                sum = sum + matrix[i][n-1-i];
            }
        }
        System.out.println(sum);
    }
}
