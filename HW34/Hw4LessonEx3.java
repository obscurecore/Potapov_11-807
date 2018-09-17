import java.util.Scanner;
public class Hw4LessonEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();
        String s =" ";
        char[] arr = str.toCharArray();
        for (int i = 0; i < a; i++) {//учитываем, что второе число введеное в консоль больше первого
            s+=arr[i];
        }
        for (int i = b+1; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }

}
