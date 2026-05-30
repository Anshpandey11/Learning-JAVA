import java.util.Scanner;

public class Search_elementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int target = sc.nextInt();
        
        int num[] = new int[n];
        
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(target == num[i]){
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }
    }
}