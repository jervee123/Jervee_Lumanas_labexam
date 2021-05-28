
class jerv3 {
	public static void main(String[] args) {
		char [][] games = new char [4][4];
		games [0][0] = 'S';
		games [0][1] = 'S';
		games [1][1] = 'O';
		games [2][1] = 'S';
		games [0][2] = 'O';
		games [3][2] = 'O';
		games [1][3] = 'S';
		games [3][3] = 'S';

		for (int row=0; row<=3; row++){
			for (int col=0; col<=3; col++){
				System.out.print(row + "" + col + "=" + games[row][col] + " ");
			}
			System.out.println();
		}
	}
}