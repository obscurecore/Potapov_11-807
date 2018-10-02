import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();  int x1 = sc.nextInt();  int y2 = sc.nextInt();  int x2 = sc.nextInt();
        int arr1[][] = new int[y1][x1];   int arr2[][] = new int[y2][x2];
        for (int i = 0; i < y1; i++) for (int j = 0; j < x1; j++) arr1[i][j] = sc.nextInt();
        for (int i = 0; i < y2; i++) for (int j = 0; j < x2; j++) arr2[i][j] = sc.nextInt();
        int WOW[][] = new int[y1][x2];

        for (int i = 0; i < y1; i++) {
            for (int j = 0; j < x2; j++) {
                int sum = 0;
                for (int z = 0; z < x1; z++) {
                    sum += (arr1[i][z] * arr2[z][j]);
                }
                WOW[i][j] = sum;
            }
        }
        for (int i = 0; i < y1; i++) { for (int j = 0; j < x2; j++) { System.out.print(WOW[i][j] + " "); }System.out.println(); }
    }
}
