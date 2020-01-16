import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String arr[]= new String[a];
        for (int i = 0; i < a; i++)  arr[i]=sc.next();
        Sort(arr);
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i]+" ");
        }
        }

        static String[] Sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int im = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[im].length() < arr[j].length()) {
                    im = j;
                }
            }
            String buf = arr[im];
            arr[im] = arr[n - 1 - i];
            arr[n - 1 - i] = buf;

        }
        return arr;
    }
}