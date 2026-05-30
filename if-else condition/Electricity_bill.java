import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unity:-");
        int num = sc.nextInt();
        int amt = 0;
        if (num<=100 && num>=1) {
            amt=num; 
        }else if (num<=200 && num>=101){
            amt= 100 + (num - 100)*2;
        }else if (num<=300 && num>=201){
            amt = 200 + (num - 200 )*3;
        }System.out.println("Electricity bill according to unity you enter"+" "+amt);
    }
}
