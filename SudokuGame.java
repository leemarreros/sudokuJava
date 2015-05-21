import java.util.Scanner;


public class SudokuGame {

	public SudokuGame() {
		// TODO Auto-generated constructor stub
	}

	public void doGame(int[][] arraySudo){
		String [] arrAnswerSplit;
		boolean rigthAnswer =true;
		SudokuBoard sudokuboard = new SudokuBoard();
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Which way would you use to enter the data? \n"
				+ "1) Row\n"
				+ "2) Column");
		int optData = scanner.nextInt();
		
		if (optData == 1){
			int i = 0;
			while (i < arraySudo.length){
				if (rigthAnswer) {i++;}
				System.out.println("Please, enter values for row " + i);
				String arrAnswerStr = scanner.next();
				arrAnswerSplit = arrAnswerStr.split(",");
				int z = 1;
				while (z <= arrAnswerSplit.length) {
					if ( ( Integer.parseInt(arrAnswerSplit[z-1]) > arraySudo.length)
							|| (Integer.parseInt(arrAnswerSplit[z-1]) < 1)) {
						System.out.printf("The number must be between 1 and %d. Try again.", arraySudo.length);
						rigthAnswer = false;
						break;	
					} else {
						arraySudo[i-1][z-1] = Integer.parseInt(arrAnswerSplit[z-1]);
						z++;
						rigthAnswer = true;
						}
				}
				sudokuboard.printingArray(arraySudo);
			}
		} else {
			int i = 0;
			while (i < arraySudo.length){
				if (rigthAnswer) {i++;}
				System.out.println("Please, enter values for column " + i);
				String arrAnswerStr = scanner.next();
				arrAnswerSplit = arrAnswerStr.split(",");
				int z = 1;
				while (z <= arrAnswerSplit.length) {
					if ( ( Integer.parseInt(arrAnswerSplit[z-1]) > arraySudo.length)
							|| (Integer.parseInt(arrAnswerSplit[z-1]) < 1)) {
						System.out.printf("The number must be between 1 and %d. Try again.", arraySudo.length);
						rigthAnswer = false;
						break;	
					} else {
						arraySudo[z-1][i-1] = Integer.parseInt(arrAnswerSplit[z-1]);
						z++;
						rigthAnswer = true;
						}
				}
				sudokuboard.printingArray(arraySudo);
			}
		}
	}
}
