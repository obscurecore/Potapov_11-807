import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        int arr[][]= new int[a][a];
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <a; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sm=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                sm+=arr[i][j];
            }
            myList.add(sm);
            sm=0;
        }
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a; j++) {
                sm+=arr[j][i];
            }
            myList.add(sm);
            sm=0;
        }
        for (int i = 0; i < a; i++) {
            sm+=arr[i][i];
        }
        myList.add(sm);
        sm=0;
        for (int i = 0; i < a; i++) {
            sm+=arr[i][a-i-1];
        }
        myList.add(sm);
        sm=0;
        System.out.println(myList);
    }
}
