package io;

import main.Tetris;

import javax.swing.*;
import java.util.HashMap;

public class Panel extends JPanel {

    private Tetris tetris;

    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 24;
    private final int[][] grid = new int[GRID_HEIGHT][GRID_WIDTH];

    public static HashMap<String, Integer> pieceCodes;

    public Panel(Tetris tetris) {
        super();
        this.tetris = tetris;

        pieceCodes = new HashMap<>();
        pieceCodes.put("L", 1);
        pieceCodes.put("mL",2);
        pieceCodes.put("S", 3);
        pieceCodes.put("Z", 4);
        pieceCodes.put("I", 5);
        pieceCodes.put("O", 6);
        pieceCodes.put("T", 7);

        for (int x = 0; x < GRID_WIDTH; x++) {
            for (int y = 0; y < GRID_HEIGHT; y++) {
                grid[y][x] = 0;
            }
        }
    }

    public void update() {

    }

    public void buttonPress(int key) {
        switch (key) {

        }
    }

}
