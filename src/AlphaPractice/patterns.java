package AlphaPractice;

public class patterns {
	
	void printHollow(int x) {
		for(int i = 0; i<x;i++) {
			for(int j = 0; j<x;j++) {
				if(i==0 || j==0 || i==x-1 || j == x-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
		System.out.println();
		}
	}
	
	void printInvRotHalfPyramid(int x) {
		for(int i = 1; i<=x;i++) {
			for(int j = 1; j<=x-i;j++) {	
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) {	
				System.out.print("*");
			}
		System.out.println();
		}	
	}
	
	void printInvHalfPyramidnum(int x) {
		for(int i = x; i>=1;i--) {
			for(int j = 1; j<=i;j++) {	
				System.out.print(j);
			}
			for(int j = 1; j<=x-i;j++) {	
				System.out.print(" ");
			}
			
		System.out.println();
		}	
	}
	
	void printFloydsPyramid(int x) {
		int a = 1;
		for(int i = 1; i<=x;i++) {
			for(int j = 1; j<=i;j++) {	
				System.out.print(a++ + " ");
			}
		System.out.println();
		}
	}
	
	void print01Triangle(int x) {
		for(int i = 1; i<=x;i++) {
			for(int j = 1; j<=i;j++) {	
				if((i+j)%2 == 0) {
					System.out.print(1 + " ");
				}else {
					System.out.print(0 + " ");
				}
			}
		System.out.println();
		}
	}
	
	void printButterflyPat(int x) {
		for(int i = 1; i<=x;i++) {
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			for(int j = 1 ; j<=2*(x-i);j++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = x; i>=1;i--) {
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			for(int j = 1 ; j<=2*(x-i);j++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	void printRhombus(int x) {
		for(int i = 1; i<=x;i++) {
			for(int j = 1 ; j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=x;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void printHollowRhombus(int x) {
		for(int i = 1; i<=x;i++) {
			for(int j = 1 ; j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=x;j++) {
				if(i==1 || j==1 || i==x || j == x) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	void printDaimond(int x) {
		for(int i = 1 ; i<=x;i++) {
			for(int j = 1 ; j <= x-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= (2*i)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = x ; i>=1;i--) {
			for(int j = 1 ; j <= x-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= (2*i)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void printNumberPyramid(int x) {
		int a = 1;
		for(int i = 1 ; i<=x;i++) {
			for(int j = 1 ; j <= x-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
	
	void printPaliNumber(int x) {
		for(int i = 1 ; i<=x;i++) {
			for(int j = 1 ; j <= x-i ; j++) {
				System.out.print(" ");
			}
			for(int j = i ; j >= 1 ; j--) {
				System.out.print(j);
			}
			for(int j = 2 ; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
