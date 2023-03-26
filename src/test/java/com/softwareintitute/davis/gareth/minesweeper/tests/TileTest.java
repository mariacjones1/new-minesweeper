package com.softwareintitute.davis.gareth.minesweeper.tests;

import com.softwareintitute.davis.gareth.minesweeper.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TileTest {

    @Test
    void test_flag_tile(){
        Tile testTile = new Tile();
        testTile.flagTile();
        assertEquals("F", testTile.toString(), "Tile is not flagged.");
    }

    @Test
    void test_reveal_tile(){
        Tile testTile = new Tile();
        testTile.revealTile();
        assertEquals("0", testTile.toString(), "Tile has not been revealed.");
    }

    @Test
    void test_set_bomb(){
        Tile testTile = new Tile();
        testTile.setABomb(true);
        testTile.revealTile();
        assertEquals("B", testTile.toString(), "Tile does not show as bomb.");
    }

    @Test
    void test_not_revealed(){
        Tile testTile = new Tile();
        assertEquals("?", testTile.toString(), "Tile shows as revealed.");
    }

    @Test
    void test_increase_neighbour(){
        Tile testTile = new Tile();
        testTile.increaseNeighbour();
        testTile.revealTile();
        assertEquals("1", testTile.toString(), "Tile does not show neighbour.");
    }
}
