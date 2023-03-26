package com.softwareintitute.davis.gareth.minesweeper.tests;

import com.softwareintitute.davis.gareth.minesweeper.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TileTest {

//    Tile testTile = new Tile();

    @Test
    public void test_flag_tile(){
        Tile testTile = new Tile();
        testTile.flagTile();
        assertEquals("F", testTile.toString(), "Tile is not flagged.");
    }

    @Test
    public void test_reveal_tile(){
        Tile testTile = new Tile();
        testTile.revealTile();
        assertEquals("0", testTile.toString(), "Tile has not been revealed.");
    }

//    @Test
//    public void test_set_bomb(){
//        testTile.setABomb(true);
//        testTile.revealTile();
//        assertEquals("B", testTile.toString(), "Tile does not show as bomb.");
//    }
//
//    @Test
//    public void test_not_revealed(){
//        assertEquals("?", testTile.toString(), "Tile shows as revealed.");
//    }
//
//    @Test
//    public void test_increase_neighbour(){
//        testTile.increaseNeighbour();
//        testTile.revealTile();
//        assertEquals("1", testTile.toString(), "Tile does not show neighbour.");
//    }
}
