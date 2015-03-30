package jp.ne.noise.tictactoe.model;

public class Computer {
    public void put(Board board) {
        boolean result = true;

        do {
            int n = (int)(Math.random() * 8 + 1);
            result = new PutLogic().execute(4, n, board);
        } while (! result);
    }

}
