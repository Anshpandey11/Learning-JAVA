import java.util.Scanner;

public class Maximum {

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
        int l = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]>l){
                    l = matrix[i][j];
                }
            }
        }
        System.out.println(l);
    }
}