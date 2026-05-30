import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static String ana(String str, String str1){

        if(str.length() != str1.length()){
            return "Not anagrams";
        }

        char[] arr1 = str.toCharArray();
        char[] arr2 = str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return "Not anagrams";
            }
        }

        return "anagrams";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        System.out.println(ana(str, str1));
    }
}