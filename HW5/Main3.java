import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int res = 0;
        int k=1;
        for (int i = 0; i < arr.length; i++) {
            res = res*10 + arr[i]-48;

        }
        System.out.println(res);
    }
}
