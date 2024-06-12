package exerciciosMatriz;

public class Matriz5x5 {

	public static void main(String[] args) {
		int m[][] = new int [5][5];

		for (int l=0; l<5; l++) {
			for (int c=0; c<5; c++) {
				int num=(int) Math.round(Math.random()*100);
				if (num  %2 == 0) {
					m[l][c] = num;
				}
				else {
					c = 0;
				}
			}
		}
		for (int l=0; l<5; l++) {
			for (int c=0; c<5; c++) {
				System.out.println("Os valores são: " + m[l][c]);
			}
		}
	}

}
