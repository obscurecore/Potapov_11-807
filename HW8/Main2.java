import java.util.Scanner;
import java.util.stream.IntStream;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mx = 0;int id = 0;int sm = 0;int kolobok = 0; int digit=0;
        int a = sc.nextInt();int b = sc.nextInt();int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) for (int j = 0; j < b; j++) arr[i][j] = sc.nextInt();//ввод
        for (int i = 0; i < a; i++) { for (int j = 0; j < b; j++) { System.out.print(arr[i][j]); }System.out.println(); }//вывод
        // поиск max по строкам с записью строки
        for (int i = 0; i < a; i++) {
            if (mx < IntStream.of(arr[i]).sum()){
                id = i;
                mx=IntStream.of(arr[i]).sum();
            }
        }
        // поиск max по столбцам
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) sm += arr[j][i];
            if (mx < sm) {
                kolobok = i;
                mx=sm;
            }
            sm = 0;
        }
        System.out.println(kolobok);
        for (int i = 0; i < b; i++) System.out.print(arr[id][i]+" ");   // вывод
        System.out.println();
        for (int i = 0; i < a; i++) System.out.print(arr[i][kolobok]+" ");
    }
}
















