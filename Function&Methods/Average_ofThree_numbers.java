import java.util.Scanner;

public class Average_ofThree_numbers {

    public static void avg(int n,int a,int s){
        float ave=0;
        int sum=0;
        sum = n+a+s;
        ave = sum/3f;
        System.out.println("The average of three number you enter:-"+ave);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int s= sc.nextInt();
        avg(n, a, s);
    }
}
