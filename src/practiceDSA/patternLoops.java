package practiceDSA;

public class patternLoops {
//	problem - 1
//	Problem Statement: Given an integer N, print the following pattern.
//	Examples:
//
//		Example 1:
//		Input: N = 3
//		Output: 
//		* * *
//		* * *
//		* * *
//
//
//		Example 2:
//		Input: N = 6
//		Output:
//		* * * * * *
//		* * * * * *
//		* * * * * *
//		* * * * * *
//		* * * * * *
//		* * * * * *
	
	
	void pat_1(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

//	
//	Problem Statement: Given an integer N, print the following pattern : 
//
//		Here, N = 5.
//
//		Examples:
//
//		Input Format: N = 3
//		Result: 
//		* 
//		* * 
//		* * *
//
//		Input Format: N = 6
//		Result:
//		* 
//		* * 
//		* * *
//		* * * *
//		* * * * *
//		* * * * * *
//	
	
	void pat_2(int n) {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	
//	
//	Problem Statement: Given an integer N, print the following pattern : 
//
//		ere, N = 5.
//
//		Examples:
//
//		Input Format: N = 3
//		Result: 
//		1
//		1 2 
//		1 2 3
//
//		Input Format: N = 6
//		Result:
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
	
	void pat_3(int n) {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 1; j <= i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
	
//	Problem Statement: Given an integer N, print the following pattern : 
//
//		examples:
//
//			Input Format: N = 3
//			Result: 
//		 	1
//			2 2 
//			3 3 3
//
//			Input Format: N = 6
//			Result:
//			1
//			2 2
//			3 3 3
//			4 4 4 4
//			5 5 5 5 5
//			6 6 6 6 6 6
//
	
	void pat_4(int n) {
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("\n");
		}
	}
	
	
//	Problem Statement: Given an integer N, print the following pattern : 
//
//
//	Examples:
//
//		Input Format: N = 3
//		Result: 
//		* * *
//		* * 
//		*
//
//		Input Format: N = 6
//		Result:
//		* * * * * *
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
	
	
	void pat_5(int n) {
		for(int i = 0 ; i < n ; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	
	
//	Problem Statement: Given an integer N, print the following pattern : 
//
//		xamples:
//
//			Input Format: N = 3
//			Result: 
//			1 2 3
//			1 2
//			1
//
//			Input Format: N = 6
//			Result:
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2 
//			1
	
	void pat_6(int n) {
		for(int i = n ; i > 0 ; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
	
//	Problem Statement: Given an integer N, print the following pattern : 
//
//		examples:
//
//			Input Format: N = 3
//			Result: 
//			  *  
//			 *** 
//			*****   
//			Input Format: N = 6
//			Result:
//			     *     
//			    ***    
//			   *****   
//			  *******  
//			 ********* 
//			***********
	
	void pat_7(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0;j < n-i-1; j++)
				System.out.print(" ");
			
			for(int j = 0; j < 2*i+1 ; j++)
				System.out.print("*");
			
			for(int j = 0;j < n-i-1; j++)
				System.out.print(" ");
			System.out.println();
		}
		
	}
	
//	inverse of pattern 7:
	
	void pat_8(int n) {
		
		for (int i = n-1 ; i >= 0; i--)
	    {
	       
	        for (int j =n-i-1;  j > 0; j--)
	        {
	            System.out.print(" ");
	        }
	       
	     
	        for(int j=2*i+1; j > 0;j--){
	            
	            System.out.print("*");
	        }
	        
	        
	         for (int j = n-i-1; j > 0; j--)
	        {
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	

	void pat_9(int n) {
		for(int i = 0; i < 2*n ; i++) {
			for(int j = 0;j < n-i-1; j++)	
				System.out.print(" ");
			
			for(int j = 0; j < 2*i+1 ; j++)
				System.out.print("*");
			
			for(int j = 0;j < n-i-1; j++)
				System.out.print(" ");
			System.out.println();
		}
		
	}
	
	
//	Here, N = 5.
//
//			Examples:
//
//			Input Format: N = 3
//			Result: 
//			  *  
//			  **
//			  ***  
//			  **
//			  *   
//			Input Format: N = 6
//			Result:   
//			     *
//			     **
//			     *** 
//			     ****
//			     *****
//			     ******  
//			     *****
//			     ****
//			     ***    
//			     **
//			     *
	void pat_10(int n) {
		for(int i = 0; i < 2*n-1; i++){
			if(i < n) {
				for(int j = 0; j < n; j++)
					System.out.print("*");
			}else {
				for(int j = 0 ; j < 2*n- i; j++) 
					System.out.print("*");	
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


