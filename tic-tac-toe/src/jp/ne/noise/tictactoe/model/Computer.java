package jp.ne.noise.tictactoe.model;

public class Computer {
    public void put(Board board) {
        int rate = Board.ROW_LENGTH * Board.COLUMN_LENGTH - 1;
        boolean result = true;

        do {
            int n = (int)(Math.random() * rate + 1);
            result = new PutLogic().execute(4, n, board);
        } while (! result);
    }

}
