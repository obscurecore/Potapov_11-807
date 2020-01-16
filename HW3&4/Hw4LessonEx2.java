import java.util.Arrays;
import java.util.Scanner;

public class Hw4LessonEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        char[] arr1 = str.toCharArray();
        char narr[] = new char[arr1.length];
        for(int i = 0; i < narr.length; i++) {
            narr[(i + k) % narr.length] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(narr));
    }
}
