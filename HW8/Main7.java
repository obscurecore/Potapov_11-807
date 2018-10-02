import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int arr[] = new int[a]; int array[][]=new int[a][a];
        int inc = 1;
        for (int i = 0; i < a ; i++) {
            arr[i] = inc;
            inc++;
        }
        for (int i = 0; i < a; i++) for (int j = 0; j < a-i; j++)array[i][j+i]=arr[j];
        for (int i = 0; i < a; i++) for (int j = 0; j < a - i; j++) array[j + i][i] = arr[j];
        for (int i = 0; i < a; i++) { for (int j = 0; j < a; j++) { System.out.print(array[i][j]); }System.out.println(); }
    }
}
