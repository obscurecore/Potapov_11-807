import java.util.Arrays;
import java.util.Scanner;

public class Hw3Lesson3Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ave = 0;
        int sm=0;
        int a = sc.nextInt();
        int check1 = 0;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <a ; i++) {
            sm+=arr[i];
        }
        ave=sm/arr.length;
        System.out.println(ave);
        for (int i = 0; i < a; i++) {
            if (arr[i]>ave){
                check1++;
            }
        }
        System.out.println(check1);
    }
}
