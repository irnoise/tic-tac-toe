package jp.ne.noise.tictactoe.view;


public class Display {

	public Display() {
		System.out.println("*************************");
		System.out.println("*      Tic-tac-toe      *");
		System.out.println("*************************");
	}

	public void viewBoard(int[][] hex) {
		int count = 0;

		for (int[] i : hex) {
			for (int j : i) {
				System.out.print(j);
				count++;
				if (count == 3) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
