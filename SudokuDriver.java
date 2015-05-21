import java.util.Scanner;

public class SudokuDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SudokuGame sudokugame = new SudokuGame();
		SudokuValidation sudokuvalidation = new SudokuValidation();
		SudokuBoard sudokuboard = new SudokuBoard();
		int[][] arraySudo;
		
		System.out.println("==================WELCOME TO SUDOKU==================");
		System.out.println("Which board size would your like to chose? \n"
				   +"1) 4x4\n"
				   +"2) 9x9");
		int optSize = scanner.nextInt();
		if (optSize == 1) {
			arraySudo =new int[4][4];
		} else {
			arraySudo =new int[9][9];
		}
		sudokuboard.printingArray(arraySudo);
		sudokugame.doGame(arraySudo);
		sudokuvalidation.validate(arraySudo);
	}
	
}
