import java.util.Arrays;
import java.util.Scanner;

public class Hw3LessonEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mx = 0;
        int imx = -1;
        int a = sc.nextInt();
        int check1 = 0;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < a; i++) {
            if (Math.abs(arr[i]) >= mx) {
                imx = i;
                mx=arr[i];
            }
        }
        System.out.println(imx);
    }
}
