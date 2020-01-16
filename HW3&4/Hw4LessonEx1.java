import java.util.Arrays;
import java.util.Scanner;

public class Hw4LessonEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int id=-1;
        int sdvig =0;
        int check=0;
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        int shiftarr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(shiftarr));

        kek:{
        for(int i = 0;i<a;i++) {
            if (arr2[0] == arr1[0]) {
                for (int j = 0; j < b; j++) {
                    if (arr2[j] == arr1[j]) {
                        check++;
                    }
                }
            }

            if (check == b) {
                break kek;
            }
            else {
                check = 0;
                for (int o = 0; o <shiftarr.length-1; o++){
                    shiftarr[o] = arr1[o+1];

                }
                sdvig++;
                System.arraycopy(shiftarr, 0, arr1, 0, arr1.length);
            }
        }

        }

        System.out.println(sdvig);
    }
}
