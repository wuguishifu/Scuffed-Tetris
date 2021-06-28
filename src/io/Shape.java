package io;

public class Shape {

    int[][] relativePositions;

    // tiles always have 4 comps
    int numComps = 4;

    public Shape(int[] xVals, int[] yVals) {
        relativePositions = new int[][]{
                {xVals[0], yVals[0]},
                {xVals[1], yVals[1]},
                {xVals[2], yVals[2]},
                {xVals[3], yVals[3]},
        };
    }

    public int[][] getRelativePositions() {
        return this.relativePositions;
    }

    public static final Shape L = new Shape(
            new int[]{2, 0, 1, 2},
            new int[]{0, 1, 1, 1}
    );

    public static final Shape mL = new Shape(
            new int[]{0, 0, 1, 2},
            new int[]{0, 1, 1, 1}
    );

    public static final Shape S = new Shape(
            new int[]{1, 2, 0, 1},
            new int[]{0, 0, 1, 1}
    );

    public static final Shape Z = new Shape(
            new int[]{0, 1, 1, 2},
            new int[]{0, 0, 1, 1}
    );

    public static final Shape I = new Shape(
            new int[]{0, 1, 2, 3},
            new int[]{0, 0, 0, 0}
    );

    public static final Shape O = new Shape(
            new int[]{0, 1, 0, 1},
            new int[]{0, 0, 1, 1}
    );

    public static final Shape T = new Shape(
            new int[]{0, 1, 2, 1},
            new int[]{0, 0, 0, 1}
    );

    /*

    Tiles:


    L:          mL:         S:         Z:         I:          O:          T:
        *       *             * *      * *        * * * *     * *         * * *
    * * *       * * *       * *          * *                  * *           *


    */

}
