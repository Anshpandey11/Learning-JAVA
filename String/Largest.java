import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // fix: consume leftover newline

        String fruits[] = new String[n];
        for(int i = 0; i < n; i++){
            fruits[i] = sc.nextLine();
        }

        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}