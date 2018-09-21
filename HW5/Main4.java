import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        if (str1.equals("u")) str = str.toUpperCase();
        if (str1.equals("l")) str = str.toLowerCase();
        System.out.println(str);
    }
}