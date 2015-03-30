package jp.ne.noise.tictactoe.model;

public class Computer extends Human {

    @Override
    public int[][] put(int n, int[][] hex) {
        String errorMsg;

        do {
            n = (int)(Math.random() * 8);
            errorMsg = new Validator().validate(Integer.toString(n), hex);
        } while (errorMsg != null);

        int row = n /3;
        int column = n % 3;

        hex[row][column] = 2;

        return hex;
    }

}
