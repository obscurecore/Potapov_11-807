package com.company;

import java.util.Random;

public class Move {
    int[][][] maze;
    private int index1;
    private int index2;
    private int mw = 0;
    private int rob = 7;
    private int cl = 0;
    private int target;
    private int findTarget = 8;
    private int level;
    private int size;
    Random random = new Random();


    public Move(int[][][] maze, int level, int index1, int index2, int size) {
        this.maze = maze;
        maze[cl][index1][index2] = rob;
        maze[cl][random.nextInt(size - 2) + 1][random.nextInt(size - 2) + 1] = findTarget;
        this.index1 = index1;
        this.index2 = index2;
        this.level = level;
        this.size = size;

    }

    public void move(String m) {
        m = m.toLowerCase();
        if (m.equals("w") && maze[cl][index1 - 1][index2] != 1) {
            maze[cl][index1][index2] = mw;
            index1--;
            target = maze[cl][index1][index2];
            maze[cl][index1][index2] = rob;

        }
        if (m.equals("s") && maze[cl][index1 + 1][index2] != 1) {
            maze[cl][index1][index2] = mw;
            index1++;
            target = maze[cl][index1][index2];
            maze[cl][index1][index2] = rob;
        }
        if (m.equals("a") && maze[cl][index1][index2 - 1] != 1) {
            maze[cl][index1][index2] = mw;
            index2--;
            target = maze[cl][index1][index2];
            maze[cl][index1][index2] = rob;
        }
        if (m.equals("d") && maze[cl][index1][index2 + 1] != 1) {
            maze[cl][index1][index2] = mw;
            index2++;
            target = maze[cl][index1][index2];
            maze[cl][index1][index2] = rob;
        }
        if (target == findTarget && cl != level) {
            cl++;
            if (cl == level){
                System.out.println("END)");
            }
            else {
                maze[cl][index1][index2] = rob;
                System.out.println("you catch him!)");
                maze[cl][random.nextInt(size - 1) + 1][random.nextInt(size - 1) + 1] = findTarget;
            }

        }
    }

    public int RobotCoordinatesK(){
        return index1;
    }
    public int RobotCoordinatesN(){
        return index2;
    }
    public int returnCL (){
        return cl;
    }
}
