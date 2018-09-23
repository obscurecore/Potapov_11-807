import java.util.Arrays;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt1=0,cnt2=0;
        int a = sc.nextInt(), b = sc.nextInt();
        String arr[] = new String[a];
        String brr[] = new String[b];
        for (int i = 0; i < a; i++) arr[i] = sc.next();
        for (int i = 0; i < b; i++) brr[i] = sc.next();
        for (int i = 0; i < a ; i++) if(!Arrays.asList(brr).contains(arr[i]))cnt1++;
        for (int i = 0; i < b ; i++) if(!Arrays.asList(arr).contains(brr[i]))cnt2++;
        System.out.print(cnt1+cnt2);
    }
}
