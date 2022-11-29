import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        int midnum = (start + end) / 2;
        System.out.println("enter the num");
        int k = sc.nextInt();
        while (start <= end) {
            midnum = (start + end) / 2;
            if (arr[midnum] == k) {

                System.out.println(midnum);
                break;
            }
            if (k < arr[midnum]) {
                end = midnum - 1;
            } else {
                start = midnum + 1;

            }

        }
        if (arr[midnum] == k) {
            System.out.println(midnum);
        } else {
            System.out.println(-1);
        }
    }
}