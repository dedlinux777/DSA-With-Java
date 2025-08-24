package AlphaPractice;

public class TwoDArrays {
	
	void spiralMatrixPrint(int arr[][]) {
		int startRow = 0;
		int endRow = arr.length;
		int startCol = 0;
		int endCol = arr[0].length;
		// printing loop:
		while(startRow <= endRow && startCol <= endCol) {
			//top printing:
			
			for(int j = startCol; j<endCol ; j++) {
				int i = startRow;
				System.out.print(arr[i][j]+ " ");
			}
			// right:
			for(int i = startRow+1; i < endRow ; i++) {
				int j = endCol - 1;
				System.out.print(arr[i][j]+" ");
			}
			// bottom:
			for(int j = endCol - 2; j >= startCol ; j--) {
				int i = endRow-1;
				System.out.print(arr[i][j]+" ");
			}
			// left:
			for(int i = endRow - 2; i > startRow ; i--) {
				int j = startCol;
				System.out.print(arr[i][j]+" ");
			}			
			
			// increment: 
			startRow++;
			endRow--;
			startCol++;
			endCol--;
			
		}
		
	}
}
