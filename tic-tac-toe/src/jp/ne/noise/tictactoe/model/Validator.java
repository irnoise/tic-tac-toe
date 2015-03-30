package jp.ne.noise.tictactoe.model;

public class Validator {
    public String validate(String s, int[][] hex) {
        int n = 0;

        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return "0～8までの数字を入力して下さい。";
        }

        if (n < 0 || n > 8) {
            return "0～8までの数字を入力して下さい。";
        }

        int row = n /3;
        int column = n % 3;

        if (hex[row][column] != 0) {
            return "その場所には置けません。";
        }

        return null;
    }
}