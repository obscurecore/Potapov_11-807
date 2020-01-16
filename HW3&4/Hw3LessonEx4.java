import java.util.Arrays;
import java.util.Scanner;

public class Hw3LessonEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag1 = false;
        int a = sc.nextInt();
        int x = sc.nextInt();
        int check1=0;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < (x - 1); i++) {
            if (arr[i] <= arr[i + 1]) {
                check1++;
            } else {
                break;
            }
        }
        if (check1==(x-1)){
            check1=0;
            for (int i = (x-1); i < (a - 1); i++) {
                if (arr[i] >= arr[i + 1]) {
                    check1++;
                } else {
                    break;
                }
            }
        }

        if (check1==(x-1)){
            System.out.print("Normalin");//все норм
        }
        else{
            System.out.println("Wrong");
        }

    }
}
