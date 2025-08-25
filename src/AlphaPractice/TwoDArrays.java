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
			sum+= arr[i][i]; // all primary diagonal values are have the same row and columns
			if(i != n-1-i)sum+=arr[i][n-1-i]; // because i+j = n-1; j = n-1-i
		}
		System.out.println("Using optimised loop: PD+SD sum = "+sum);
		
	}
	
	
	void searchSortedMatrix(int arr[][], int key) {
		int n = arr.length;
		int i = 0; // row
		int j = n-1; // column
		
		while(i <= n-1 && j >= 0) {
			if(key == arr[i][j]) {
				System.out.println("Key found at index: ("+i+","+j+")");
				return;
			}else if(key < arr[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("Key Not Found");
	}
	
	// practice questions:
	
	// q1:
//	Print the number of 7’s that are
//	in the 2d array.Example :
//	Input - int array = ( (4,7,8},(8,8,7} };
//	Output - 2
	
	void printNumOfSevens(int arr[][]) {
		int count = 0 ;
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr.length; j++) {
				if(arr[i][j] == 7) {
					count++;
					System.out.println(arr[i][j]+" ");
				}
			}
		}
		System.out.println("Count:  "+ count);
	}
	
	
//	Question 2 : Print out the sum of the numbers in the second row of the “nums" array.
//	Example :
//	Input - int nums = ( (1,4,9},(11,4,3},{2,2,3} };
//	Output - 18
	
	void printSumofSecondRow(int arr[][]) {
		int sum = 0, i = 1;
		for(int j = 0; j < arr.length; j++) {
			sum += arr[i][j];
		}
		System.out.println("Sum of 2nd row "+ sum);
	}
	
	
	
//	Question 3 : Write a program to Find Transpose of Matrix
//	What is Transpose? Transpose of a matrix is the process of swapping the rows to columns.
//	For a 2x3 matrix,
//	Matrix
//	a11 a12 a13
//	a21 a22 a23
//	Transposed Matrix
//	a11 a21
//	a12 a22
//	a13 a23

	void transposeOfMatrix(int arr[][]) {
		int n = arr.length; // rows
		int m = arr[0].length; // columns
		
		int transposedArr[][] = new int[m][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j<m ; j++) {
				transposedArr[j][i] = arr[i][j];
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0 ; j<n ; j++) {
				System.out.print(transposedArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	
	
	
}
