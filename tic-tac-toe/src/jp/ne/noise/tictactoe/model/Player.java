package jp.ne.noise.tictactoe.model;

public class Player {
    public String put(int n, Board board) {
        boolean result = new PutLogic().execute(1, (n-1), board);

        if (! result) {
            return "その場所には置けません";
        }

        return null;
    }

}
