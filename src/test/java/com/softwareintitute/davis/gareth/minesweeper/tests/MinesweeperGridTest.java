package com.softwareintitute.davis.gareth.minesweeper.tests;

import com.softwareintitute.davis.gareth.minesweeper.MinesweeperGrid;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinesweeperGridTest {

    @Test
    public void test_reveal_square(){
        MinesweeperGrid testGrid = new MinesweeperGrid(2, 2, 1);
        assertEquals("1?\n??\n", testGrid.revealSquare(0, 0), "Square not revealed");
    }

    @Test
    public void test_set_flag(){
        MinesweeperGrid testGrid = new MinesweeperGrid(2, 2, 1);
        assertEquals("F?\n??\n", testGrid.setFlag(0, 0), "Flag not set");
    }

    @Test
    public void test_win_game(){
        MinesweeperGrid testGrid = new MinesweeperGrid(2, 2, 1);
        testGrid.winGame();
        assertTrue(testGrid.winner, "User not declared winner.");
        assertFalse(testGrid.runGame, "Game not ended.");
    }

    @Test
    public void test_game_over(){
        MinesweeperGrid testGrid = new MinesweeperGrid(2, 2, 1);
        testGrid.gameOver();
        assertFalse(testGrid.winner, "User not declared loser.");
        assertFalse(testGrid.runGame, "Game not ended.");
    }
}
