import java.util.Scanner;
// 4:06  done  :D
// Hello
public class Main6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D[][] = new int[n][n];
        int inc = 1;int q = 0;int w = 0;int cnt = 1;int m = 0;int idk = 0;int minus = 2;int minusdig=2;
        shrek:
        {
            while (inc <= ((n * n) - (2 * (n - 1)))) {
                for (int i = m; i < n - m - idk; i++) {//pravo
                    //System.out.println("kek" + D[m][i + idk]);
                    if (D[m][i + idk] != 0) break shrek;
                    D[m][i + idk] = inc;
                    inc++;
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(D[i][j] + " ");
                    }
                    System.out.println();
                }//вывод
                //System.out.println("Heelo");

                for (int i = m + 1; i < n - m-idk; i++) {//вниз
                    if (D[i][n - m - 1] != 0) {
                        //System.out.println("ВНиз" + D[i][n - m - 1]);
                        break shrek;
                    }
                    D[i][n - m - 1] = inc;
                    inc++;

                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(D[i][j] + " ");
                    }
                    System.out.println();
                }//вывод

                //diagonal
                for (int i = 0; i < n - minus-m; i++) {

                    //System.out.println("Рус" + D[n - minus - w][n - minusdig - q]);
                    if (D[n - minus - w][n - minusdig - q] != 0) break shrek;
                    D[n - minus - w][n - minusdig - q] = inc;
                    inc++;q++;w++;
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(D[i][j] + " ");
                    }
                    System.out.println();
                }//вывод
                idk++;m += 1;w=0;q=0;cnt++;minus+=2;minusdig++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }//вывод
    }
}
