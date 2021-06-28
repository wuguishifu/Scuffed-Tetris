package io;

import main.Tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class Frame extends JFrame {

    private Tetris tetris;

    private HashMap<Integer, Integer> map;
    boolean[] keysDown;

    @SuppressWarnings("deprecation")
    public Frame(Dimension windowSize, Tetris tetris) {
        // initialize the frame
        super();
        int width = windowSize.width;
        int height = windowSize.height;
        this.setSize(new Dimension(windowSize));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // position the window
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.move(screenSize.width / 2 - width / 2, screenSize.height / 2 - height / 2);

        // add the key listener
        this.addKeyListener(initKeyListener());

        this.tetris = tetris;
    }

    public void addPanel(Panel panel) {
        this.add(panel);
        this.pack();
    }

    private KeyListener initKeyListener() {

        map = new HashMap<>();
        map.put(KeyEvent.VK_W, 0);
        map.put(KeyEvent.VK_A, 1);
        map.put(KeyEvent.VK_S, 2);
        map.put(KeyEvent.VK_D, 3);
        map.put(KeyEvent.VK_SPACE, 4);
        map.put(KeyEvent.VK_COMMA, 5);

        int numKeys = 10;
        keysDown = new boolean[numKeys];
        for (int i = 0; i < numKeys; i++) {
            keysDown[i] = false;
        }

        return new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

                if (keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    tetris.stop();
                }

                if (map.containsKey(keyEvent.getKeyCode())) {
                    keysDown[map.get(keyEvent.getKeyCode())] = true;
                }

                tetris.buttonPress(keyEvent.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                if (map.containsKey(keyEvent.getKeyCode())) {
                    keysDown[map.get(keyEvent.getKeyCode())] = false;
                }
            }
        };
    }
}