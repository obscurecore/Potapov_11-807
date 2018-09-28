import java.util.Scanner;
public class MainH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(CallMe(a, b));
    }
    public static boolean CallMe(int n, int i) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % i == 0) return false;
        else if (i < n / 2) return CallMe(n, i + 1);
        else return true;
    }
}