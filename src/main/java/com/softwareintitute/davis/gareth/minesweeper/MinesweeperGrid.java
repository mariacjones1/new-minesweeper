package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Random;

public class MinesweeperGrid {


    private int width;
    private int length;
    private Tile[][] board;
    private int numberOfMines;
    private int numberOfRevealedSquares = 0;
    public boolean runGame = true;
    public boolean winner = true;

    public MinesweeperGrid(int length,int width, int numberOfMines){
        this.length = length;
        this.width = width;
        this.numberOfMines = numberOfMines;
        board = new Tile[this.length][this.width];
        initialiseTiles();
        placeMines();
        calculateNeighbours();
    }

    private void initialiseTiles() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                board[i][j] = new Tile();
            }
        }
    }

    private void placeMines(){
        int bombsPlaced = 0;
        Random randomNumber = new Random();
        int currentX;
        int currentY;
        while(bombsPlaced < numberOfMines){
            currentX = randomNumber.nextInt(length);
            currentY = randomNumber.nextInt(width);
            if (!board[currentX][currentY].isABomb()) {
                board[currentX][currentY].setABomb(true);
                bombsPlaced++;
            }
        }
    }

    private void calculateNeighbours(){
        for(int i = 0; i <this.length ; i++) {
            for (int j = 0; j < this.width; j++) {
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if(x<0||y<0||x>=length||y>=width){//checks to see if the tile is out of bounds and we only count when in bounds

                        }
                        else if(x==i&&y==j){//we don't want to count the center square

                        }
                        else{
                            if(board[x][y].isABomb()){
                                board[i][j].increaseNeighbour();
                            }
                        }

                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <this.length ; i++) {
            for (int j = 0; j < this.width; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String revealSquare(int xCord, int yCord){
        board[xCord][yCord].revealTile();
        numberOfRevealedSquares++;
        if(board[xCord][yCord].isABomb()){
            gameOver();
        } else if (numberOfRevealedSquares == ((length * width) - numberOfMines)) {
            winGame();
        }
        return this.toString();
    }

    public String setFlag(int xCord, int yCord){
        board[xCord][yCord].flagTile();
        return this.toString();
    }

    public String winGame(){
        for(int i = 0; i <this.length ; i++) {
            for (int j = 0; j < this.width; j++) {
                if (board[i][j].isABomb()){
                    board[i][j].flagTile();
                }
            }
        }
        runGame = false;
        winner = true;
        return this.toString();
    }

    public String gameOver(){
        for(int i = 0; i <this.length ; i++) {
            for (int j = 0; j < this.width; j++) {
                board[i][j].revealTile();
            }
        }
        runGame = false;
        winner = false;
        return this.toString();
    }
}
