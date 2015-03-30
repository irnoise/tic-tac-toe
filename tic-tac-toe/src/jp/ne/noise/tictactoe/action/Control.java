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

        display.showBoard(board);

        while (true) {
            display.showMessage("◆ Playerの手番です ◆");
            display.showMessage("1～9までの数字を入力してEnterキーを押して下さい");

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

            errorMsg = player.put(Integer.parseInt(s), board);
            if (errorMsg != null) {
                display.showErrorMessage(errorMsg);
                continue;
            }

            display.showBoard(board);

            display.showMessage("◆ Computerの手番です ◆");
            computer.put(board);
            display.showBoard(board);
        }

    }


}