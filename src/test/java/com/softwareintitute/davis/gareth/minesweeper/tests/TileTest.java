package com.softwareintitute.davis.gareth.minesweeper.tests;

import com.softwareintitute.davis.gareth.minesweeper.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TileTest {

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

    @Test
    public void test_set_bomb(){
        Tile testTile = new Tile();
        testTile.setABomb(true);
        testTile.revealTile();
        assertEquals("B", testTile.toString(), "Tile does not show as bomb.");
    }

}
