package com.company;

import org.junit.Test;

public class MazeTest {

    @Test
    public void TestGeneration() {
        MazeGeneration mz = new MazeGeneration(13, 13,1);
        mz.maze();
    }
    @Test
    public void TestMove() {
        int[][][] arr = new int[1][10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[0][i][j] = 0;
            }
        }
        Move move = new Move(arr, 1, 5, 5, 10);
        move.move("s");

    }

    @Test
    public void TestFoV(){
        int[][][] arr = new int[1][10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[0][i][j] = 0;
            }
        }
        arr[0][5][5] = 5;
        FieldOfView fieldOfView = new FieldOfView(arr, 10,10,2);
        fieldOfView.fieldOfView(5,5);
    }







}
