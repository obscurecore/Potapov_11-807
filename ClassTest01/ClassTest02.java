import java.util.Scanner;
public class ClassTest02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int sm = arr[0]-48;
        for (int i = 0; i <arr.length-2 ; i=i+2) {
            if(arr[i+1]==('+'))sm+=arr[i+2]-48;
            if(arr[i+1]==('-'))sm-=arr[i+2]-48;
        }
        System.out.println(sm);
    }
}
