import java.util.Arrays;
import java.util.Scanner;

public class Hw3LessonEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int check1=0;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <a-2 ; i++) {
            if (((arr[i])<(arr[i+1]))&&((arr[i+1])>(arr[i+2]))){
                check1++;
            }
        }

        System.out.println(check1);


        }


    }
