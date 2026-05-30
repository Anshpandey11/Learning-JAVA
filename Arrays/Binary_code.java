import java.util.Scanner;

public class Binary_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}
