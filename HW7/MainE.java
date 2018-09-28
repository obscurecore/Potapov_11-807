import java.util.Scanner;
public class MainE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(CallMe(a));
    }
    public static int CallMe(int a) {
        if (a < 10) return a;
        else return a % 10 + CallMe(a / 10);
    }
}
