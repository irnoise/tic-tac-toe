package jp.ne.noise.tictactoe.model;

public class PutLogic {
    public boolean execute(int which, int n, Board board) {
        int[][] hex = board.getHex();
        int row = n / 3;
        int column = n % 3;

        if (hex[row][column] != 0) {
            return false;
        }

        hex[row][column] = which;
        board.setHex(hex);

        return true;
    }
}
