package com.company;

public class FieldOfView {
    private int[][][] arr;
    private int fov;
    private int index1;
    private int index2;
    private int y;
    private int b;
    private int cl;


    public FieldOfView(int[][][] arr, int index1, int index2, int fov) {
        this.arr = arr;
        this.index1 = index1;
        this.index2 = index2;
        this.fov = fov;
    }
    public void urov (int cl) {
        this.cl = cl;
    }

    public void fieldOfView(int k, int n) {
        y = fov * 2 + 1;
        k = k - fov;
        n = n - fov;
        for (int i = 0; i < y; i++) {
            b = n;
            for (int j = 0; j < y; j++) {
                if (k > -1  && b > -1 && k < index1 && b < 2 * index2 - 3){
                    System.out.print(arr[cl][k][b] + " ");
                } else {
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println("\t");
            k++;
        }
    }
}
