package AlphaPractice;
import java.util.*;
public class basicSorting {
	
	void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp;
		for(int i = 0; i < n-1;i++) {
			for(int j = 0; j < n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	void selectionSort(int arr[]) {
		int n = arr.length;
		int minPos, temp;
		for(int i = 0; i < n-1 ; i++) {
			minPos = i;
			for(int j = i+1 ; j < n; j++) {
				if(arr[minPos] > arr[j])
					minPos = j;
			}
			temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	void insertionSort(int arr[]) {
		int n = arr.length;
		int j, k;
		for(int i = 1; i < n; i++ ) {
			k =  arr[i];
			j = i-1;
			while(j>=0 && arr[j]>k) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = k;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	void countingSort(int arr[]) {
		int n = arr.length;
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++) {
			largest = Math.max(largest, arr[i]);
		}
		// counting and storing frequency
		int count[] = new int[largest+1];
 		for(int i = 0; i < n; i++) { 
 			count[arr[i]]++;  // at the index arr[i] in the count array appears then increment it
 		}
 		// sorting: 
 		int j = 0, k;
 		for(int i = 0 ; i<n ; i++) {
 			k = i; // temp k to store the index
 			while(count[k]!=0) { // until the kth index ele becomes 0
 				arr[j++] = k; // append the kth index into the arr[j++] 
 				count[k]--; // decrement the value at kth index so that it becomes 0
 			}
 		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}
