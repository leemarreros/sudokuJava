class SudokuBoard {
	
	public void printingArray(int[][] arraySudo){
		for(int x=0; x < arraySudo.length; x++ ){
			if (x == 0) {
				for (int z=1; z <= arraySudo.length; z++) {
					System.out.print("   " + z);
				}
				System.out.println();
				System.out.print(" _");
				for (int z=1; z <= arraySudo.length; z++) {
					System.out.print("____");
				}
				System.out.println();
			}
			System.out.print(x+1);
			for(int y=0; y < arraySudo.length; y++ ){
				System.out.print("| "+ arraySudo[x][y] + " ");
			}
			System.out.println("|");
		}
		System.out.print(" -");
		for (int z=1; z <= arraySudo.length; z++) {
			System.out.print("----");
		}
		System.out.println();
	}
	
}
