import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int cnt =1;
        int mx=1;
        for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < a-1; i++) {
            if(arr[i]==arr[i+1]){
                cnt++;
                if(cnt>mx){
                    mx=cnt;
                }
            }
            else{
                cnt=1;
            }

        }
        System.out.println(mx);
    }
}
