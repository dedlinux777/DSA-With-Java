package AlphaPractice;

public class TwoDArrays {
	
	void spiralMatrixPrint(int arr[][]) {
		int startRow = 0;
		int endRow = arr.length;
		int startCol = 0;
		int endCol = arr[0].length;
		// printing loop:
		while(startRow <= endRow && startCol <= endCol) { // at last all meet's at same index
			//top printing:
			
			for(int j = startCol; j<endCol ; j++) { // columns are changing but row is same
				int i = startRow;
				System.out.print(arr[i][j]+ " ");
			}
			// right:
			for(int i = startRow+1; i < endRow ; i++) { // rows are changing from up to down and col is the same
				int j = endCol - 1;
				System.out.print(arr[i][j]+" ");
			}
			// bottom:
			for(int j = endCol - 2; j >= startCol ; j--) {// column are changing from right to left  (<----) but the row remains same
				int i = endRow-1;
				System.out.print(arr[i][j]+" ");
			}
			// left:
			for(int i = endRow - 2; i > startRow ; i--) { // row changing from bottom to up but the column remains same
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
	
	
	void printDiagonalSum(int arr[][]) {
		int n = arr.length, pdSum=0, sdSum = 0;
		for(int i = 0, j = 0; i < n && j < n;i++, j++) { // for primary diagonal
			pdSum += arr[i][j];
		}
		for(int i = 0, j = n-1; i < n && j >= 0; i++, j--) { // for secondary diagonal
			sdSum += arr[i][j];
		}
		System.out.println("PD+SD sum = "+(pdSum+sdSum));
		
		
		// another approach for calculating in nested loop:
		int sum = 0;
		for(int i = 0; i < n;i++) { // for primary diagonal
			for(int j = 0;j < n;j++) { // for primary diagonal
				if(i==j)sum += arr[i][j];
				if(i+j == n-1) sum += arr[i][j];
			}
		}
		System.out.println("Using nested loop: PD+SD sum = "+sum);
		
		// optimized to n time complexity:
		sum = 0;
		for(int i = 0; i<n ; i++) {
			sum+= arr[i][i];
			if(i != n-1-i)sum+=arr[i][n-1-i]; // because i+j = n-1; j = n-1-i
		}
		System.out.println("Using optimised loop: PD+SD sum = "+sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
