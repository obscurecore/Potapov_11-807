import java.util.Scanner;
public class MainF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(CallMe(a));
    }
    public static int CallMe(int a) {
        if (a < 10) return a;
        else {
            System.out.print(a % 10);
            return CallMe(a / 10);
        }
    }
}
