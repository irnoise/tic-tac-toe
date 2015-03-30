package jp.ne.noise.tictactoe.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ne.noise.tictactoe.model.Board;
import jp.ne.noise.tictactoe.view.Display;

public class Control {
    public static void main(String[] args) {
        Display display = new Display();
        Board board = new Board();

        display.viewBoard(board.getHex());
    }
}