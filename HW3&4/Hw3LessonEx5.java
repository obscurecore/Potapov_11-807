import java.util.Arrays;
import java.util.Scanner;

public class Hw3LessonEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = " ";
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            b+=arr[i];
        }
        System.out.println(b);

    }
}
