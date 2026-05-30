import java.util.Scanner;

public class Double_number {
    public static boolean ouble(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(ouble(num));
    }
}
