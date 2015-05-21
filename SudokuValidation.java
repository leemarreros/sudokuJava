
public class SudokuValidation {

	public SudokuValidation() {
		// TODO Auto-generated constructor stub
	}

	public void validate(int[][] arraySudo){
		boolean isDuplicated = true;
		int[] arrayHor = new int[arraySudo.length], arrayVer = new int[arraySudo.length];
		thisone:for (int i = 0; i < arraySudo.length; i++){
					arrayHor = arraySudo[i]; //horizontal
					
					for (int n=0; n < arraySudo.length; n++) {   //vertical
						arrayVer[n] = arraySudo[n][i];
					}	
							
					for(int j = 0; j < arraySudo.length; j++){
						for (int k = j+1; k < arraySudo.length;k++)
							if ((arrayHor[j]==arrayHor[k]) | (arrayVer[j]==arrayVer[k])) {
								isDuplicated = true;
								break thisone;
							} else isDuplicated = false;
					}
				}
		if (isDuplicated) 
			System.out.println("No sudoku");
		 else 
			System.out.println("Sudoku");
	}
	
}
