import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String qur="";
        String str ="";
        double res=0;
        while(true) {
            if (qur.equals("newa")) a = sc.nextInt();
            if (qur.equals("STAP")) break;
            str = sc.next();
            double b = sc.nextDouble();
            if (str.equals("*")) res = a * b;
            if (str.equals("+")) res = a + b;
            if (str.equals("-")) res =(a - b);
            if (str.equals("/")) res = (a / b);
            System.out.println(res);
            a =  res;
            qur = sc.next();
        }
    }
}
