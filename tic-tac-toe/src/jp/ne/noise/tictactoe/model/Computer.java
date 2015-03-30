package jp.ne.noise.tictactoe.model;

public class Computer {
    private static final int RATE = Board.HEX_LENGTH - 1;       // Math.Randomに掛ける倍率(マス目の数-1)

    public void put(Board board) {
        boolean result = true;

        do {
            int n = (int)(Math.random() * RATE + 1);
            result = new PutLogic().execute(4, n, board);
        } while (! result);

    }

}
