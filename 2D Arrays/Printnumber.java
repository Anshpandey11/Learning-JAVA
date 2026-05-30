import java.util.Scanner;

public class Printnumber {
    public static void pnum(int matrix[][],int key){
        int count=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
            }
        System.out.println(count);
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
         System.out.println("write the value of key");
        int key = sc.nextInt();
        pnum(matrix,key); 
    }
}
