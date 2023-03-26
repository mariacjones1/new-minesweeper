package com.softwareintitute.davis.gareth.minesweeper;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int width = 10;
        int numberOfMines = 10;
        boolean setDifficulty = false;
        System.out.println("Choose your difficulty: Beginner (1), Intermediate (2) or Expert (3)");
        while (!setDifficulty) {
            try {
                int difficulty = scanner.nextInt();
                if (difficulty == 1) {
                    setDifficulty = true;
                } else if (difficulty == 2) {
                    length = 16;
                    width = 16;
                    numberOfMines = 40;
                    setDifficulty = true;
                } else if (difficulty == 3) {
                    length = 16;
                    width = 30;
                    numberOfMines = 99;
                    setDifficulty = true;
                } else {
                    System.out.println("Invalid number, please try again.");
                }
            }
            catch (Exception e) {
                System.out.println("Input must be a number, please try again.");
                scanner.nextLine();
            }
        }

        MinesweeperGrid myGrid = new MinesweeperGrid(length, width, numberOfMines);
        System.out.println(myGrid);
        while (myGrid.runGame){
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
                } else {
                    System.out.println(myGrid.setFlag(xCord, yCord));
                }
            } else {
                System.out.println("Invalid selection, please try again.");
            }
        }
        if (myGrid.winner) {
            System.out.println("You win!");
        } else {
            System.out.println("Game over!");
        }
    }
}
