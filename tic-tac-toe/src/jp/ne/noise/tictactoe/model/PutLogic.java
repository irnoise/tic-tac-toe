package jp.ne.noise.tictactoe.model;

public class PutLogic {
    public boolean execute(int which, int n, int[][] hex) {
        int row = n /3;
        int column = n % 3;

        if (hex[row][column] != 0) {
            return false;
        }


        return true;
    }
}
