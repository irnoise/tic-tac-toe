/**
 * マス目の状態をhexに保存する
 * int[][] getHex()
 * void    setHex(int[][] hex)
 */

package jp.ne.noise.tictactoe.model;

public class Board {
    public static final int ROW_LENGTH      = 3;                            // 行の数
    public static final int COLUMN_LENGTH   = 3;                            // 列の数
    public static final int HEX_LENGTH      = ROW_LENGTH * COLUMN_LENGTH;   // マス目の数
    private int[][] hex;

    public Board() {
        hex = new int[ROW_LENGTH][COLUMN_LENGTH];

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
