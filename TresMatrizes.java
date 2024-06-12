package exerciciosMatriz;

public class TresMatrizes {

	public static void main(String[] args) {
		int mA[][] = new int [3][3];
		int mB[][] = new int [3][3];
		int mC[][] = new int [3][3];

		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				mA[l][c] = (int)Math.round(Math.random()*100);
				mB[l][c] = (int)Math.round(Math.random()*100);
				mC[l][c] += mA[l][c]*mB[l][c];
			}
		}
		System.out.println("Matriz A: ");
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				System.out.print("[" + mA[l][c] + "]");
			}
		}
		System.out.println();
		System.out.println("Matriz B: ");
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				System.out.print("[" + mB[l][c] + "]");
			}
		}
		System.out.println();
		System.out.println("Matriz C: ");
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				System.out.print("[" + mC[l][c] + "]");
			}
		}
	}

}
