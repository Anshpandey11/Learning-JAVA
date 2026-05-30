import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(num[i] > l){
                sl = l;
                l = num[i];
            }
            else if(num[i] > sl && num[i] != l){
                sl = num[i];
            }
        }
            System.out.println("Second largest = " + sl);
    }
}


