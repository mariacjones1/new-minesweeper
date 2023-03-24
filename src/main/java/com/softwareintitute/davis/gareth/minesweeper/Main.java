package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MinesweeperGrid myGrid = new MinesweeperGrid(5,5,10);
        Scanner scanner = new Scanner(System.in);
        int xCord;
        int yCord;
        int selection;
        boolean runGame = true;
        System.out.println(myGrid);
        while (runGame) {
            System.out.println("Please enter X coordinate:");
            xCord = scanner.nextInt();
            System.out.println("Please enter Y coordinate:");
            yCord = scanner.nextInt();
            System.out.println("Do you want to reveal the square (0) or set a flag (1)?");
            selection = scanner.nextInt();
            if (selection==0) {
                System.out.println(myGrid.revealSquare(xCord,yCord));
            } else if (selection==1) {
                System.out.println(myGrid.setFlag(xCord,yCord));
            } else {
                System.out.println("Invalid selection.");
            }
        }


    }
}
