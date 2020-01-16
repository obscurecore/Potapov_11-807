import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        String temp = "";
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(flag==1) temp+=arr[i];
            if (flag==0&&Character.isLetter(arr[i])) {
                temp += arr[i];
                flag = 1;
            }
        }
        System.out.println(temp);
    }

}
