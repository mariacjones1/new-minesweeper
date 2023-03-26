package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private int length = 10;
    private int width = 10;
    private int numberOfMines = 10;
    MinesweeperGrid myGrid = new MinesweeperGrid(length, width, numberOfMines);
//    private int xCord;
//    private int yCord;
//    private String selection;
    public boolean winner;

    public void chooseDifficulty() {
        System.out.println("Choose your difficulty: Beginner (1), Intermediate (2) or Expert (3)");
        int difficulty = scanner.nextInt();
        if (difficulty == 1) {
            length = 10;
            width = 10;
            numberOfMines = 10;
        } else if (difficulty == 2) {
            length = 16;
            width = 16;
            numberOfMines = 40;
        } else if (difficulty == 3) {
            length = 16;
            width = 30;
            numberOfMines = 99;
        }
    }

    public void takeTurn() {
        System.out.println(myGrid);
        while (myGrid.runGame) {
            scanner.nextLine();
            System.out.println("Do you want to reveal the square (R) or set a flag (F)?");
            String selection = scanner.nextLine().toUpperCase();
            System.out.println("Please enter X coordinate:");
            int xCord = scanner.nextInt();
            System.out.println("Please enter Y coordinate:");
            int yCord = scanner.nextInt();
            if (selection.equals("R") || selection.equals("F")){
                if (xCord < 0 || xCord >= length || yCord < 0 || yCord >= width){
                    System.out.println("Coordinate out of bounds, please try again.");
                } else if (selection.equals("R")) {
                    System.out.println(myGrid.revealSquare(xCord, yCord));
                } else if (selection.equals("F")) {
                    System.out.println(myGrid.setFlag(xCord, yCord));
                }
            } else {
                System.out.println("Invalid selection, please try again.");
            }

        }
        if (myGrid.winner) {
            winner = true;
        } else {
            winner = false;
        }
    }
}





