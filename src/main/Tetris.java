package main;

import io.Frame;
import io.Panel;

import java.awt.Dimension;


public class Tetris {

    protected static Dimension windowSize = new Dimension(800, 600);

    private boolean run = true;

    private Frame frame;
    private Panel panel;

    public static void main(String[] args) {
        new Tetris().init();
    }

    public void init() {
        frame = new Frame(windowSize, this);
        panel = new Panel(this);

        frame.add(panel);

        frame.setVisible(true);
        this.run();
    }

    @SuppressWarnings("BusyWait")
    public void run() {

        while (run) {

            this.update();
            panel.repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }

        frame.dispose();
    }

    public void update() {

    }

    public void buttonPress(int key) {
        panel.buttonPress(key);
    }

    public void stop() {
        run = false;
    }

}
