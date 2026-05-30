import java.util.Scanner;

public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    num[j] = -1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(num[i] != -1){
            System.out.println(num[i]+" ");
            }
        }
    }
}
