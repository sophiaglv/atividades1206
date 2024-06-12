package exerciciosMatriz;

public class Diagonal {

	public static void main(String[] args) {
		int m[][] = new int [4][4];

		for (int l=0; l<4; l++) {
			for (int c=0; c<4; c++) {
				if (l == c) {
					m[l][c] = (int)Math.round(Math.random()*100);
					System.out.print("[" + m[l][c] + "]");

				}
				else {
					m[l][c] = 0;
					System.out.print("[" + m[l][c] + "]");
				}
			}
			System.out.println();
		}
	}

}
