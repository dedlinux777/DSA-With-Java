package practiceDSA;
//4. Median of Two Sorted Arrays
//Hard
//Topics
//Companies
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
// 
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// 
//
//Constraints:
//
//nums1.length == m
//nums2.length == n
//0 <= m <= 1000
//0 <= n <= 1000
//1 <= m + n <= 2000
//-106 <= nums1[i], nums2[i] <= 106 

public class medianOfArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        int m = nums1.length;
        int n = nums2.length;
        int [] temp = new int[n+m];
        double median = 0;
        int mid1;
        int mid2;
        
        while(i<m && j<n) {
        	if(nums1[i] <= nums2[j]){
        		temp[k++] = nums1[i++];
        	}else if(nums1[i] > nums2[j]) {
        		temp[k++] = nums2[j++];
        	}
        }
        
        while(i<m) {
        		temp[k++] = nums1[i++];
        }
        while(j<n) {
    		temp[k++] = nums2[j++];
        }
        
        if((m+n)%2 == 0) {
        	mid1 = temp[(m+n)/2];
        	mid2 = temp[((m+n)/2)-1];
        	median = (mid1+ mid2)/2.0;
        	return median;
        }else {
        	median = temp[(m+n)/2];
        	return median;
        }
        
    }
}
