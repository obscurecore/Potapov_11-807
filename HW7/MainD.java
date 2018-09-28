import java.util.Scanner;
public class MainD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (CallME(a) == 1) System.out.println("Yes");
        else System.out.println("No");
    }
    static double CallME(double a) {
        if (a == 1)return 1;
        else if (a > 1 && a < 2) return -1;
        else return CallME(a / 2);
    }
}
