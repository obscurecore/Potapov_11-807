import java.util.Scanner;

public class MainJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(CallMe(a));
    }


    public static Boolean CallMe (String s) {
        if (s.length() == 1) {
            return true;
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return true;
                }
                return CallMe(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }
}
