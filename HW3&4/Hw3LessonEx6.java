import java.util.Arrays;
import java.util.Scanner;

public class Hw3LessonEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int narr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.arraycopy(arr, 0, narr, 0, arr.length);// copy
        /*
        for(int i=0;i<a;i++) System.out.print(narr[i]);
        */
        for (int i = 0; i < narr.length / 2; i++) {
            int q = narr[i];
            narr[i] = narr[(narr.length - i) - 1];
            narr[narr.length - i - 1] = q;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(narr));
    }
}

