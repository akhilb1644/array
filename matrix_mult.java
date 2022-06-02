package Matrix;

/* The answer I got from this program when multiplying the two matrices 
was {58,64} in row 1, and {139,154} in the second row. */

// The following program will multiply the two three by three matricies
class matrix_multiplication {
	public static void main(String[] args) {
		int[][] matrix_1 = {
				{1,2,3},
				{4,5,6}
		};
		
		int[][] matrix_2 = {
				{7,8},
				{9,10},
				{11,12}
		};
		
		if (matrix_1[0].length != matrix_2.length) {
			System.out.println("It will come out to be undefined.");
		}
		
		int [][] answer;
		answer = new int[matrix_1.length][matrix_2[0].length];
		int a = 0;
		
		for (int y=0;y<matrix_1.length;y++) {
			for (int c=0;c<matrix_1.length;c++) {
				a = 0; // Making sure that a stays equal to 0
				for (int r=0;r<matrix_2.length;r++) {
					int b = matrix_1[y][r] * matrix_2[r][c];
					a = a + b; // Changes value of a to equal a plus b, works when you need to make a equal to b because a is originally 0
				}
				answer[y][c] = a;
			}
		}
		
		// Next lines print based off of (row,column). Values will start from zero, not 1
		for (int row=0;row<answer.length;row++) {
			for (int column=0;column<answer.length;column++) {
				System.out.print("("+row+","+column+") = "+answer[row][column]+"   ");
			}
		}
	}
}
