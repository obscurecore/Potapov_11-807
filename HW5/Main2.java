import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) if (Character.isDigit(arr[i])) arr[i]='*';
        System.out.println(Arrays.toString(arr));
    }
}
