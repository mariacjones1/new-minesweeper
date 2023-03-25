package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int width = 10;
        int numberOfMines = 10;
        System.out.println("Choose your difficulty: Beginner (1), Intermediate (2) or Expert (3)");
        int difficulty = scanner.nextInt();
        if (difficulty == 1){
            length = 10;
            width = 10;
            numberOfMines = 10;
        } else if (difficulty == 2){
            length = 16;
            width = 16;
            numberOfMines = 40;
        } else if (difficulty == 3){
            length = 16;
            width = 30;
            numberOfMines = 99;
        }
        MinesweeperGrid myGrid = new MinesweeperGrid(length,width,numberOfMines);
        int xCord;
        int yCord;
        String selection;
        System.out.println(myGrid);
        while (myGrid.runGame) {
            scanner.nextLine();
            System.out.println("Do you want to reveal the square (R) or set a flag (F)?");
            selection = scanner.nextLine().toUpperCase();
            System.out.println("Please enter X coordinate:");
            xCord = scanner.nextInt();
            System.out.println("Please enter Y coordinate:");
            yCord = scanner.nextInt();
            if (selection.equals("R")) {
                System.out.println(myGrid.revealSquare(xCord,yCord));
            } else if (selection.equals("F")) {
                System.out.println(myGrid.setFlag(xCord,yCord));
            }
        }
        if (myGrid.winner == true) {
            System.out.println("You win!");
        } else {
            System.out.println("Game over!");
        }


    }
}
