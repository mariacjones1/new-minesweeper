package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MinesweeperGrid myGrid = new MinesweeperGrid(2,2,1);
        Scanner scanner = new Scanner(System.in);
        int xCord;
        int yCord;
        String selection;
        System.out.println(myGrid);
        while (myGrid.runGame) {
            System.out.println("Please enter X coordinate:");
            xCord = scanner.nextInt();
            System.out.println("Please enter Y coordinate:");
            yCord = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Do you want to reveal the square (R) or set a flag (F)?");
            selection = scanner.nextLine().toUpperCase();
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
