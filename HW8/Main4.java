import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mn=0;
        int mx=0;
        int arr[][] = new int[n][m];
        int id = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) arr[i][j] = sc.nextInt();
        mn = arr[0][0];mx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < mn) {
                    mn = arr[i][j];
                    id = j;
                }
            }
            System.out.println(mn);
            for (int z = 0; z < n; z++) {
                if (arr[z][id] > mx) {
                    mx = arr[z][id];
                }
            }
            if (mx == mn) {
                System.out.println("lol it's target :D " + mx);
            }
            mx = 0;id = 0;
        }
    }
}



