package com.company;

import java.util.Arrays;
import java.util.Random;


public class MazeGeneration {

    public MazeGeneration(int i, int j, int urov) {
        this.i = i;
        this.j = j;
        this.urov = urov;
    }

    private int i;
    private int j;
    private int distance;
    private int urov;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getDistance() {
        return distance;
    }

    public int getUrov() {
        return urov;
    }

    public boolean setI(String i) {

        Random random = new Random();
        if (i.equals("random")) {
            this.i = 1 + 2 * (random.nextInt(10));
            System.out.println("Это рандом, детка");

            return true;
        } else if ((Integer.parseInt(i) % 2 != 0 & (Integer.parseInt(i) > 2))) {
            this.i = (Integer.parseInt(i));
            System.out.println("Красава! a- " + i + " норм");

        } else {
            System.out.println("ТЫ не пройдешь(a>2 и нечет)!.... ");
            return false;
        }
        return true;
    }

    public boolean setJ(String j) {
        Random random = new Random();
        if (j.equals("random")) {
            this.urov = 3 + (random.nextInt(10));
            System.out.println("Это рандом, детка");

            return true;
        } else if ((Integer.parseInt(j) > 2)) {
            this.j = (Integer.parseInt(j));
            System.out.println("Красава! b- " + j + " норм");

        } else {
            System.out.println("Ты не пройдешь(b>2).... ");
            return false;
        }


        return true;


    }

    public boolean setUrov(String urov) {
        Random random = new Random();
        if (urov.equals("random")) {
            this.urov = 1 + (random.nextInt(10));
            System.out.println("Это рандом, детка");
            return true;
        } else if (Integer.parseInt(urov) > 0) {
            this.urov = Integer.parseInt(urov);
            System.out.println("Красава! c- " + urov + " норм");

        } else {
            System.out.println("Ты не пройдешь(c>0).... ");
            return false;
        }

        return true;
    }


    public int[][][] maze() {
        distance = 2 * j - 3;
        int smallarray[][] = new int[2][j];
        int temp[][] = new int[2][j * 2];
        int MAP[][][] = new int[urov][i][distance];
        for (int q = 0; q < urov; q++) {
            for (int l = 0; l < j; l++) {
                if (l == 0) smallarray[0][0] = 0;
                if (l > 0) smallarray[0][l] = l;
                if (l == j - 1) smallarray[0][l] = 0;
                smallarray[1][l] = 0;
            }
            for (int k = 0; k < i - 1; k++) {
                if (k == 0) {
                    for (int l = 0; l < distance; l++) {
                        MAP[q][0][l] = 1;
                        MAP[q][i - 1][l] = 1;
                    }
                }
                if (k > 0 && k < i - 3) {
                    smallarray = timelist(smallarray);
                    temp = transformation(smallarray);
                    if (k > 0 && k < i - 4) {
                        smallarray = clearlist(smallarray);
                    }
                    for (int l = 0; l < distance; l++) {
                        MAP[q][k][l] = temp[0][l];
                        MAP[q][k + 1][l] = temp[1][l];
                    }
                    k++;
                }
                if (k == i - 2) {
                    smallarray = LASTLIST(smallarray);
                    temp = transformation(smallarray);
                    for (int l = 0; l < distance; l++) {
                        MAP[q][k][l] = temp[0][l];
                    }
                }
            }
        }
        return MAP;
    }


