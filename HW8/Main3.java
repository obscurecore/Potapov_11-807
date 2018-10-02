import java.util.Scanner;
//////////////////////O - оптимизация(нет)/////////////////////////////////////
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D[][] = new int[n][n];
        int inc = 1;
        int m = 0;
        while (inc <= n*n) {
            for (int i = m; i < n-m; i++) {
                D[m][i]= inc; inc ++;
            }
            for (int i = m+1; i <n-m ; i++) {
                D[i][n - m - 1] = inc; inc ++;
            }

            for (int i = n-m-2; i >m-1 ; i--) {
                D[n - m - 1][i] = inc; inc ++;
            }
            for (int i = n-2-m; i > m; i--) {
                D[i][m] = inc; inc ++;
            }
            m += 1;
        }
        for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) { System.out.print(D[i][j]+" "); }System.out.println(); }//вывод
    }
}
