/*
 * Playerの入力値チェック
 */

package jp.ne.noise.tictactoe.model;

public class Validator {
    public String validate(String s, Board board) {
        int n = 0;

        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return "1～" + Board.HEX_LENGTH + "までの数字を入力して下さい";
        }

        if (n < 1 || n > 9) {
            return "1～" + Board.HEX_LENGTH + "までの数字を入力して下さい";
        }

        return null;
    }
}