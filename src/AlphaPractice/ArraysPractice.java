package AlphaPractice;
import java.math.*;
import java.util.*;
public class ArraysPractice {
	void BinarySearch(int arr[], int key) {
	    int low = 0;                 
	    int high = arr.length - 1;    
	    
	    while (low <= high) {
	        int mid = low + (high - low) / 2; 
	        
	        if (arr[mid] == key) {
	            System.out.println("Key found at index: " + mid);
	            return; 
	        } else if (key < arr[mid]) {
	            high = mid - 1; 
	        } else { 
	            low = mid + 1; 
	        }
	    }
	    System.out.println("Key not found");
	}
	
	void BinaryCharSearch(char arr[], char key) {
	    int low = 0; 
	    int high = arr.length - 1; 
	    
	    while(low <= high) {
	        int mid = low + (high - low) / 2; 
	        
	        if (arr[mid] == key) {
	            System.out.println("Key found at index: " + mid);
	            return;
	        } else if (key < arr[mid]) { 
	            high = mid - 1;
	        } else {
	            low = mid + 1; 
	        }
	    }
	    System.out.println("Key not found");
	}
	
	void reverseArray(int arr[]) {
		int first = 0, last = arr.length-1;
		while(first < last) { // while first is not equal to last because the first and last ele would be equal at the end i.e., which is the last remaining ele or in even length array there would be no last remaing ele
			int temp = arr[last];
			arr[last] = arr[first];
			arr[first] = temp;
			first++;last--;
		}
		for(int i : arr) {
			System.out.print(i);
		}
	}
	
	void printTotalPairsOfArray(int arr[]) {
		int tp = 0;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i+1; j < arr.length; j++) {
				System.out.print("{"+i+","+j+"}");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pairs in the array: "+tp);
	}
	
	void printSubArrays(int arr[]) {
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i; j < arr.length; j++) {
				System.out.print("[");
				for(int k = i; k<=j;k++) {
					System.out.print(arr[k]+",");
				}
				System.out.print("]");
			}
			System.out.println();
		}
	}
	
	
	void printMinMaxSubArrays(int arr[]) {
		int minSum=Integer.MAX_VALUE, maxSum=Integer.MIN_VALUE, sum = 0;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i; j < arr.length; j++) {
				sum = 0;
				System.out.print("[");
				for(int k = i; k<=j;k++) {
					System.out.print(arr[k]+",");
					sum = sum + arr[k];
				}
				System.out.print("]="+sum + "  ");
				if(minSum>sum) {
					minSum = sum;
				}else if(maxSum < sum) {
					maxSum = sum;
				}
			}
			System.out.println();
		}
		System.out.println("Minimum sum out of all sub array is: "+minSum+" \nMaximum sum out of all sub array is: "+maxSum);
	}
	
	
	void printMaxSubArrayPrefixSum(int arr[]) {
	    // Initialize maxSum to the smallest possible integer value
	    int maxSum = Integer.MIN_VALUE;
	    // Create and populate the prefix sum array.
	    // prefix[i] stores the sum of all elements from arr[0] to arr[i].
	    int prefix[] = new int[arr.length];
	    prefix[0] = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        prefix[i] = prefix[i - 1] + arr[i];
	    }
	    // Use nested loops to find all possible subarrays and calculate their sum
	    // in O(1) time using the prefix sum array.
	    for (int i = 0; i < arr.length; i++) { // 'i' is the starting index of the subarray
	        for (int j = i; j < arr.length; j++) { // 'j' is the ending index of the subarray
	            int currentSum = 0;
	            // Calculate the sum of the subarray from index 'i' to 'j'.
	            // The formula is: prefix[j] - prefix[i-1].
	            // Handle the case where i is 0 (first element).
	            currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
	            // Update maxSum if the current subarray sum is greater.
	            if (maxSum < currentSum) {
	                maxSum = currentSum;
	            }
	        }
	    }
	    System.out.println("Max Subarray Sum: " + maxSum);
	}
	
	
	public void kadanes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return ; 
		}
		int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend the current subarray or start a new one.
            // A new subarray starts with nums[i] itself.
        	 // If currSum becomes negative, add the largest negative element. 
             // This is because a negative prefix will only decrease the sum of any future subarray.
            currSum = Math.max(nums[i], currSum + nums[i]);
            
            // Update the overall maximum sum found so far.
            maxSum = Math.max(maxSum, currSum);
        }
	}
		    
	public static boolean isSorted(int[] arr) {
        
        if (arr == null || arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
	
	void trappedRainwater(int height[], int width) {
		int n = height.length;
		if (height == null || n <= 2||isSorted(height)){
	        System.out.println("Thier's no trapped Rainwater");
	        return;
	    }
		// calculate left max boundary - 
		int []leftBound = new int[n]; 
		leftBound[0] = height[0];
		for(int i = 1; i<n; i++) {
			leftBound[i] = Math.max(height[i], leftBound[i-1]);
		}
		// calculate right max boundary - 
		int []rightBound = new int[n];
		rightBound[n-1] = height[n-1];
		for(int i = n-2; i >= 0; i--) {
			rightBound[i] = Math.max(height[i], rightBound[i+1]);
		}
		int tW = 0;
		int wL = 0;
		for(int i = 0; i < n;i++) {
			wL = (Math.min(leftBound[i], rightBound[i])); // calculate each bar's water Level
			tW += ((wL) - height[i]) * width; // calculate trapped water
		}
		System.out.println("Trapped Rainwater is: "+ tW);
	}
	
	public boolean elementUniqueness(int arr[]) {
		Arrays.sort(arr);
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1])
				return true;
		}
		return false;
	}
	
	
	void ModifiedBinarySearch(int arr[], int key) {
	    int low = 0;                 
	    int high = arr.length - 1;    // nums = [4, 5, 6, 7, 0, 1, 2], target = 0
	    
	    while (low <= high) {
	        int mid = low + (high - low) / 2; 
	        
	        if (arr[mid] == key) {
	            System.out.println("Key found at index: " + mid);
	            return; 
	        } else if (arr[low] <= arr[mid]) {
	        	if(key>=arr[low] && key<arr[mid]) {
	        		high = mid - 1; 
	        	}
	        	else {
	        		low = mid+1;
	        	}
	        } else { 
	        	if(key>arr[mid] && key<=arr[high]) {
	        		low = mid + 1; 
	        	}
	        	else {
	        		high = mid-1;
	        	}
	        }
	    }
	    System.out.println("Key not found");
	}
	
	
	void buySellStocks(int prices[]) {
		int n = prices.length;
		
		int buyPrice = prices[0]; // initial day buying price, u can't sell the stock at same day, start selling from next day
		int profit = Integer.MIN_VALUE;
		int sellPrice = 0;
		
		for(int i = 1; i<n;i++) {
			sellPrice = prices[i]; // today's selling price
			profit = Math.max(sellPrice-buyPrice, profit); // max profit so far
			buyPrice = Math.min(i, buyPrice);  // minimum buying Price so far
		}
		
		System.out.println("Maximum profit: "+profit+" Buying Price: "+ buyPrice);
	}
	
	
}
