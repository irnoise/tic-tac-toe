package jp.ne.noise.tictactoe.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ne.noise.tictactoe.model.Board;
import jp.ne.noise.tictactoe.model.Computer;
import jp.ne.noise.tictactoe.model.Player;
import jp.ne.noise.tictactoe.model.Validator;
import jp.ne.noise.tictactoe.view.Display;

public class Control {
    public static void main(String[] args) {
        Display display = new Display();
        Board board = new Board();
        Player player = new Player();
        Computer computer = new Computer();
        Validator validator = new Validator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        /*
         * ゲーム開始
         */
        display.showBoard(board.getHex());

        /*
         * Playerの手番
         */

        /*
         * Computerの手番
         */
        while (true) {

            display.showMessage("0～8までの数字を入力してEnterキーを押して下さい。");

            try {
                s = reader.readLine();
            } catch (IOException e) {
                display.showErrorMessage("入力エラー");
                System.exit(0);
            }

            String errorMsg = validator.validate(s, board.getHex());
            if (errorMsg != null) {
                display.showErrorMessage(errorMsg);
                continue;
            }

            int[][] hex = player.put(Integer.parseInt(s), board.getHex());
            board.setHex(hex);
            display.showBoard(board.getHex());

            display.showMessage("Computerの手番です...");
            hex = computer.put(0, board.getHex());
            board.setHex(hex);
            display.showBoard(board.getHex());
        }

    }


}