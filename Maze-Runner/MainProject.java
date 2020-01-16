package com.company;

import java.util.Random;
import java.util.Scanner;

public class MainProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер лабиринта AxB");
        System.out.println("введите A");
        int index1 = sc.nextInt();
        System.out.println("введите B");
        int index2 = sc.nextInt();
        System.out.println("введите кол-во этажей");
        int level = sc.nextInt();
        MazeGeneration maze = new MazeGeneration(index1, index2, level);
        int maze1[][][] = maze.maze();
        System.out.println("введите поле зрения");
        int fov = sc.nextInt();
        Random random = new Random();
        int k = (random.nextInt(index1 - 2) + 1);
        int n = (random.nextInt(index1 - 2) + 1);
        FieldOfView fieldOfView = new FieldOfView(maze1, index1, index2, fov);
        Move move = new Move(maze1, level, k, n, index1);
        fieldOfView.fieldOfView(k, n);
        while (move.returnCL() != level) {
            fieldOfView.urov(move.returnCL());
            move.move(sc.next());
            k = move.RobotCoordinatesK();
            n = move.RobotCoordinatesN();
            fieldOfView.fieldOfView(k, n);
        }
    }
}
