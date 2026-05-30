import java.util.Scanner;

public class Count_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int counteven = 0;
        int countodd = 0;
        for(int i = 0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (num[i]%2==0) {
                counteven++;
            }else{
                countodd++;
            }
        }
        System.out.println(counteven);
        System.out.print(countodd);
    }
}
