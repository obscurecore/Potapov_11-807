import java.util.Scanner;

public class MainG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(CallMe(a));
    }
    public static String CallMe(int a) {
        if (a < 10) return Integer.toString(a);
        else {
            return  CallMe(a / 10) + "" + a % 10;
        }
    }
}
