package matrix;

public class Matrix {

	public static void main(String[] args) {
//		initializing matrix mtx1
		int mtx1[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
//		initializing matrix mtx2		
		int mtx2[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
//		declaring matrix mtx3
		int mtx3[][] = new int[3][3];
		
	// calling addMatrix method	
		mtx3 = addMatrix(mtx1, mtx2);
		printMatrix(mtx3); //printing matrix
	}
	
	public static void printMatrix(int mtx[][]) {
		for (int i = 0; i < 3; i++) { //for row
					for (int j = 0; j < 3; j++) { //for column
						System.out.print(mtx[i][j]+" ");
					}
					System.out.println(); //changing line
				}
	}

	public static int[][] addMatrix(int mtx1[][], int mtx2[][]) {
		int mtx3[][] = new int[3][3]; 
		for (int i = 0; i < 3; i++) { //for row 
			for (int j = 0; j < 3; j++) {// for column
				mtx3[i][j] = mtx1[i][j] + mtx2[i][j];
			}
		}		
		return mtx3; //returning matrix 
	}
}
