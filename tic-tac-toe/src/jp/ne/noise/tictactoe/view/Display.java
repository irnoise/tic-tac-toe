/*
 * コンソール画面の表示を管理
 */

package jp.ne.noise.tictactoe.view;

import jp.ne.noise.tictactoe.model.Board;

public class Display {                                      /*０    １   ２  ３   ４*/
    private final static String SHAPE[] = {"□", "○", "", "", "☓"};

    public Display() {
        System.out.println("*************************");
        System.out.println("*      Tic-tac-toe      *");
        System.out.println("*************************");
    }

    public void showBoard(Board board) {
        int[][] hex = board.getHex();

        showBlank();

        for (int[] i : hex) {
            for (int j : i) {
                System.out.print(SHAPE[j]);
            }
            showBlank();
        }

        showBlank();
    }

    public void showBlank() {
        System.out.println();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showErrorMessage(String message) {
        System.out.println(message);
        showBlank();
    }

}
