package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MinesweeperGrid myGrid = new MinesweeperGrid(5,5,10);
        Scanner scanner = new Scanner(System.in);
        int xCord;
        int yCord;
        System.out.println(myGrid);
        System.out.println("Please enter X coordinate");
        xCord = scanner.nextInt();
        System.out.println("Please enter Y coordinate");
        yCord = scanner.nextInt();
        System.out.println(myGrid.revealSquare(xCord,yCord));
    }
}