    private int[][] timelist(int smallarray[][]) {
        Random random = new Random();
        for (int l = 1; l < j - 1; l++) {
            if (smallarray[0][l] == Math.abs(smallarray[0][l + 1])) {// случай когда между двумя множиствами// надо ставить стенку
                smallarray[0][l] = -smallarray[0][l];
            } else {
                int qwe = random.nextInt(2);
                if (qwe == 1 && (l != j - 2)) {
                    smallarray[0][l] = -smallarray[0][l];
                }
            }
        }


        for (int l = 1; l < j - 1; l++) {
            if (smallarray[0][l + 1] < 0) {
                if (smallarray[0][l] > 0) {
                    smallarray[0][l + 1] = -smallarray[0][l];
                }
            }
            if ((smallarray[0][l] > 0)) {
                if ((smallarray[0][l] > 0) && smallarray[0][l + 1] > 0) {
                    smallarray[0][l + 1] = smallarray[0][l];
                }
            }
        }

        int temparr[] = new int[j];
        for (int k = 0; k < j; k++) {
            temparr[k] = Math.abs(smallarray[0][k]);
        }
        int count;
        int m;
        int lastcheck = 0;
        int l;
        for (l = 1; l < j - 1; l++) {
            if (smallarray[0][l] != 0) {
                count = 1;
                for (m = l; m < j - 1; m++) {
                    if (smallarray[0][m] == Math.abs(smallarray[0][m + 1])) {
                        count++;

                    } else {
                        break;
                    }
                }
                if (count > 1) {
                    int arr[] = new int[count];
                    for (int k = 0; k < arr.length; k++) {
                        arr[k] = ((int) (Math.random() * 2));
                    }
                    int cnt = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == 1) {
                            cnt++;
                        }
                    }
                    if (cnt == count) {
                        arr[(int) Math.random() * (count)] = 0;
                    }
                    int o = l;
                    for (m = 0; m < count; m++) {
                        if (arr[m] == 1) {
                            smallarray[1][o] = -1;
                        }
                        o++;

                    }
                    o = 0;
                    l += count - 1;
                }
                m = 0;
            }
            count = 0;


        }
        return smallarray;
    }

    private int[][] transformation(int smallarray[][]) {
        int transarr[][] = new int[2][distance];


        for (int k = 1; k < j - 1; k++) {
            if (smallarray[1][k] < 0) {
                transarr[1][k * 2 - 1] = 1;
                transarr[1][k * 2 - 2] = 1;
                transarr[1][k * 2] = 1;
                //transarr[1][k * 2 + 1] = 1;

            } else {
                transarr[1][k * 2 - 1] = 0;
                transarr[1][k * 2] = 0;
            }

        }


        for (int k = 1; k < j - 1; k++) {
            if (smallarray[0][k] > 0) {
                transarr[0][k * 2 - 1] = 0;
                transarr[0][k * 2] = 0;
            } else {
                transarr[0][k * 2 - 1] = 0;
                transarr[0][k * 2] = 1;
                transarr[1][k * 2] = 1;
            }

        }


        transarr[0][0] = 1;
        transarr[0][distance - 1] = 1;
        transarr[1][0] = 1;
        transarr[1][distance - 1] = 1;

        return transarr;
    }

    private int[][] clearlist(int smallarray[][]) {
        for (int k = 0; k < j; k++) {
            smallarray[0][k] = Math.abs(smallarray[0][k]);
        }
        for (int k = 1; k < j; k++) {
            if (smallarray[1][k] == -1) {
                smallarray[0][k] = 0;
                smallarray[1][k] = 0;
            }
        }

        int t = 0;
        for (int k = 1; k < j - 1; k++) {
            if (smallarray[0][k] == 0) {
                while (true) {
                    int cnt = 0;
                    for (int l = 1; l < j - 1; l++) {
                        if (smallarray[0][l] == t) {
                            cnt++;
                            t++;
                        }
                    }
                    if (cnt == 0) {
                        smallarray[0][k] = t;
                        break;
                    } else cnt = 0;
                }
                t = 0;
            }
        }
        for (int k = 0; k < j; k++) {
            smallarray[1][k] = 0;
        }
        return smallarray;
    }

    private int[][] LASTLIST(int smallarray[][]) {
        for (int k = 0; k < j - 1; k++) {
            if ((smallarray[0][k]) != (smallarray[0][k + 1]) && smallarray[0][k] < 0) {
                smallarray[0][k] = Math.abs(smallarray[0][k]);
            }
        }
        return smallarray;
    }


}
