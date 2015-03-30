package jp.ne.noise.tictactoe.model;

public class PutLogic {
    public boolean execute(int which, int n, Board board) {
        int[][] hex = board.getHex();
        int row = n / Board.ROW_LENGTH;
        int column = n % Board.COLUMN_LENGTH;

        if (hex[row][column] != 0) {
            return false;
        }

        hex[row][column] = which;
        board.setHex(hex);

        return true;
    }
}
