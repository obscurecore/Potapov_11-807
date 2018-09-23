import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String arr[] = new String[a];
        for (int i = 0; i < a; i++) arr[i] = sc.next();
        if(check(arr,a)==1) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }



    static int check (String arr[], int a) {
        int check=0;
        int flag= 0;
        kek: {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) if (arr[i].equals(arr[j])) check++;
                if (check > 1){
                    flag= 1;
                    break kek;
                }
                check=0;
            }
        }
        return flag;
    }
}
