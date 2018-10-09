import java.util.Arrays;
import java.util.Scanner;
public class ClassTestTask01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();int matrix[][] = new int[a][a];
        for (int i = 0; i < a; i++) for (int j = 0; j < a; j++) matrix[i][j] = sc.nextInt();
        int [] arr = getSideDiagonalAsVector(matrix);
        int [] qwerty = mult(matrix,arr);
        System.out.println("1 task"+Arrays.toString(arr));
        System.out.println("2 task "+Arrays.toString( qwerty));
        sortArr(qwerty);
    }
    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) System.out.print(arr[j] + " ");
    }

    static int[] getSideDiagonalAsVector(int[][] matrix) {
        int a = matrix[0].length;
        int arr[]= new int[a];
        for (int i = 0; i < a; i++) arr[i]=(matrix[i][a - i - 1]);
        return arr;
    }

    static int[] mult(int[][] matrix, int[] arr) {
        int a = matrix[0].length;
        int mat[] = new int[a];
        for (int i = 0; i < a; i++) {
            int sum =0;
            for (int j = 0; j < a; j++) sum += (matrix[i][j])* arr[i];
            mat[i] = sum;
        }
        return mat;
    }
}
