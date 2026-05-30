import java.util.Scanner;

public class Grades_basedOn_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for grades:-");
        int num = sc.nextInt();
        if (num > 90 && 100 >= num) {
            System.out.println("A");
        } else if (num > 75 && 90 >= num) {
            System.out.println("B");
        } else if (num > 60 && 75 >= num) {
            System.out.println("C");
        } else if (num > 30 && 60 >= num) {
            System.out.println("D");
        } else if (num < 30) {
            System.out.println("F");
        }else{
            System.out.println("invalid input");
        }
    }
}
