package com.softwareintitute.davis.gareth.minesweeper;


public class Tile {

    private boolean isRevealed;

    private boolean isFlagged;

    private boolean isABomb;

    private int numberOfNeighbouringMines;

    public Tile(){
        this.isRevealed = false;
        this.isFlagged = false;
        this.isABomb = false;
        this.numberOfNeighbouringMines = 0;
    }

    public void flagTile(){
        if(!isRevealed){
           isFlagged = !isFlagged;
        }
    }

    public void revealTile(){
        if(!isRevealed){
            isRevealed = true;
        }
    }

    public void setABomb(boolean ABomb) {
        isABomb = ABomb;
    }


    public void increaseNeighbour(){
        numberOfNeighbouringMines++;
     }

    public boolean isABomb() {
        return isABomb;
    }


    @Override
    public String toString() {
        if (!isRevealed){
            return (isFlagged)?"F":"?";
        }
        else if (isABomb){
            return "B";
        }
        else{
            return ""+numberOfNeighbouringMines;
        }
    }
}
