package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        game.chooseDifficulty();
        game.takeTurn();
        if (game.winner == true) {
            System.out.println("You win!");
        } else {
            System.out.println("Game over!");
        }
    }
}
