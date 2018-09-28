import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainI {
    public static void CallMe(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            CallMe(n / k, k);
        }
        else {
            CallMe(n, k++);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CallMe(a, b);
    }

    /*
    public static List<Integer> CallMe(int a) {
        List<Integer> myList = new ArrayList<Integer>();
        int d = 2;
        while (d*d<=a){
            if (a%d==0){
                myList.add(d);
                a=a/d;
            }
            else d+=1;
        }
        if (a>1) myList.add(a);
        return  myList;

    }
    */
}
