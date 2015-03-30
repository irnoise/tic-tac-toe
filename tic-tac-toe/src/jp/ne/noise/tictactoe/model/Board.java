package jp.ne.noise.tictactoe.model;

public class Board {
    private int[][] hex;

    public Board() {
        hex = new int[3][3];

        for (int[] i : hex) {
            for (int j : i) {
                j = 0;
            }
        }
    }

    public int[][] getHex() {
        return hex;
    }

    public void setHex(int[][] hex) {
        this.hex = hex;
    }

}
